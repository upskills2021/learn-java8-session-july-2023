package org.example.java8.func_interface;

@FunctionalInterface
public interface IStudentOps<T> {
    void create(T user);
}
