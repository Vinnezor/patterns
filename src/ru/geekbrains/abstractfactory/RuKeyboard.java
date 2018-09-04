package ru.geekbrains.abstractfactory;

public class RuKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.println("печатаем по русски");
    }

    @Override
    public void println() {
        System.out.println("печатем с переводом строки по русски");
    }
}
