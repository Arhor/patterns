package dev.arhor.pattern.behavioral.observer;

public interface Observable<T> {

    static <T> Observable<T> of(T value) {
        return new AbstractObservable<>(value) {
        };
    }

    T getValue();

    void setValue(T value);

    void subscribe(Observer<T> observer);

    void unsubscribe(Observer<T> observer);

    void notifyObservers();
}
