public class Account2 {
    private String pname;
    private double balance;

    public Account2(String name, double balance){
        this.pname = name;
        if (balance > 0.0){
            this.balance = balance;
        }
    }
    public void deposit(double depositAmount){
        if (depositAmount > 0.0){
            balance += depositAmount;
        }
    }
    public double getBalance(){
        return balance;
    }
    public void setName(String name){
        this.pname = name;
    }
    public String getName(){
        return pname;
    }

}
