package org.automation.core;

import org.automation.Calculator;
import org.automation.util.ScreenShot;
import org.junit.Before;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;


public abstract class TestingCalculator {
    protected Calculator aCalculator = null;

    @Before

    public void init(){
        aCalculator = new Calculator();
    }


    protected String attachThisMessage(String message){
        return message;
    }

    protected byte[] capturePNG() {
        return ScreenShot.capturePNG();
    }


    protected byte[] capture() {
        return ScreenShot.capture();
    }

    public static String attachHtml(String html) {
        return html;
    }

}
