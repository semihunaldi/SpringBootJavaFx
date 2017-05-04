package com.company.springbootjavafx;

import com.company.springbootjavafx.views.MainView;
import de.roskenet.jfxsupport.test.GuiTest;
import javafx.scene.control.Label;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.PostConstruct;

import static org.junit.Assert.assertNotEquals;

/**
 * Created by Semih on 5/4/2017.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class MainViewTest extends GuiTest
{
    @PostConstruct
    public void constructView() throws Exception
    {
        init(MainView.class);
    }

    @Test
    public void testButton()
    {
        clickOn("#button");
        assertNotEquals(labelText(),"Label");
    }

    private String labelText() {
        return ((Label) find("#label")).getText();
    }
}
