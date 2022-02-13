package polymmorphism.BankExample;

import java.util.HashMap;
import java.util.Set;

public class Bank {
    double rate = 2.5;
    private HashMap<Integer,Integer> accounts = new HashMap<>();
    int accno;

    public Bank(HashMap<Integer, Integer> accounts, int n) {
        this.accounts = accounts;
        this.accno = n;
    }

    private int nextacct = 0;
    public int newAccount() {
        int acctnum = nextacct++;
        accounts.put(acctnum, 0);
        return acctnum;
    }

    public int getBalance(int acctnum) {

        return accounts.get(acctnum);
    }
    public void deposit(int acctnum, int amt) {
        int balance = accounts.get(acctnum);
        accounts.put(acctnum, balance+amt);
    }

    public boolean authorizeLoan(int acctnum, int loanamt) {
        int balance = accounts.get(acctnum);
        return balance >= loanamt / 2;
    }

    public String toString() {
        Set<Integer> accts = accounts.keySet();
        String result = "The bank has " + accts.size()
                + " accounts.";
        for (int i : accts)
            result += "\n\tBank account " + i
                    + ": balance=" + accounts.get(i);
        return result;
    }
    public void addInterest() {
        Set<Integer> accts = accounts.keySet();
        for (int i : accts) {
            int balance = accounts.get(i);
            int newbalance = (int) (balance * (1 + rate));
            accounts.put(i, newbalance);
        }
    }


}
