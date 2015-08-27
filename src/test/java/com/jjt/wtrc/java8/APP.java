package com.jjt.wtrc.java8;

import com.prl.wtrc.dao.service.Bar;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Pengrl on 2015/8/10.
 */
public class APP {
    private static final Logger LOGGER = LogManager.getLogger(APP.class);

    public static void main( String[] args ) {
        LOGGER.trace("entering application");
        Bar bar = new Bar();
        if (!bar.doIt()) {
            LOGGER.error("Didn't do it");
        }
        LOGGER.trace("Exiting application");
    }
}
