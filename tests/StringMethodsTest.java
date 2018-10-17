import org.junit.Test;

import static org.junit.Assert.*;

public class StringMethodsTest {
    @Test
    public void abcTest4(){
        boolean result = StringMethods.abcTest("adgasgdaabc");
        assertEquals(true, result);

    }
    @Test
    public void abcTest1(){
        boolean result = StringMethods.abcTest("sdfjkas.abc");
        assertEquals(false, result);

    }
    @Test
    public void abcTest2(){
        boolean result = StringMethods.abcTest("asdhjfasdfklj");
        assertEquals(false, result);

    }
    @Test
    public void abcTest3(){
        boolean result = StringMethods.abcTest("eabc.");
        assertEquals(true, result);

    }

}