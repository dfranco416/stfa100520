package fundamentals.tuesday.labc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ControlFlowTest {
    ControlFlow instance;

    @BeforeEach
    void setUp(){
    instance = new ControlFlow();
    }

    @Test
    public void myMethodTest(){
//        ControlFlow instance = new ControlFlow();
        String expected = "true";
        String actual = instance.myMethod(2);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void switchMethodTest(){
//        ControlFlow instance = new ControlFlow();
        String actual = instance.switchMethod(3);
        Assertions.assertEquals("that's four",actual);

    }
    @Test
    void forMethodTest(){
        String actual = instance.forMethod();

    }
}
