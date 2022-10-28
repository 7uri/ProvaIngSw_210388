import org.example.FunnyAlgorithms;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunnyAlgorithmsTest {
    public FunnyAlgorithms prova = new FunnyAlgorithms();
    public static DateTime tempo;

    @BeforeClass
    public static void start(){
        System.out.println("Start test!");
        tempo = new DateTime();
        System.out.println(tempo);
    }

    @AfterClass
    public static void end(){
        System.out.println("End test!");
        System.out.println(new Period(tempo, new DateTime()));
    }

    @Test
    public void converterTest(){
        assertEquals(1223, prova.stringToIntConverter("1223"));
    }

}
