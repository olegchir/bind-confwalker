package ru.olegchir.bindconf.walker.test;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by IntelliJ IDEA.
 * User: Olga
 * Date: 15.09.2009
 * Time: 23:26:36
 * To change this template use File | Settings | File Templates.
 */
public class ZoneStatementTest extends ParserTestTemplate {
    
    @Test
    public void test_invalidGrammar() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "asdf";

        testSilent();

        failStage1Check("Completely invalid syntax cannot be passed");
    }


    @Test
    public void test_invalidGrammarInZoneDef() throws Exception {
        trace(Thread.currentThread().getStackTrace());

        cmd = "zone 1test- IN {type delegation-only;}";

        testSilent();

        assertTrue("Must can't find so strange zone def",
                parser.getOverrider().getSemanticErrorCount() != 0);
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


}
