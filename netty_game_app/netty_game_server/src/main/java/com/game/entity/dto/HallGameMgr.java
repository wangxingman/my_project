package com.game.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * @Author: wx
 * @Date: 下午 5:12 2019/12/27 0027
 * @Desc: 游戏内部配置
 * @version:
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HallGameMgr {

    private Map<Integer,HallGame> hallGameMap;

    private List<Player> playerList;
}
