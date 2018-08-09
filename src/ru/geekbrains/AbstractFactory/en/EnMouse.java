package ru.geekbrains.AbstractFactory.en;

import ru.geekbrains.AbstractFactory.Mouse;

public class EnMouse implements Mouse {

    @Override
    public void click() {
        System.out.println("click");
    }

    @Override
    public void dbclick() {
        System.out.println("dbclick");
    }

    @Override
    public void scroll(int direction) {
        if(direction > 0){
            System.out.println("UP");
        } else if(direction < 0) {
            System.out.println("DOWN");
        } else {
            System.out.println("STOP");
        }

    }
}
