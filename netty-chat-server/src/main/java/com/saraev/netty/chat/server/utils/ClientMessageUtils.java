package com.saraev.netty.chat.server.utils;

public class ClientMessageUtils {
    public static String createOutputString(String clientName, String message) {
        return String.format("[%s]: %s\n", clientName, message);
    }
}
