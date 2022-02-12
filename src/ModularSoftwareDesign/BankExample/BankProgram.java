package ModularSoftwareDesign.BankExample;

import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Logger;

public class BankProgram {

    /* Configuration Class.
        - Enables users to reconfigure the behavior of the program by simply modifiying the class
    */
    public static void main(String[] args) {

        // First
        BankClient client = new BankClient(new Scanner(System.in), new Bank(new HashMap<>(), 0));
        client.run();
    }
}
