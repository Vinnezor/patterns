package ru.geekbrains.PublisherSubscriber.observers;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileObserver implements Observer {
    @Override
    public void handleEvent(int temp, int presser) {
        try {
            File f = File.createTempFile("temperature", ".txt");
            PrintWriter pw = new PrintWriter(f);
            pw.print("изменение температуры  temp = " + temp + " и давления presser = " + presser);
            pw.println();
            pw.flush();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
