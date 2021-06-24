package net.pdwstudios.turtlamp;

public class Renderer {
    public final int width;
    public final int height;
    public final int[] pixels;

    public Renderer(int width, int height){
        this.width = width;
        this.height = height;
        pixels = new int[width * height];
    }

    public void draw(int xOffset, int yOffset){
        for(int y = 0; y < this.height; y++){
            int yPixel = y + yOffset;
        }
        for(int x = 0; x < this.width; x++){
            int yPixel = x + xOffset;
        }
    }
}
