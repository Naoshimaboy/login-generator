package geco;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;


public class LoginServiceTest {

    @Test
    public void testLoginExists(){

        //GIVEN
        String[] initTest = new String[] {"init"};
        LoginService test = new LoginService(initTest);

        //WHEN
        test.addLogin("test1");

        //THEN
        assertFalse(test.loginExists("test0"));
        assertTrue(test.loginExists("test1"));
        System.out.println("testLoginExists Fini");

    }

    @Test
    public void testFindAllLoginsStartingWith(){

        //GIVEN
        String[] initTest = new String[] {"init"};
        LoginService test = new LoginService(initTest);
        List testRetour = new ArrayList<String>();

        //WHEN
        test.addLogin("test1");
        test.addLogin("test0");
        test.addLogin("chat");

        testRetour.add("test1");
        testRetour.add("test0");

        //THEN
        assertEquals(testRetour,test.findAllLoginsStartingWith("test"));
        System.out.println("testFindAllLoginsStartingWith Fini");
    }

    @Test
    public void testFindAllLogins(){

        //GIVEN
        String[] initTest = new String[] {"init"};
        LoginService test = new LoginService(initTest);
        List testRetour = new ArrayList<String>();

        //WHEN
        test.addLogin("test1");
        test.addLogin("test0");
        test.addLogin("chat");

        testRetour.add("init");
        testRetour.add("test1");
        testRetour.add("test0");
        testRetour.add("chat");

        //THEN
        assertEquals(testRetour,test.findAllLogins());
        System.out.println("testFindAllLogins Fini");

    }


}
