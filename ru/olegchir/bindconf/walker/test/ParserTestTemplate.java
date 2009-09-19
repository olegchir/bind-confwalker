package ru.olegchir.bindconf.walker.test;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import ru.olegchir.bindconf.walker.parser.generated.Bind9ConfigLexer;
import ru.olegchir.bindconf.walker.parser.generated.Bind9ConfigParser;
import ru.olegchir.bindconf.walker.parser.override.Bind9ParserOverrider;
import ru.olegchir.bindconf.walker.parser.override.Bind9LexerOverrider;
import ru.olegchir.bindconf.walker.parser.override.Bind9RecognizerOverrider;

/**
 * Created by IntelliJ IDEA.
 * User: Olga
 * Date: 19.09.2009
 * Time: 17:03:47
 * To change this template use File | Settings | File Templates.
 */
public class ParserTestTemplate {
    protected ByteArrayInputStream cmdIs;
    protected ANTLRInputStream input;
    protected Bind9ConfigLexer lexer;
    protected CommonTokenStream tokens;
    protected Bind9ConfigParser parser;
    protected Bind9ParserOverrider poverrider;
    protected Bind9LexerOverrider loverrider;
    protected Bind9ConfigParser.list_return lr;
    protected CommonTree lrtree;
    protected String currentTestName;
    protected String cmd;

    private void parse() throws IOException, RecognitionException {
        cmdIs = new ByteArrayInputStream(cmd.getBytes());

        // Create an input character stream from standard in
        input = new ANTLRInputStream(cmdIs);

        // Create an ExprLexer that feeds from that stream
        lexer = new Bind9ConfigLexer(input, loverrider);

        // Create a stream of tokens fed by the lexer
        tokens = new CommonTokenStream(lexer);

        // Create a parser that feeds off the token stream
        parser = new Bind9ConfigParser(tokens, poverrider);

        // Begin parsing at rule list
        lr = parser.list();

        lrtree = (CommonTree)lr.getTree();

        if (null!=lrtree) {
            System.out.println("["+currentTestName+"] "+lrtree.toStringTree());
        }
    }

    private void override() {
        poverrider = new Bind9ParserOverrider();
        loverrider = new Bind9LexerOverrider();
    }

    private void silent() {
        loverrider.setErrorReportingVisibility(Bind9RecognizerOverrider.ERROR_REPORTING_SILENT);
        poverrider.setErrorReportingVisibility(Bind9RecognizerOverrider.ERROR_REPORTING_SILENT);
    }

    private void testname(String name) {
        currentTestName = name;
    }

    public void trace(StackTraceElement e[]) {
      boolean doNext = false;
      for (StackTraceElement s : e) {
          if (doNext) {
             testname(s.getMethodName());
             return;
          }
          doNext = s.getMethodName().equals("getStackTrace");
      }
    }

    public void testValid() {
        assertTrue("Must be semantic-valid on (Parser/stage1)",
                parser.getOverrider().getSemanticErrorCount() == 0);
        assertTrue("Must be lexical-valid on (Parser/stage1)",
                parser.getOverrider().getLexicalErrorCount() == 0);
        assertTrue("Must be semantic-valid on (Lexer/stage1)",
                parser.getOverrider().getSemanticErrorCount() == 0);
        assertTrue("Must be lexical-valid on (Lexer/stage1)",
                parser.getOverrider().getLexicalErrorCount() == 0);
    }

    public void overrideAndParse() throws Exception {
        override();
        parse();
    }

    public void testNormal() throws Exception {
        overrideAndParse();
        testValid();
    }

    public void testSilent() throws Exception {
            override();
            silent();
            parse();
    }

    public boolean testSilentWithoutErrors() {
        boolean failed = false;
        try {
            testSilent();
        } catch (Exception e) {
            failed = true;
        }
        return failed;
    }

    public void testVerbose() throws Exception {
        overrideAndParse();
    }

    public void failStage1(String reason) {
        assertTrue(reason,(parser.getOverrider().getSemanticErrorCount() > 0) ||
                (parser.getOverrider().getLexicalErrorCount() > 0) ||
                (parser.getOverrider().getSemanticErrorCount() > 0) ||
                (parser.getOverrider().getLexicalErrorCount() > 0));
    }

    public void failStage1Silent(String reason) {
        boolean failed = false;

        failed = testSilentWithoutErrors();

        boolean failedParserSemantic = parser.getOverrider().getSemanticErrorCount() > 0;
        boolean failedParserLexical = parser.getOverrider().getLexicalErrorCount() > 0;
        boolean failedLexerSemantic = lexer.getOverrider().getSemanticErrorCount() > 0;
        boolean failedLexerLexical = lexer.getOverrider().getLexicalErrorCount() > 0;

        assertTrue(reason, failedParserSemantic ||
                failedParserLexical ||
                failedLexerSemantic ||
                failedLexerLexical ||
                failed);       
    }
}
