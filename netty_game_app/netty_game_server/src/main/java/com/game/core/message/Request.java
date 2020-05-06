package com.game.core.message;

import com.alibaba.fastjson.JSON;
import com.game.socket.netty.WebSocketManager;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;
import java.util.Objects;

/**
 * @Author: wx
 * @Date: 下午 3:01 2020/1/2 0002
 * @Desc:
 * @version:
 */
@Data
@Slf4j
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Request {

    private ChannelHandlerContext channelHandlerContext;

    private Long sessionId;

    private Integer userId;

    private Integer channel;

    private Date updateTime;

    private Date currentTime;
    /**切换后台*/
    private int onBack = 1;
    
    /**
     * @Author: @
     * @Desc:  关闭
     * @Date: 上午 11:21 2020/1/6 0006
     * @param:
     * @Return:
     */
    public ChannelFuture close() {
        Request request = WebSocketManager.getWebSocket(userId);
        if (Objects.nonNull(request) && request.getSessionId().equals(sessionId) ) {
            WebSocketManager.remove(this);// 根据SessionId来清除WebSocket
        }
        ChannelFuture channelFuture = channelHandlerContext.channel().close();
        channelFuture.addListener(ChannelFutureListener.CLOSE);
        //debug 模式用户回调 用户关闭连接信息
        if (log.isDebugEnabled()) {
            log.debug("close websocket, userId=" + userId + " sessionId:" + this.sessionId);
        }
        return channelFuture;
    }

    /**
     * @Author: @
     * @Desc: 发送消息二进制
     * @Date: 上午 11:54 2020/1/6 0006
     * @param:
     * @Return:
     */
    public ChannelFuture sendAndFlush(ByteBuf byteBuf) {
        BinaryWebSocketFrame binaryWebSocketFrame = new BinaryWebSocketFrame(byteBuf);
        ChannelFuture channelFuture = channelHandlerContext.channel().writeAndFlush(binaryWebSocketFrame);
        channelFuture.addListener(new ChannelFutureListener() {
            @Override
            public void operationComplete(ChannelFuture future) throws Exception {
                log.info("发送消息成功  userId:{} sessionId:{}",userId,sessionId);
            }
        });
        return channelFuture;
    }
    
    /**
     * @Author: @
     * @Desc: 发送消息
     * @Date: 下午 1:58 2020/1/6 0006
     * @param:
     * @Return:
     */
    public ChannelFuture sendAndFluh(DataPacket dataPacket) {
        //不发送消息的协议
        if (this.onBack == 0 && dataPacket.getCmd() != 2015  && dataPacket.getCmd() != 3001) {
            return null;
        }
        ChannelFuture future = channelHandlerContext.channel().writeAndFlush(new TextWebSocketFrame(JSON.toJSONString(dataPacket)));
        if (log.isDebugEnabled()) {
            log.debug("发送消息  cmd:{} userId:{} sessionId:{}",dataPacket.getCmd(),userId,sessionId);
        }
        return future;
    }
}
