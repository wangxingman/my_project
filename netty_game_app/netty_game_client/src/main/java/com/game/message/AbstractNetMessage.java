package com.game.message;

import lombok.Data;

/**
 * @Author: wx
 * @Date: 下午 9:06 2019/12/20 0020
 * @Desc:
 * @version:
 */
@Data
public class AbstractNetMessage {

    private NetMessageHead netMessageHead;
    private NetMessageBody netMessageBody;

}
