package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartEndString {
    public static void main(String[] args) {
//        Pattern p = Pattern.compile("^a");
        Pattern p = Pattern.compile("c$");
//        Pattern p = Pattern.compile("^b"); // will not find anything
        Matcher m = p.matcher("abc");
        while(m.find())
            System.out.print(m.start() + " " + m.group() + " ");
        System.out.println();
    }
}