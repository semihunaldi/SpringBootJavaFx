package com.company.springbootjavafx;

import com.company.springbootjavafx.views.MainView;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Semih on 5/4/2017.
 */

@SpringBootApplication
public class SpringBootJavaFxApplication extends AbstractJavaFxApplicationSupport
{
    public static void main(String[] args)
    {
        launchApp(SpringBootJavaFxApplication.class, MainView.class,args);
    }
}
