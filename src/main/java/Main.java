
import org.antlr.v4.runtime.*;

import java.util.*;
import java.util.logging.Filter;

public class Main {

    private static String parseAndBuild(String text){
        docuWikiLexer docuWikiLexer = new docuWikiLexer( CharStreams.fromString(text));
        CommonTokenStream commonTokenStream = new CommonTokenStream(docuWikiLexer);
        docuWikiParser docuWikiParser = new docuWikiParser(commonTokenStream);
        docuWikiParser.removeErrorListeners();


        docuWikiParser.body();
        return docuWikiParser.htmlBuilder.toString();
    }

    private static void printFeatures() {
        Map<String, String> features = new LinkedHashMap<>();
        features.put("HEADLINE1", "=Headline 1=");
        features.put("HEADLINE2", "==Headline 2==");
        features.put("HEADLINE3", "===Headline 3===");
        features.put("HEADLINE4", "====Headline 4====");
        features.put("BOLD", "**text to be bold**");
        features.put("ITALIC", "//text to be italic//");
        features.put("UNDERLINE", "__text to be underlined__");
        features.put("DELETED", "<del> test to be deleted </del>");
        features.put("SUBSCRIPT", "<sub> text to be subscribed </sub>");
        features.put("SUPERSCRIPT", "<sup> text to be subscribed </sup>");
        features.put("EXTERNALLINK", "[[http://external.link | name ]]");
        features.put("MEDIA", "{{http://image.source.png}}");
        features.put("QUOTE", ">QUOTE");
        features.put("NEWLINE", "\r\n");


        for( Map.Entry<String, String> entry : features.entrySet()){
            System.out.println("---------------"+ entry.getKey() +"---------------");
            System.out.println("INPUT : " + entry.getValue());
            System.out.println("OUTPUT: " + parseAndBuild(entry.getValue()));
            System.out.println();
        }

    }

    public static void main(String[] args){
        printFeatures();


        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter text:");
            String input = sc.nextLine();

            docuWikiLexer docuWikiLexer2 = new docuWikiLexer( CharStreams.fromString(input));
            CommonTokenStream commonTokenStream2 = new CommonTokenStream(docuWikiLexer2);
            docuWikiParser docuWikiParser2 = new docuWikiParser(commonTokenStream2);

            docuWikiParser2.body();

            String output = docuWikiParser2.htmlBuilder.toString();

            System.out.println("-----------------------------------------------------");
            System.out.println("INPUT: " + input);
            System.out.println("OUTPUT: " + output);
            System.out.println("-----------------------------------------------------");

        }


    }

}
