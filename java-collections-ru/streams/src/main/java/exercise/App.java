package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

// BEGIN
class App {

    public static void main(String[] args) {
        String[] emails = {
                "info@gmail.com",
                "info@yandex.ru",
                "mk@host.com",
                "support@hexlet.io",
                "info@hotmail.com",
                "support.yandex.ru@host.com"
        };
List<String> emailList = Arrays.asList(emails);
System.out.println(getCountOfFreeEmails(emailList));

    }
    public static int getCountOfFreeEmails(List<String> emailList){
        String[] freeDomens = {
                "gmail.com",
                "yandex.ru",
                "hotmail.com"
        };
        long result = 0;
        for (String freeDom : freeDomens){
            long amount = 0;
                amount = emailList.stream()
                        .filter(dom -> dom.endsWith(freeDom))
                        .count();
                result = result + amount;
            }
        return (int)  result;
    }

}
// END
