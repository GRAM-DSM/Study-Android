public class BankAccount {
    private int balance;
    private Person owner;
    // 파라미터 : 입금할 액수(정수)
    // 리턴 : 성공여부(불린)
    public BankAccount(int pBalance){
        if(pBalance < 0){
            balance = 0;
        }
        else{
            balance = pBalance;
        }
    }
    public BankAccount(Person pOwner){
        owner = pOwner;
        balance = 0;
    }

    public BankAccount(int pBalance, Person pOwner){
        if(pBalance < 0){
            balance = 0;
        }
        else{
            balance = pBalance;
        }
        owner = pOwner;

    }

    public void setOwner(Person newOwner){
        owner = newOwner;
    }

    public Person getOwner(){
        return owner;
    }
    public void setBalance(int newBalance){
        balance = newBalance;
    }
    public int getBalance(){
        return balance;
    }

    boolean deposit(int amount) {
        if(amount < 0 || owner.getCashAmount() < amount){
            System.out.println("입금 실패입니다. 잔고: " + balance + "원, "
                    + "현금: " + owner.getCashAmount() + "원");
            System.out.println("false");
            return false;
        }
        else{
            owner.setCashAmount(owner.getCashAmount() - amount);
            balance += amount;
            System.out.println(amount + "원 " + "입금하였습니다. " + "잔고: "
                    + balance + "원, 현금: " + owner.getCashAmount() + "원");
            System.out.println("true");
            return true;
        }
    }

    // 파라미터 : 출금할 액수(정수)
    // 리턴 : 성공여부(불린)
    boolean withdraw(int amount) {
        if(amount < 0 || amount > balance){
            System.out.println("출금 실패입니다. 잔고: " + balance + "원, 현금: "
                    + owner.getCashAmount() + "원");
            System.out.println("false");
            return false;
        }
        else{
            balance -= amount;
            owner.setCashAmount(owner.getCashAmount() + amount);
            System.out.println(amount + "원 출금하였습니다. 잔고: " + balance
                    + "원, 현금: " + owner.getCashAmount() + "원");
            System.out.println("true");
            return true;
        }
    }

    public boolean transfer(Person to, int amount){
        return transfer(to.getAccount(), amount);
    }
    public boolean transfer(BankAccount to, int amount) {
        if (amount < 0 || amount > balance) {
            System.out.println("false - from: " + owner.getName()
                    + ", to: " + to.getOwner().getName()
                    + ", amount: " + amount
                    + ", balance: " + balance);
            return false;
        } else {
            balance -= amount;
            to.balance += amount;
            System.out.println( "true - from: " + owner.getName()
                    + ", to: " + to.getOwner().getName()
                    + ", amount: " + amount
                    + ", balance: " + balance);
            return true;
        }

    }
}