package ch_17;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class TempSubscriber implements Subscriber<TempInfo> {

    private Subscription subscription;

    @Override
    public void onSubscribe(Subscription s) {
        this.subscription = s;
        subscription.request(1);
    }

    @Override
    public void onNext(TempInfo tempInfo) {
        System.out.println(tempInfo);
        subscription.request(1);
    }

    @Override
    public void onError(Throwable t) {
        System.out.println(t.getMessage());
    }

    @Override
    public void onComplete() {
        System.out.println("Done!");
    }
}
