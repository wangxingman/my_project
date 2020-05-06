package com.game.service.game;

import com.game.core.message.Request;
import com.game.entity.SdkUser;

/**
 * @Author: @
 * @Desc:
 * @Date: 下午 5:47 2020/1/4 0004
 * @Version: 0.1
 */
public interface SdkUserService {
    
    /**
     * @Author: @
     * @Desc:
     * @Date: 下午 5:51 2020/1/4 0004
     * @param: userId
     * @Return: SdkUser
     */
    SdkUser getSdkUser(Request request, String userId, Integer gameId, Integer gameNum);
}
