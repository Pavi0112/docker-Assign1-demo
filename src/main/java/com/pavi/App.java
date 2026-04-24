package com.pavi;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello from Docker + Jenkins + ECR 🚀");
        while (true) {
            try {
                Thread.sleep(5000);
                System.out.println("App is running...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
