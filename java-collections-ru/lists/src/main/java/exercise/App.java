package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// BEGIN
class App {

    public static boolean scrabble(String symbSet, String inword) {

        String word = inword.toLowerCase();
        String[] letters = symbSet.split("");
        List symbList = new ArrayList(Arrays.asList(letters));

        for (int i = 0; i < symbSet.length(); i++) {
            symbList.add(symbSet.charAt(i));
        }
        //convert word  String to wordList list of chars
        for (int i = 0; i < inword.length(); i++) {
            String tmp = word.substring(i,i+1);

            if (!symbList.contains(tmp)) {
                return false;
            }
            symbList.remove(tmp);
        }
        return true;
    }
}

//END
