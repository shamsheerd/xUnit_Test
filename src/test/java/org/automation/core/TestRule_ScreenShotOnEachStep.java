package org.automation.core;

import org.automation.util.ScreenShot;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class TestRule_ScreenShotOnEachStep extends TestWatcher {
    @Override
    protected void failed(Throwable e, Description description) {
        super.failed(e, description);
        snap();
    }
    @Override
    protected void succeeded(Description description) {
        super.succeeded(description);
        snap();
    }

    public byte[] snap() {
        return ScreenShot.capture();
    }
}
