package dev.arhor.pattern.behavioral.observer;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

class ObserverTest {

    @Test
    void notifyTest() {
        // given
        int initialValue = 0;
        int newValue = 1;

        var observable = Observable.of(initialValue);
        var observer = spy(new Observer<Integer>() {
            @Override
            public void notify(Integer newValue) {
            }
        });

        observable.subscribe(observer);

        // when
        observable.setValue(newValue);

        // then
        verify(observer).notify(newValue);
    }
}