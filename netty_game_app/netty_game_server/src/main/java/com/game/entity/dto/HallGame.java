package com.game.entity.dto;

import com.game.entity.GameJack;
import lombok.Builder;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: wx
 * @Date: 上午 10:40 2019/12/27 0027
 * @Desc: 游戏大厅配置
 * @version:
 */
@Data
@Builder
public class HallGame {

    private Integer channel;

    private Integer gameId;

    private GameJack gameJack;

    private Map<Integer,Room> roomMap = new HashMap<>();

}
