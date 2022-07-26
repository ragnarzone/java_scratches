package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DotForQuote {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\".*\"");
        Matcher m = p.matcher("This is a \"quote\" in the sentence.");
        while(m.find())
            System.out.print(m.start() + " " + m.group() + " ");
        System.out.println();
    }
}