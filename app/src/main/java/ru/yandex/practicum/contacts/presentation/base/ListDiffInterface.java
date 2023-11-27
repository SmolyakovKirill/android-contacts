package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T> {
    <T>boolean theSameAs(T object);

    boolean equals(Object object);
}
