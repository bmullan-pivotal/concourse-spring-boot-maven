package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(SpringJUnit4ClassRunner.class)
// @SpringApplicationConfiguration(classes = Greeting.class)
// @WebAppConfiguration
public class GreetingTests {

	@Test
    public void testConstructor(){
        Greeting greeting = new Greeting();
        assertEquals("id is zero (0)", 0, greeting.getId());
        assertNull("content is null", greeting.getContent());
    }

}
