package lt.kaunas.jug.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Java15 {

    @Test
    public void testTextBlocks(){
        var text = "{\n \"event\":\"Kaunas JUG\",\n \"when\":\"March 22\"\n}";
        var textBlock = """
                       {
                        "event":"Kaunas JUG",
                        "when":"March 22"
                       }""";

        Assertions.assertEquals(text, textBlock);
    }


    @Test
    public void nullPointerTest(){
        Object temp =null;
        System.out.println("Print hash code:"+temp.hashCode());
    }
}
