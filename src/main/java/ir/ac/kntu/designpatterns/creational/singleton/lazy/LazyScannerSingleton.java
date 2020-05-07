package ir.ac.kntu.designpatterns.creational.singleton.lazy;

import java.util.Scanner;

public class LazyScannerSingleton {
    private static LazyScannerSingleton INSTANCE = null;
    private Scanner scanner;

    private LazyScannerSingleton() {
        scanner = new Scanner(System.in);
    }

    public static LazyScannerSingleton getInstance() {
        if(INSTANCE != null){
            INSTANCE = new LazyScannerSingleton();
        }
        return INSTANCE;
    }

    public String readLine() {
        return scanner.nextLine();
    }

    public Integer readInt() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return readInt();
        }
    }

    public void close() {
        scanner.close();
    }
}

