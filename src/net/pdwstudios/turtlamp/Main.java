package net.pdwstudios.turtlamp;

import static net.pdwstudios.turtlamp.codes.BasicCodes.*;

public class Main {
    public static void main(String[] args) {
        info("Welcome to Turtlamp's Remake " + version + "!");
        info("Your Operating System is " + System.getProperty("os.name"));
        Display display = new Display();
        display.createWindow();
    }
}
