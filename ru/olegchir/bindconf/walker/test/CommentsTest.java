package ru.olegchir.bindconf.walker.test;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: Olga
 * Date: 19.09.2009
 * Time: 21:23:00
 * To change this template use File | Settings | File Templates.
 */
public class CommentsTest extends ParserTestTemplate {
    @Test
    public void test_CStyleCommentGrammar() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "/*C-Style comment first line\r\nC-Style comment second line*/";

        testNormal();
    }

    @Test
    public void test_CPPStyleCommentGrammar() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "//CPP-Style comment\r\n";

        testNormal();
    }

    @Test
    public void test_PerlStyleCommentGrammar() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "#Perl-Style comment\r\n";

        testNormal();
    }
}
