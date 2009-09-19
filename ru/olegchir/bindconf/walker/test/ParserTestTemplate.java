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

    /**
     * Create all parsers and run process
     * @throws IOException
     * @throws RecognitionException
     */
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

    /**
     * Create all overriders.
     */
    private void override() {
        poverrider = new Bind9ParserOverrider();
        loverrider = new Bind9LexerOverrider();
    }

    /**
     * Sets the silent debug mode flags in overriders.
     */
    private void silent() {
        loverrider.setErrorReportingVisibility(Bind9RecognizerOverrider.ERROR_REPORTING_SILENT);
        poverrider.setErrorReportingVisibility(Bind9RecognizerOverrider.ERROR_REPORTING_SILENT);
    }

    /**
     * Shortcut to setter of test name. For better semantic purposes.
     * @param name
     */
    private void testname(String name) {
        currentTestName = name;
    }

    /**
     * Evaluate current test name by immediate stacktrace.
     * Must be first statement in any test.
     * @param e
     */
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

    /**
     * Check for errors in overriders (just check, without parsing).
     * There's no "reason" param because we don't judge winners.
     */
    public void testValidCheck() {
        assertTrue("Must be semantic-valid on (Parser/stage1)",
                parser.getOverrider().getSemanticErrorCount() == 0);
        assertTrue("Must be lexical-valid on (Parser/stage1)",
                parser.getOverrider().getLexicalErrorCount() == 0);
        assertTrue("Must be semantic-valid on (Lexer/stage1)",
                lexer.getOverrider().getSemanticErrorCount() == 0);
        assertTrue("Must be lexical-valid on (Lexer/stage1)",
                lexer.getOverrider().getLexicalErrorCount() == 0);
    }

    /**
     * Shortcut to run default parsing (Stage1)
     * @throws Exception
     */
    public void overrideAndParse() throws Exception {
        override();
        parse();
    }

    /**
     * Parse (Stage1) and test errors in overriders.
     * Useful for tests with expected success.
     * @throws Exception
     */
    public void testNormal() throws Exception {
        overrideAndParse();
        testValidCheck();
    }

    /**
     * Parse (Stage1) with disabled visible debug in overriders.
     * Useful for test with expected failure.
     * @throws Exception
     */
    public void testSilent() throws Exception {
            override();
            silent();
            parse();
    }

    /**
     * Parse with testSilent() surpressing all errors.
     * Useful for test with expected failure.
     * @return
     */
    public boolean testSilentWithoutErrors() {
        boolean failed = false;
        try {
            testSilent();
        } catch (Exception e) {
            failed = true;
        }
        return failed;
    }

    /**
     * Parse with Stage1 without warning surpressing.
     * Useful for test with expected failure.
     * @throws Exception
     */
    public void testVerbose() throws Exception {
        overrideAndParse();
    }

    /**
     * Check that Stage1 failed (just check, without parsing).
     * Useful for test with expected failure.
     * @param reason
     */
    public void failStage1Check(String reason) {
        assertTrue(reason,(parser.getOverrider().getSemanticErrorCount() > 0) ||
                (parser.getOverrider().getLexicalErrorCount() > 0) ||
                (lexer.getOverrider().getSemanticErrorCount() > 0) ||
                (lexer.getOverrider().getLexicalErrorCount() > 0));
    }

    /**
     * Silently run parsing (Stage-1) and surpress all visible errors.
     * Useful for test with expected failure.
     * @param reason
     */
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

    /**
     * Silently run parsing (Stage-1)
     * Useful for test with expected failure.
     * @param reason
     */
    public void failStage1(String reason) throws Exception {
        testSilent();
        failStage1Check(reason);
    }

    /**
     * Run verbose testing and check errors on Stage1.
     * Useful for test with expected success.
     * @throws Exception
     */
    public void successStage1() throws Exception {
        testNormal();
        testValidCheck();
    }
}
