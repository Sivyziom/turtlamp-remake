package net.pdwstudios.turtlamp;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static net.pdwstudios.turtlamp.codes.BasicCodes.*;
import static net.pdwstudios.turtlamp.codes.ColourCodes.*;

public class Display extends Canvas implements Runnable {

    private static final int width = 1900;
    private static final int height = 1040;

    private Thread thread;
    private boolean running = false;

    private Renderer renderer;

    public Display(){
        renderer = new Renderer(width, height);
    }

    private void startThread(){
        if(running)return;
        running = true;
        thread = new Thread(this);
        thread.start();
        info("Started new thread");
    }

    public void createWindow(){
        JFrame frame = new JFrame("Turtlamp " + version);
        frame.add(this);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        if(System.getProperty("os.name").startsWith("Windows")){
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        }
        if(System.getProperty("os.name").startsWith("Linux")){
            GraphicsDevice graphics = GraphicsEnvironment.getLocalGraphicsEnvironment()
                    .getDefaultScreenDevice();
            graphics.setFullScreenWindow(frame);
        }
        frame.setSize(width, height);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setBackground(Color.BLUE);
        startThread();
    }

    @Override
    public void run() {
        while(running){
            tick();
            render();
        }
    }

    private void tick(){}

    private void render(){}

    private void stop(){
        if(!running)return;
        running = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            fatal_error("Couldn't stop thread!");
        }
    }
}