package com.game.socket.server;

import com.game.entity.ServerInfoConfig;

import javax.net.ssl.SSLException;
import java.security.cert.CertificateException;

/**
 * @Author: wx
 * @Date: 下午 7:33 2019/12/23 0023
 * @Desc:
 * @version:
 */
public interface NettyServer{
    
    /**
     * @Author: @
     * @Desc: 启动服务器
     * @Date: 下午 12:01 2019/12/27 0027
     * @Param serverInfoConfig
     */
    void startNetty(ServerInfoConfig serverInfoConfig) throws CertificateException, SSLException;
}
