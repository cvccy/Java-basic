package com.cvccy.logger.jul;

import java.util.logging.Logger;
/**
 * jul可已通过适配器适配slf4j-api，再通过slf4j使用log4j日志，统一日志架构为log4j
 * 导入：jul-to-slf4j
 *      slf4j-api
 *      桥接器：slf4j-log4j12
 */
public class JulTest {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(JulTest.class.getName());
        logger.finest("finest");
        logger.info("jul");
    }
}
