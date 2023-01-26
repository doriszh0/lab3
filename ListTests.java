import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
    @Test
    public void testFilter() {
        CheckString input1Checker = new CheckString();

        List<String> input1 = new ArrayList<String>();
        input1.add("happy");
        input1.add("depressed");
        input1.add("depressed");
        input1.add("delighted");
        input1.add("joyful");

        List<String> input2 = new ArrayList<String>();
        input1.add("happy");
        input1.add("sad");
        input1.add("apathetic");

        List<String> input1Correct1 = new ArrayList<String>();
        input1Correct1.add("depressed");
        input1Correct1.add("delighted");
        input1Correct1.add("joyful");

        List<String> input1Correct2 = new ArrayList<String>();
        input1Correct2.add("apathetic");
        input1Correct2.add("delighted");
        input1Correct2.add("depressed");
        input1Correct2.add("depressed");
        input1Correct2.add("happy");
        input1Correct2.add("joyful");
        input1Correct2.add("sad");

        assertEquals(input1Correct1, ListExamples.filter(input1, input1Checker));
        assertEquals(input1Correct2, ListExamples.merge(input2, input1));
    }
    
}