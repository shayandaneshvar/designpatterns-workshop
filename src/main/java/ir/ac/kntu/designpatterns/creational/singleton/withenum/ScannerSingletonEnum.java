package ir.ac.kntu.designpatterns.creational.singleton.withenum;

import java.util.Scanner;

public enum ScannerSingletonEnum {
    INSTANCE;
    private final Scanner scanner = new Scanner(System.in);

    public String read() {
        return scanner.nextLine();
    }

}

class test {
    public static void main(String[] args) {
        ScannerSingletonEnum.INSTANCE.read();
    }
}
