class Account{
    // Data security
    // account balance
    private double balance; 

    // login come authentication
    private boolean validate(String userName, String password){    
        return userName.equalsIgnoreCase("Shree Ram") && password.equals("Ram1234");
    }
    // methods: public methods
    public double getBalance(double balance){
        // perform authentication
        boolean result  = validate("Jai Shree Ram", "Ram1234");
        
        // withdrawing money
        if(result == true){
            // subtract private balance from current balance
            // this.balance = current balance
            this.balance = this.balance - balance;
            System.out.println("Withdrawing money from the bank......");
            System.out.println("Money withdrawn is: " + balance);
            System.out.println("Remaining balance: " + this.balance);
            return balance;
        }
        else{
            System.out.println("Invalid username or password. Please try again........");
            return 0.0f;
        }
    }

    public void setBalance(double balance){
        // 1st perform authetication
        boolean result = validate("Shree Ram", "Ram1234");

        if(result == true){
            // deposit the money
            this.balance = this.balance + balance;
            System.out.println("Amount Credited to the account successfully");
            System.out.println("Remaining Balance: " + this.balance);
        }
        else{
            // error message
            System.out.println("Invalid username or password. Please try again........");
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        System.out.println("************************** Welcome to Payemts Bank **************************");
        Account ac = new Account();
        System.out.println("Depositing money in the bank.........");
        ac.setBalance(1000.0);
        ac.setBalance(3407.0);
        
        double balance = ac.getBalance(500); // withdraw 500 rps
    }
}

