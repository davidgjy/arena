package org.genesis.arena.elk;

import org.apache.log4j.Logger;

/**
 * Created by KG on 17/3/27.
 */
public class ElkLog4jTest {
    private static final Logger logger = Logger.getLogger(ElkLog4jTest.class);
    public static void main(String[] args) throws Exception {
        logger.debug("另外一台服务器,最新的日志!!");
    }
}
