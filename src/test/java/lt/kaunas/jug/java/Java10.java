package lt.kaunas.jug.java;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.PriorityQueue;
import java.util.function.Function;

public class Java10 {

    @Test
    public void java10feature(){
        String message = "On March 22 is Jug 53!!!!!";
        System.out.println(message);

        //
       // var name = null;

        //var runnable = () -> {}
 //       var abs = BigDecimal::abs
        var numbers = new int[]{2, 4, 6};
//       var numbers[] = new int[]{2, 4, 6};
//        var numbers = {2, 4, 6};

        //       https://openjdk.org/projects/amber/guides/lvti-style-guide
        // ORIGINAL
//        byte flags = 0;
//        short mask = 0x7fff;
//        long base = 17;
        //    // DANGEROUS: all infer as int
//        var flags = 0;
//        var mask = 0x7fff;
//        var base = 17;

//


// OK: both declare variables of type PriorityQueue<Item>
        PriorityQueue<Integer> itemQueue = new PriorityQueue<>();
        var itemQueue1 = new PriorityQueue<>();
//        It is legal to use both var and diamond, but the inferred type will change:

// DANGEROUS: infers as PriorityQueue<Object>
//        var itemQueue2 = new PriorityQueue<>();
//         itemQueue2.add(1);
//        Integer poll = itemQueue2.poll();
    }
}
