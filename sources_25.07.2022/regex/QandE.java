package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QandE {
    public static void main(String[] args) {
        // between Q and E all text literal
        Pattern p = Pattern.compile("\\Q1+1=2\\E");
        Matcher m = p.matcher("1+1=2");
        while (m.find()){
            System.out.print(m.start() + " " + m.group() + " ");
        }
        System.out.println();
    }
}
