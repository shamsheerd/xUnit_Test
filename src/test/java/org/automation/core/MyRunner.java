package org.automation.core;

import org.junit.internal.runners.InitializationError;
import org.junit.internal.runners.JUnit4ClassRunner;


public class MyRunner extends JUnit4ClassRunner {
    public MyRunner(Class<?> klass) throws InitializationError {
        super(klass);
    }

    protected void validate() throws InitializationError {
        // ignore
    }
}
