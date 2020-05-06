package com.game.message;

import lombok.Data;

/**
 * @Author: wx
 * @Date: 下午 9:06 2019/12/20 0020
 * @Desc:
 * @version:
 */
@Data
public class NetMessageHead {


    public static final short MESSAGE_HEADER_FLAG = 0x2425;

    /**
     * 魔法头
     */
    private short head;
    /**
     * 版本号
     */
    private byte version;
    /**
     * 长度
     */
    private int length;
    /**
     * 命令
     */
    private short cmd;
    /**
     * 序列号
     */
    private int serial;

    public NetMessageHead(){
        this.head = MESSAGE_HEADER_FLAG;
    }

}
