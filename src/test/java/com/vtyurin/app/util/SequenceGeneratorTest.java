package com.vtyurin.app.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SequenceGeneratorTest {

    @Test
    public void generate() throws Exception {
        String generatedStirng = SequenceGenerator.generate();
        assertEquals(7, generatedStirng.length());
    }
}