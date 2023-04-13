package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN



class App {

    public static void main(String[] args) {

    }


    public static List<Map<String,String>> findWhere(List<Map<String, String>> books, Map<String, String> whatToFind) {
        List<Map<String, String>> result = new ArrayList<>();
        for (Map<String, String> item:books){
            boolean find = true;
            for(Entry<String, String> entry:whatToFind.entrySet()){
                String toFindValue = item.getOrDefault(entry.getKey(),"");
                if (!toFindValue.equals(entry.getValue())) {
                    find = false;
                }
            }
            if (find) {
                result.add(item);
            }
        }
        return result;
    }
}
//END
