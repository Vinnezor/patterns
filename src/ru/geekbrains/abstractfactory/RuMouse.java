package ru.geekbrains.abstractfactory;

public class RuMouse implements Mouse {

    @Override
    public void click() {
        System.out.println("щелчок мышью");
    }

    @Override
    public void dbclick() {
        System.out.println("Двойной щелчок мышью");
    }

    @Override
    public void scroll(int direction) {
        if(direction > 0){
            System.out.println("Скроллим вверх мышью");
        } else if(direction < 0) {
            System.out.println("Скроллим вниз мышью");
        } else {
            System.out.println("Скроллим на месте мышью");
        }

    }
}
