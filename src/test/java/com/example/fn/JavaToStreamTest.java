package com.example.fn;

import com.fnproject.fn.testing.*;
import org.junit.*;

import static org.junit.Assert.*;

public class JavaToStreamTest {

    @Rule
    public final FnTestingRule testing = FnTestingRule.createDefault();

    @Test
    public void shouldReturnGreeting() {
        testing.givenEvent().enqueue();
        testing.thenRun(JavaToStream.class, "handleRequest");

        FnResult result = testing.getOnlyResult();
        assertEquals("Message Sent", result.getBodyAsString());
    }

}