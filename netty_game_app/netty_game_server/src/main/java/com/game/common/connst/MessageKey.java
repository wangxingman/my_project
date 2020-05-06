package com.game.common.connst;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @Author: @
 * @Desc:
 * @Date: 上午 11:47 2020/1/6 0006
 * @Version: 0.1
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum MessageKey {


    /**
     * 用户加入大厅返回
     */
    SERVER_CONFIGS(1003,"用户加入大厅返回");

    private Integer key;
    private String name;
}