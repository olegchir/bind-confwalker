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
    public void test_validACLNameType1() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { acl_name asd; } ";

        successStage1();
    }

    @Test
    public void test_validACLNameType2() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { acl_name 1; } ";

        successStage1();
    }
    
    @Test
    public void test_invalidACLName() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { acl_name @; } ";

        failStage1Silent("acl_name must be word of alphanumeric chars");
    }

    @Test
    public void test_validIpPortType1() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { ip_port 80; } ";

        successStage1();
    }

    @Test
    public void test_validIpPortType2() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { ip_port *; } ";

        successStage1();
    }

    @Test
    public void test_invalidIpPort() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { ip_port asd; } ";

        failStage1Silent("ip_port must be number");
    }

    @Test
    public void test_validIpPrefixType1() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { ip_prefix 127/24; } ";

        successStage1();
    }

    @Test
    public void test_validIpPrefixType2() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { ip_prefix 192.168/24; } ";

        successStage1();
    }

    @Test
    public void test_validIpPrefixType3() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { ip_prefix 192.168.1/24; } ";

        successStage1();
    }

    @Test
    public void test_validIpPrefixType4() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { ip_prefix 192.168.1.0/24; } ";

        successStage1();
    }

    @Test
    public void test_invalidIpPrefix() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { ip_prefix 192/asd; } ";

        failStage1Silent("ip_prefix must be in 'ip/length' format, and trailing zeros in ip can be omitted.");
    }

    @Test
    public void test_validKeyListType1() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { key_list \"yandex.ru;\"; } ";

        successStage1();
    }

    @Test
    public void test_validKeyListype2() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { key_list \"yandex.ru ; google.com;\"; } ";

        successStage1();
    }

    @Test
    public void test_invalidKeyListType1() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { key_list \"yandex.ru ; google.com\"; } ";

        failStage1Silent("key_list must end with semicolon");
    }

    @Test
    public void test_invalidKeyListType2() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { key_list \"yandex.ru ; hahaha;\"; } ";

        failStage1Silent("only domain_names allowed in key_list");
    }

    @Test
    public void test_validNumber() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { number 3; } ";

        successStage1();
    }

    @Test
    public void test_invalidNumber() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { number asd; } ";

        failStage1Silent("must be positive integer");
    }
}
