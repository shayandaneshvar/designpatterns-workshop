package ir.ac.kntu.designpatterns.creational.singleton.eager;

import java.util.Scanner;
//Eager Version
public class ScannerSingleton {
    private static final ScannerSingleton INSTANCE = new ScannerSingleton();
    private Scanner scanner;

    private ScannerSingleton() {
        scanner = new Scanner(System.in);
    }

    public static ScannerSingleton getInstance() {
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
