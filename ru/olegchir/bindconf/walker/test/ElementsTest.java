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

        successStage1();
    }

    @Test
    public void test_invalidIP4type1() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { ip4 123.1; } ";

        failStage1Silent("IP4 must be in 192.168.1.1 format");
    }

    @Test
    public void test_invalidIP4type2() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { ip4 123.123.asd.123; } ";

        failStage1Silent("IP4 must be in 192.168.1.1 format");
    }

    @Test
    public void test_IP6type1() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { ip6 a::1::2::3; } ";

        successStage1();
    }

    @Test
    public void test_IP6type2() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { ip6 asdf; } ";

        successStage1();
    }

    @Test
    public void test_invalidIP6() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { ip6 @; } ";

        failStage1Silent("IP6 must be in valid format (at least 1::2::3::4!)");
    }

    @Test
    public void test_IPtype1() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { ip 195.208.153.94; } ";

        successStage1();
    }

    @Test
    public void test_IPtype2() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { ip 1::2::3::4; } ";

        successStage1();
    }

    @Test
    public void test_invalidIP() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { ip 192.168.asd.3; } ";

        failStage1Silent("No alphas allowed in IP4");
    }

    @Test
    public void test_validACLName() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { acl_field asd; } ";

        successStage1();
    }
    @Test
    public void test_invalidACLName() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { acl_field @; } ";

        failStage1Silent("acl_name must be word of alphanumeric chars");
    }
}
