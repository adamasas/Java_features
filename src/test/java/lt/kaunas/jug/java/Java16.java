package lt.kaunas.jug.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class Java16 {


    @Test
    public void record() {

        JugEvent jugEvent1 = new JugEvent("Kaunas JUG #53 Meetup", LocalDateTime.of(2023, 3, 22, 19, 0));
        JugEvent jugEvent2 = new JugEvent("Kaunas JUG #53 Meetup", LocalDateTime.of(2023, 3, 22, 19, 0));
        Assertions.assertTrue(jugEvent1 != jugEvent2);
        Assertions.assertTrue(jugEvent1.equals(jugEvent2));
        Assertions.assertEquals(jugEvent1.hashCode(),jugEvent2.hashCode());
        jugEvent1.topic();
        jugEvent1.time();
//      var temp = new JugEvent("zz",LocalDateTime.of(2023, 3, 22, 19, 0)){
//        };
    }

    @Test
    public void patternMatching() {
      System.out.println( getPossibleString("""
             "Jug" is String"""));
    }


    private String getPossibleString(Object o){
        if (o instanceof String newString){
            return newString;
        }else{
            return null;
        }
    }


}
