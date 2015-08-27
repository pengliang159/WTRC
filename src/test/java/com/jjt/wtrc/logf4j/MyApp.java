package com.jjt.wtrc.logf4j;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Marker;

import java.util.Map;

import static org.apache.logging.log4j.MarkerManager.getMarker;

public class MyApp {

    private Logger logger = LogManager.getLogger(MyApp.class.getName());
    private static final Marker SQL_MARKER = getMarker("SQL");
    private static final Marker UPDATE_MARKER = getMarker("SQL_UPDATE").setParents(SQL_MARKER);
    private static final Marker QUERY_MARKER = getMarker("SQL_QUERY").setParents(SQL_MARKER);


}
