package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App{
    public static void main(String[] args) {
        String sentence = "java is the best programming language java";
        Map wordsCount = App.getWordCount(sentence);
        System.out.println(wordsCount);
        System.out.println(App.toString(wordsCount));
    }

    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> hashmap = new HashMap<String, Integer>();
        String[] arr = sentence.split(" ");
        for (String s : arr) {
            hashmap.put(s, hashmap.getOrDefault(s,0) +1);
        }
        return hashmap;

    }
    public static String toString(Map<String, Integer> wrdLst) {
        String result = "{" + "\n";
        for (String v : wrdLst.keySet()) {
            result = result + "  " + v + ": " + wrdLst.get(v) + "\n";
        }
        result = result + "}";

        return result;

    }
}
//END
