package ModularSoftwareDesign.BankExample;

import java.util.Scanner;

public class BankProgram {

    public static void main(String[] args) {
        BankClient client = new BankClient(new Scanner(System.in), new Bank());
        client.run();
    }
}
