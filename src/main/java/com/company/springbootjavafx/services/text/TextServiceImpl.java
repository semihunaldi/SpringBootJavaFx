package com.company.springbootjavafx.services.text;

import com.company.springbootjavafx.services.BaseServiceImpl;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Created by Semih on 5/4/2017.
 */

@Component
public class TextServiceImpl extends BaseServiceImpl implements TextService
{
    @Override
    public String generateRandomString()
    {
        String randomString = UUID.randomUUID().toString().substring(0, 5);
        logger.info("info log randomString : ".concat(randomString));
        return randomString;
    }
}
