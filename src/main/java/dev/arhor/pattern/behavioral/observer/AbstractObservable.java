package dev.arhor.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

abstract class AbstractObservable<T> implements Observable<T> {

    private final List<Observer<T>> observers = new ArrayList<>();

    private T value;

    AbstractObservable() {

    }

    AbstractObservable(T value) {
        this.value = value;
    }

    @Override
    public T getValue() {
        return value;
    }

    @Override
    public void setValue(T value) {
        this.value = value;
        notifyObservers();
    }

    @Override
    public void subscribe(Observer<T> observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer<T> observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer<T> observer : observers) {
            observer.notify(value);
        }
    }
}
