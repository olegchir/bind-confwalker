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

        cmd = "testing { key_list yandex.ru; ; } ";

        successStage1();
    }

    @Test
    public void test_validKeyListype2() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { key_list yandex.ru ; google.com; ; } ";

        successStage1();
    }

    @Test
    public void test_invalidKeyListType1() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { key_list yandex.ru ; google.com; } ";

        failStage1Silent("key_list must end with semicolon");
    }

    @Test
    public void test_invalidKeyListType2() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { key_list yandex.ru ; hahaha;; } ";

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

    @Test
    public void test_validPathName() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { path_name \"C:/a.txt\"; } ";

        successStage1();
    }

    @Test
    public void test_invalidPathName() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { path_name asd; } ";

        failStage1Silent("path must be in quotes");
    }

    @Test
    public void test_validPortListType1() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { port_list 40000;; } ";

        successStage1();
    }

    @Test
    public void test_validPortListType2() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { port_list range 50000 60000;; } ";

        successStage1();
    }

    @Test
    public void test_validPortListType3() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { port_list 40000; range 50000 60000;; } ";

        successStage1();
    }

    @Test
    public void test_validPortListType4() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { port_list 40000; 50000; 60000;; } ";

        successStage1();
    }

    @Test
    public void test_invalidPortListType1() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { testing { port_list *;; }  } ";

        failStage1Silent("can't use asterisk as a valid wildcard in port_list");
    }

    @Test
    public void test_invalidPortListType2() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { testing { port_list 123; }  } ";

        failStage1Silent("port_list must be finished with semicolon");
    }

    @Test
    public void test_validSizeSpecType1() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { size_spec unlimited; } ";

        successStage1();
    }

    @Test
    public void test_validSizeSpecType2() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { size_spec default; } ";

        successStage1();
    }

    @Test
    public void test_validSizeSpecType3() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { size_spec 13k; } ";

        successStage1();
    }

    @Test
    public void test_validSizeSpecType4() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { size_spec 13K; } ";

        successStage1();
    }

    @Test
    public void test_validSizeSpecType5() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { size_spec 13m; } ";

        successStage1();
    }


    @Test
    public void test_validSizeSpecType6() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { size_spec 13M; } ";

        successStage1();
    }

    @Test
    public void test_validSizeSpecType7() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { size_spec 13g; } ";

        successStage1();
    }


    @Test
    public void test_validSizeSpecType8() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { size_spec 13G; } ";

        successStage1();
    }

    @Test
    public void test_invalidSizeSpec() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { testing { size_spec asd; }  } ";

        failStage1Silent("size_spec must be [number followed by K,k,M,m] or word 'unlimited' or word 'default'");
    }

    @Test
    public void test_validYesOrNoType1() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { yes_or_no yes; } ";

        successStage1();
    }

    @Test
    public void test_validYesOrNoType2() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { yes_or_no no; } ";

        successStage1();
    }

    @Test
    public void test_validYesOrNoType3() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { yes_or_no true; } ";

        successStage1();
    }

    @Test
    public void test_validYesOrNoType4() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { yes_or_no false; } ";

        successStage1();
    }

    @Test
    public void test_validYesOrNoType5() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { yes_or_no 0; } ";

        successStage1();
    }

    @Test
    public void test_validYesOrNoType6() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { yes_or_no 1; } ";

        successStage1();
    }

    @Test
    public void test_invalidTypeYesOrNo() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { testing { yes_or_no OMG_WTF_APSTENU!; }  } ";

        failStage1Silent("yes_or_no can be only 'yes','no','true','false','1','0' ");
    }

    @Test
    public void test_validDialupOptionDefault() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { dialup_option_default no; } ";

        successStage1();
    }

    @Test
    public void test_validDialupOptionSlaveOrStubType1() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { dialup_option_slavestub passive; } ";

        successStage1();
    }

    @Test
    public void test_validDialupOptionSlaveOrStubType2() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { dialup_option_slavestub yes; } ";

        successStage1();
    }

    @Test
    public void test_invalidDialupOptionDefault() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "testing { testing { dialup_option_default passive; }  } ";

        failStage1Silent("dialup_option in default zone types must be yes_or_no or notify only. ");
    }
}
