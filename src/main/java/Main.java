import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String inputFile = "./src/main/resources/input_failed.txt";
        CharStream input = CharStreams.fromFileName(inputFile);
        GrammarLexer lexer = new GrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrammarParser parser = new GrammarParser(tokens);
        ParseTree tree = parser.prog();
        ParseTreeWalker walker = new ParseTreeWalker();
        GrammarBaseListener listener = new GrammarBaseListener();
        walker.walk(listener, tree);
        System.out.println(tree.toStringTree(parser));
    }
}
