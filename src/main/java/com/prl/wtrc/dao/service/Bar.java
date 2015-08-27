package com.prl.wtrc.dao.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Pengrl on 2015/8/11.
 */
public class Bar {
    static final Logger LOGGER = LogManager.getLogger(Bar.class.getName());

    public boolean doIt() {
        String str = null;
        return str.length() > 0;
    }
}
