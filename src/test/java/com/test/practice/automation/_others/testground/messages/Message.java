package com.test.practice.automation._others.testground.messages;

import java.util.List;

/**
 * Created by TPD_Auto on 02/02/2017.
 */
public class Message {

    private final List<String> listOfMessages;

    /**
     * Look constructor takes in a list of String texts
     *  - This way we can pass any number of messages
     * @param listOfMessages
     */
    public Message(List<String> listOfMessages) {
        this.listOfMessages = listOfMessages;
    }

    /**
     * Loops through each of the string values and simply checks if the string contains our search term
     * - if it doesn't contain it than continues to the next item in the arraylist
     * - else updates found=true and since we don't want to loop again we use the "break;" to finish from looping
     * @param searchTerm
     * @return
     */
    public boolean searchMessage(String searchTerm) {
        boolean found = false;
        for(String msg: listOfMessages){
            if(msg.contains(searchTerm)){
                found = true;
                break;
            }
        }
        return found;
    }
}
