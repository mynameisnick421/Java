import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class passwordTestTest {

    @Test
    void testInValidUser(){
        assertEquals(false, passwordTest.validEntryU("7321"),"numeric only field not accepted.");
        assertEquals(false, passwordTest.validEntryU("bob21"),"too few characters.");
        assertEquals(false, passwordTest.validEntryU("bigbadbobby21"),"too many characters.");
        assertEquals(false, passwordTest.validEntryU("bigbob 21"),"contains spaces.");
        assertEquals(false, passwordTest.validEntryU("21bigbob"),"numbers first");
    }
    @Test
    void testValidUser(){

        assertEquals(true, passwordTest.validEntryU("BigBob21"),"not enough letters.");
    }
    @Test
    void testInValidPass(){
        assertEquals(false, passwordTest.validEntryP("732221"),"numeric only field not accepted.");
        assertEquals(false, passwordTest.validEntryP("bob21"),"too few characters.");
        assertEquals(false, passwordTest.validEntryP("bigbadBobby21"),"too many characters.");
        assertEquals(false, passwordTest.validEntryP("BigBob 21"),"contains spaces.");
        assertEquals(false, passwordTest.validEntryP("21bigbob"),"no uppercase");
    }
    @Test
    void testValidPass(){

        assertEquals(true, passwordTest.validEntryP("BigBobby21"),"Should work.");
    }
}