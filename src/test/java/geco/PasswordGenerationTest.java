package geco;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class PasswordGenerationTest {

    @Ignore
    public void testAl(){
        PasswordGeneration test = new PasswordGeneration();
        String toReturn = test.generateRandomPassword();
        assertNotEquals("azertyui", toReturn);
    }


}
