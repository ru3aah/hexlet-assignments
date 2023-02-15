package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


// BEGIN
public class App {

    public static Boolean scrabble(String symbSet, String word) {

        if (word.length() > symbSet.length()) {
            return false;
        }

        word = word.toLowerCase();
        List<Character> symbList = new ArrayList<Character>();
        List<Character> wordList = new ArrayList<Character>();

        //convert symSet String to symbList List of chars
        for (int i = 0; i < symbSet.length(); i++) {
            symbList.add(symbSet.charAt(i));
        }
        //convert word  String to wordList list of chars
        for (int i = 0; i < word.length(); i++) {
            wordList.add(word.charAt(i));
        }
        //check if symbList is has got enough suitable symbols
        for (char ch : wordList) {
            if (symbList.contains(ch)) {
                wordList.remove(ch);
            }
        }
        return wordList.isEmpty();
    }
}

//END
