
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
public class Main {

    public static void main(String[] args){


        String source =
                "=== Header3 ===" +
                " **bold**" +
                "//italic//" +
                "__ underline __" +
                "<sub>subscript</sub>" +
                        "<sup>superscript</sup>\n" +
                        "<del>deleted</del>";


        docuWikiLexer docuWikiLexer = new docuWikiLexer( CharStreams.fromString(source));
        CommonTokenStream commonTokenStream = new CommonTokenStream(docuWikiLexer);
        docuWikiParser docuWikiParser = new docuWikiParser(commonTokenStream);

        System.out.println(docuWikiParser.body().toString());
        String result = docuWikiParser.htmlBuilder.toString();

        System.out.println("INPUT: ");
        System.out.println(source);
        System.out.println("RESULTS: ");
        System.out.println(result);

    }

}
