package com.test.practice.automation.java.advanced;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by TPD_Auto on 03/01/2017.
 */
public class PlayHangman {

    private static Map<Integer, List<String>> mapOfWords = new HashMap<Integer, List<String>>();


    public static void main(String[] args) {
        List<String> fiveLetterWords = getFiveLetterWords();
        List<String> sixLetterWords = getSixLetterWords();
        mapOfWords.put(5, fiveLetterWords );
        mapOfWords.put(6, fiveLetterWords );

        /**
         * @Todo Aim: Create a game where user can play Hangman
         * 1. Add a list of seven, eight and nine letter words to mapOfWords
         *
         * 2. Program will randomly select a word from a HashMap based on the word size.
         *  - Pass the word size to the constructor
         *  - Select the correct list of words
         *  - Then select one of the words from the list of words : SECRET_WORD
         *
         * 3. For the SECRET_WORD selected print out _ for each letter in the word
         *  - So if its a five letter word than show _ _ _ _ _
         *
         * 4. User will get 10 turns to guess the word
         *  - If after 10 turns user is not able to guess the word
         *  - Then display a message showing the SECRET_WORD
         *
         * 5. User will be asked to guess a letter for each turn
         *  - If letter matches SECRET_WORD than replace _ with the letter guessed
         *      - So if SECRET_WORD is "Seven" and user guessed "e" than display :  _ e _ e _
         *  - Display a list of already guessed words
         *      - So user is able to make better decision
         *
         * 6. After each guess
         *  - Check if the SECRET_WORD is complete
         *      - If complete than print a message out with :
         *          - The completed SECRET_WORD
         *          - The number of tries it took to complete the word
         *          - List of all guesses
         *  - If SECRET_WORD not fully completed
         *      - Then repeat from step (4)
         *      - Until either we have reached 10 turns or we have found the SECRET_WORD
         */
        System.out.println("\n---------------New Exercise---------------\n");

    }

    private static List<String> getFiveLetterWords() {
        List<String> rafWords = new ArrayList<String>();
        rafWords.add("Seven");
        rafWords.add("Eight");

        return rafWords;
    }

    private static List<String> getSixLetterWords() {
        List<String> raWords = new ArrayList<String>();
        raWords.add("String");
        raWords.add("Coward");
        return raWords;
    }
}
