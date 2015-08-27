package com.jjt.wtrc.application.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Pengrl on 2015/8/6.
 */
@Configuration
@ComponentScan(basePackages={"com.prl.wtrc.dao.service"},
        excludeFilters={@Filter(type= FilterType.ANNOTATION, value=EnableWebMvc.class)})
public class RootConfig {
}
