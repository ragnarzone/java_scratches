package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordBoundaries {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\bis\\b");
        Matcher m = p.matcher("This island is beautiful");
        while(m.find())
            System.out.print(m.start() + " " + m.group() + " ");
        System.out.println();
    }
}