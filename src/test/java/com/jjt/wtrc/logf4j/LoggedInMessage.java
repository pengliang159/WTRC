package com.jjt.wtrc.logf4j;

import org.apache.logging.log4j.message.Message;

import java.util.Map;

/**
 * Created by Pengrl on 2015/8/15.
 */
public class LoggedInMessage implements Message {

    Map<String, String> map;
    public LoggedInMessage(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public String getFormattedMessage() {
        return "user " + map.get("name");
    }

    @Override
    public String getFormat() {
        return null;
    }

    @Override
    public Object[] getParameters() {
        return new Object[0];
    }

    @Override
    public Throwable getThrowable() {
        return null;
    }
}
