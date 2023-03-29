package lt.kaunas.jug.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;

public class Java17Serialization {

    @Test
    public void test() throws IOException, ClassNotFoundException {
        var filename = "file.ser";

        var value = new TwoValue("one", "two");
        //var value = new Gadget(new Command("ls -l")); //This will not be deserialized

        var filter1 = ObjectInputFilter.allowFilter(cl -> cl.getPackageName().contentEquals("lt.kaunas.jug.java"), ObjectInputFilter.Status.REJECTED);
        ObjectInputFilter.Config.setSerialFilter(filter1);
        ObjectInputFilter.Config.setSerialFilterFactory((f1, f2) -> ObjectInputFilter.merge(f2,f1));

        serialize(value, filename);
        var readValue = deserialize(filename);
        Assertions.assertEquals(readValue.first(),"one");
        Assertions.assertEquals(readValue.second(),"two");
    }

    public static void serialize(Object value, String filename) throws IOException {
        System.out.println("---serialize");
        FileOutputStream fileOut = new FileOutputStream(filename);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(value);
        out.close();
        fileOut.close();
    }

    public static TwoValue  deserialize(String filename) throws IOException, ClassNotFoundException {
        System.out.println("---deserialize");
        FileInputStream fileIn = new FileInputStream(filename);
        ObjectInputStream in = new ObjectInputStream(fileIn);
        ObjectInputFilter intFilter = ObjectInputFilter.rejectFilter(cl -> cl.equals(Gadget.class), ObjectInputFilter.Status.UNDECIDED);
        in.setObjectInputFilter(intFilter);
        TwoValue tv = (TwoValue) in.readObject();
        return tv;
    }
}
