package com.company.springbootjavafx.controllers;

import com.company.springbootjavafx.config.properties.AppProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by semih on 4.05.2017.
 */
public class BaseController
{
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    protected AppProperties appProperties;
}
