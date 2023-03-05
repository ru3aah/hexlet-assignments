package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


// BEGIN
public class App {

    public static Boolean scrabble(String symbSet, String inword) {

        if (inword.length() > symbSet.length()) {
            return false;
        }

        String word = inword.toLowerCase();
        List<Character> symbList = new LinkedList<>();
        List<Character> wordList = new LinkedList<>();

        //convert symSet String to symbList List of chars
        for (int i = 0; i < symbSet.length(); i++) {
            symbList.add(symbSet.charAt(i));
        }
        //convert word  String to wordList list of chars
        for (int i = 0; i < word.length(); i++) {
            wordList.add(word.charAt(i));
        }
        //check if symbList has got enough suitable symbols
        List tmp = wordList;
        for (int i = 0; i < tmp.size(); i++){
            if (symbList.contains(tmp.get(i))) {
                symbList.remove(tmp.get(i));
                wordList.remove(tmp.get(i));
            }
        }


        return wordList.isEmpty();
    }
}

//END
