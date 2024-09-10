package com.example.DrawLoterya.service;

public interface UserService<T> {
    void create(T  t);
    void update(T t);
    String get(String key);
}
