package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DotExample {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\d\\d.\\d\\d.\\d\\d");
        Matcher m = p.matcher("26/07/22");
        while(m.find())
            System.out.print(m.start() + " " + m.group() + " ");
        System.out.println();
    }
}
