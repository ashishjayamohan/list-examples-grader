import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.util.ArrayList;

public class TestListExamples {
    @Test
    public void test() {
        List<String> sample1 = new ArrayList<String>();
        List<String> sample2 = new ArrayList<String>();
        sample1.add("a");
        sample1.add("b");
        sample1.add("c");
        sample1.add("d");
        sample2.add("e");
        sample2.add("f");
        sample2.add("g");
        sample2.add("h");
        List<String> sample3 = new ArrayList<>();
        sample3.add("a");
        sample3.add("b");
        sample3.add("c");
        sample3.add("d");
        sample3.add("e");
        sample3.add("f");
        sample3.add("g");
        sample3.add("h");
        assertArrayEquals(sample3.toArray(), ListExamples.merge(sample1, sample2).toArray());
    }

    @Test
    public void failTest() {
        assertEquals(5, 2);
    }
}
