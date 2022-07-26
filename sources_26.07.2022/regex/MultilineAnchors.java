package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultilineAnchors {
    public static void main(String[] args) {
        // Pattern.MULTILINE allow to search entries in text separated by "\n"
        Pattern p = Pattern.compile("ne$", Pattern.MULTILINE);
        Matcher m = p.matcher("first line\nsecond line");
        while(m.find())
            System.out.print(m.start() + " " + m.group() + " ");
        System.out.println();
    }
}