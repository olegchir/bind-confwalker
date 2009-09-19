package ru.olegchir.bindconf.walker.test;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: Olga
 * Date: 19.09.2009
 * Time: 17:05:42
 * To change this template use File | Settings | File Templates.
 */
public class ElementsTest extends ParserTestTemplate {
    @Test
    public void test_validIP4() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { ip4 192.168.1.1; } ";

        testNormal();

        testValid();
    }
    @Test
    public void test_invalidIP4() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { ip4 123.1; } ";

        failStage1Silent("IP4 must be in 192.168.1.1 format");
    }
}
