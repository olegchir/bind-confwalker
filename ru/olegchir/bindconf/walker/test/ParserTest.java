package ru.olegchir.bindconf.walker.test;

import org.junit.*;
import static org.junit.Assert.*;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;

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
 * Date: 15.09.2009
 * Time: 23:26:36
 * To change this template use File | Settings | File Templates.
 */
public class ParserTest {
    private ByteArrayInputStream cmdIs;
    private ANTLRInputStream input;
    private Bind9ConfigLexer lexer;
    private CommonTokenStream tokens;
    private Bind9ConfigParser parser;
    private Bind9ParserOverrider poverrider;
    private Bind9LexerOverrider loverrider;
    private Bind9ConfigParser.list_return lr;
    private CommonTree lrtree;
    private String currentTestName;
    private String cmd;

    @Test
    public void test_invalidGrammar() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "zone 1test IN {type delegation-only; }";

        testSilent();

        assertTrue("Must detect invalid grammar",
                lexer.getOverrider().getLexicalErrorCount() != 0);
    }


    @Test
    public void test_CStyleCommentGrammar() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "/*C-Style comment first line\r\nC-Style comment second line*/";

        testNormal();
    }

    @Test
    public void test_CPPStyleCommentGrammar() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "//CPP-Style comment";

        testNormal();
    }

    @Test
    public void test_PerlStyleCommentGrammar() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "#Perl-Style comment";

        testNormal();
    }

    @Test
    public void test_invalidDelegationZone() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "zone invalidDelegationZone IN {type delegation-only; forward first;}";

        testSilent();
        
        assertTrue("Grammar must not be valid on Semantic Predicates (Parser/stage1)",
                parser.getOverrider().getSemanticErrorCount() > 0);
    }

    @Test
    public void test_validForwardZone() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "zone validForwardZone {type forward; forward first;}";

        testNormal();
    }


    @Test
    public void test_validDelegationZone() throws Exception {
        trace(Thread.currentThread().getStackTrace());
        
        cmd = "zone validDelegationZone IN {type delegation-only; }";

        testNormal();
    }

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
        assertTrue("Grammar must be valid on (Parser/stage1)",
                parser.getOverrider().getSemanticErrorCount() == 0);
        assertTrue("Grammar must be valid on (Lexer/stage1)",
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

    public void testVerbose() throws Exception {
        overrideAndParse();
    }
}
