package com.game.core.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: wx
 * @Date: 上午 9:51 2019/12/24 0024
 * @Desc:
 * @version:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NetMessageBody {

    private byte[] bytes;

}
