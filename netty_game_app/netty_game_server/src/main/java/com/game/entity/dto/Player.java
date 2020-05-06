package com.game.entity.dto;

import com.game.entity.base.BaseRole;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: wx
 * @Date: 上午 10:28 2019/12/27 0027
 * @Desc: 真实用户
 * @version:
 */
@Data
public class Player extends BaseRole implements Serializable {
    
    public Player(Integer userId) {
        this.setUserId(userId);
    }
}
