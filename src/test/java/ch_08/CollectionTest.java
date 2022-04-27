package ch_08;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CollectionTest {
    @Test
    public void collectionFactoryTest() {
        List<String> sampleList = Arrays.asList("a", "b");
        sampleList.add("c"); //UnsupportedOperationException 발생
    }
}
