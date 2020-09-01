package com.example.restservice;

@Inform(idk_value = 3)
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}

class SomeClass {
    void method() {
        System.out.println("Работает метод родительского класса.");
    }
}

class AnotherClass extends SomeClass { // наследуем методы SomeClass в новом классе
    @Override
    void method() { // переопределяем метод
        System.out.println("Работает метод класса-потомка.");
    }
}
