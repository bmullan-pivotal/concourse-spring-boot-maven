package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
 
@RunWith(SpringRunner.class)
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
