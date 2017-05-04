package com.company.springbootjavafx.config;

import com.company.springbootjavafx.config.properties.AppProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 *
 */

@Configuration
@EnableConfigurationProperties(AppProperties.class)
public class AppConfig
{
}
