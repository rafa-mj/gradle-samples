package com.rmj.gradle.base;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class DefaultSampleServiceTest {

    @Rule
    public final ExpectedException thrown = ExpectedException.none();

    @Test
    public void testGetStatus() {
        DefaultSampleService sample = new DefaultSampleService();

        thrown.expect(UnsupportedOperationException.class);
        sample.getStatus();
    }

}
