package com.test.practice.automation._others.testground.messages;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TPD_Auto on 02/02/2017.
 */
public class MessageTest {

    private static Message message;

    @BeforeClass
    public static void setUpMessageStore(){

        /**
         * Assuming each add() is a line of text
         */
        List<String> data = new ArrayList<String>();
        data.add("not easy learn something");
        data.add("it will eventually come to your");
        data.add("just doing it nike slogan");

        message = new Message(data);
    }

    @Test
    public void testSearchMethod1(){
        String searchTerm = "some";
        boolean found = message.searchMessage(searchTerm);
        Assert.assertEquals("Expected to see : " + searchTerm, true, found);
    }

    @Test
    public void testSearchMethod2(){
        String searchTerm = "easy lea";
        boolean found = message.searchMessage(searchTerm);
        Assert.assertEquals("Expected NOT to see : " + searchTerm, true, found);
    }

    /**
     * See this one doing -ve testing
     */
    @Test
    public void testSearchMethod3(){
        String searchTerm = "this text is not there";
        boolean found = message.searchMessage(searchTerm);
        Assert.assertEquals("Expected to see : " + searchTerm, false, found);
    }
}
