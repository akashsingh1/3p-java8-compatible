package com.benchmark.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import com.benchmark.app.App;

public class AppTest 
{
    @Test
    public void testHelloWorldStringEncoding()
    {
        String encoded = App.encode();
        assertEquals(encoded, "SGVsbG8sIFdvcmxkIQ==");
    }
}
