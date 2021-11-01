package dev.arhor.pattern.behavioral.observer;

public interface Observer<T> {

    void notify(T newValue);
}
