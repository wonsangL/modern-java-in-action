package ch_17;

import org.junit.Test;
import org.reactivestreams.Publisher;

public class ReactorTest {
    @Test
    public void reactorTest() {
        getTemperatures("New York").subscribe(new TempSubscriber());
    }

    private static Publisher<TempInfo> getTemperatures(String town) {
        return subscriber -> subscriber.onSubscribe(new TempSubscription(subscriber, town));
    }
}
