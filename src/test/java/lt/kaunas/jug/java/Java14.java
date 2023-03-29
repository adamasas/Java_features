package lt.kaunas.jug.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Java14 {

    @Test
    public void javaOldSwitch(){

        String result;
        String animal= "TIGER";

        switch (animal) {
            case "DOG":
                result = "domestic animal";
                break;
            case "CAT":
                result = "domestic animal";
                break;
            case "TIGER":
                result = "wild animal";
                break;
            default:
                result = "unknown animal";
                break;
        }
        System.out.println(result);
        Assertions.assertEquals(result,"wild animal");
    }

    @Test
    public void javaNewSwitch(){


        String animal= "TIGER";

       var result = switch (animal) {
            case "DOG"->"domestic animal";
            case "CAT"->"domestic animal";

            case "TIGER"->"wild animal";
            default -> { var x ="unknown animal";
                yield x;
            }

        };
        System.out.println(result);
        Assertions.assertEquals(result,"wild animal");
    }
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY, JUG_DAY
    }


    @Test
    public void javaSwitchWithEnums() {
        Day day = Day.TUESDAY;
        var result = switch (day) {
            case  MONDAY -> ":(";
            case  TUESDAY, WEDNESDAY, THURSDAY -> ":D";
            case  FRIDAY -> ":)";
            case  SATURDAY, SUNDAY, JUG_DAY -> ":D";
        };
        System.out.println("Mood of the day %s".formatted(result));

    }
}
