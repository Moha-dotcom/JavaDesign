package polymmorphism.BankExample;

public class CheckingAcc implements BankAccount{
    @Override
    public int getAcctNum() {
        return 0;
    }

    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public boolean isForeign() {
        return false;
    }

    @Override
    public void setForeign(boolean isforeign) {

    }

    @Override
    public void deposit(int amt) {

    }

    @Override
    public boolean hasEnoughCollateral(int loanamt) {
        return false;
    }
}
