package com.game.core.message;

import com.game.core.dieline.Singleton;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: wx
 * @Date: 上午 10:30 2019/12/27 0027
 * @Desc:
 * @version:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AbstractNetMessage {

    private NetMessageBody messageBody;

    private NetMessageHead messageHead;

    public AbstractNetMessage(NetMessageBody messageBody,Integer cmd) {
        this.messageBody = messageBody;
        NetMessageHead netMessageHead = Singleton.getNetMessageHead();
        netMessageHead.setCmd(cmd);
        this.messageHead = netMessageHead;
    }
}
