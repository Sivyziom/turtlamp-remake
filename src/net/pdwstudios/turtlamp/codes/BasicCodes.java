package net.pdwstudios.turtlamp.codes;

import static net.pdwstudios.turtlamp.codes.ColourCodes.*;

public class BasicCodes {
    public static final String version = "1.0 Alpha";


    public static void info(String str){
        System.out.println(blue + "[INFO] " + str + reset);
    }

    public static void warning(String str){
        System.out.println(yellow + "[WARNING] " + str + reset);
    }

    public static void error(String str){
        System.out.println(red + "[ERROR] " + str + reset);
    }

    public static void fatal_error(String str){
        System.out.println(red + "[FATAL ERROR] " + str + reset);
        System.exit(1);
    }
}
