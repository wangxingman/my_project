package com.game.core.message;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: wx
 * @Date: 下午 6:38 2020/1/3 0003
 * @Desc:
 * @version:
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestMessageData {

    private Request request;

    private DataPacket dataPacket;
}
