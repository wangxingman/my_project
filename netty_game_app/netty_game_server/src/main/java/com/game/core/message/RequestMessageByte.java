package com.game.core.message;

import io.netty.buffer.ByteBuf;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: wx
 * @Date: 下午 5:22 2020/1/3 0003
 * @Desc:
 * @version:
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestMessageByte {

    private Request request;

    private ByteBuf byteBuf;
}
