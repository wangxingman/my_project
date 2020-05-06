package com.game.core.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @Author: wx
 * @Date: 上午 10:14 2019/12/27 0027
 * @Desc:
 * @version:
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MessageCommandAnnotation {
    /**
     * 协议号
     */
    int cmd();
}
