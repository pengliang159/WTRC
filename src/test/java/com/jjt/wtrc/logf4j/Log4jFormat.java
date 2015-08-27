package com.jjt.wtrc.logf4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by Pengrl on 2015/8/15.
 */
public class Log4jFormat {

    private static final Logger LOGGER = LogManager.getFormatterLogger(Log4jFormat.class);
    public static void main(String[] args) {
        LOGGER.debug("Logging in user {} with birthday {}", "CC", new Date());
        LOGGER.debug("Logging in user %s with birthday %s", "CC", new Date());
        LOGGER.debug("Logging in user %1$s with birthday %2$tm %2$te,%2$tY", "CC", new Date());
        LOGGER.debug("Integer.MAX_VALUE = %,d", Integer.MAX_VALUE);
        LOGGER.debug("Long.MAX_VALUE = %,d", Long.MAX_VALUE);

        Map<String, String>  map = new HashMap<>();
        map.put("name", "CC");
        map.put("id", "1207");
        LOGGER.info(new LoggedInMessage(map));

        ThreadContext.put("id", UUID.randomUUID().toString()); // Add the fishtag;
        ThreadContext.put("ipAddress", "2222");
        ThreadContext.put("loginId", "112");
        ThreadContext.put("hostName", "222");
        LOGGER.debug("Message 1 ", ThreadContext.get("%X"));
        LOGGER.debug("Message 2 %X{ipAddress}" );
        ThreadContext.clearMap();
    }
}
