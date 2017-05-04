package com.company.springbootjavafx.services;

import com.company.springbootjavafx.config.properties.AppProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Semih on 5/4/2017.
 */
public class BaseServiceImpl
{
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    protected AppProperties appProperties;
}
