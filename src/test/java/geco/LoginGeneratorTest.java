package geco;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;


public class LoginGeneratorTest {
    //GIVEN
     LoginGenerator testGenerator;
     LoginService testService;

    @Before
    public  void initialiser()  {
        //WHEN
        testService = new LoginService(new String[] {"JROL","BPER", "CGUR", "JDU", "JRAL", "JRAL1"});
        testGenerator = new LoginGenerator(testService);
    }


    @Test
    public void CT1() {
        assertEquals("PDUR",testGenerator.generateLoginForNomAndPrenom("Durand","Paul"));
    }

    @Test
    public void CT2() {
        assertEquals("JRAL2",testGenerator.generateLoginForNomAndPrenom("Ralling","John"));
        assertEquals("JROL1",testGenerator.generateLoginForNomAndPrenom("Rolling","Jean"));
    }

    @Test
    public void CT3() {
        assertEquals("PDUR",testGenerator.generateLoginForNomAndPrenom("Dùrand","Paul"));
    }

}
