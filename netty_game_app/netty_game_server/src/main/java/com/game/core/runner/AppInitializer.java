package com.game.core.runner;

/**
 * @Author: wx
 * @Date: 上午 11:48 2019/12/27 0027
 * @Desc:
 * @version:
 */
public interface AppInitializer {

    /**
     * init
     *
     * @throws Exception Throwable
     */
    default void init() throws Exception {
    }

    /**
     * destroy
     *
     * @throws Exception Throwable
     */
    default void destroy() throws Exception {
    }

    /**
     * order
     *
     * @return int
     */
    default int order() {
        return 0;
    }
}
