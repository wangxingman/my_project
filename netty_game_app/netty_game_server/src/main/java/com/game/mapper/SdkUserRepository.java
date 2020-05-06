package com.game.mapper;

import com.game.entity.SdkUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @Author: @
 * @Desc:
 * @Date: 下午 3:15 2020/1/4 0004
 * @Version: 0.1
 */
public interface SdkUserRepository extends JpaRepository<SdkUser,Integer>, JpaSpecificationExecutor {

    SdkUser findBySdkUserOpenidAndSdkUserChannelid(String openId,Integer channel);
}
