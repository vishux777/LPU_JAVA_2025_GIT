//Encapsulation ->
/*
 * It refers to the bundling of data members (variables) and member functions (methods) in a single unit (class) while restricting the direct access.
 * It is often used to achieve data hiding and data protection by making variables private and providing public getter and setter methods to access and modify the data
 */

class BankAccount{
    private String accountHolderName;
    private double balance;

    BankAccount(String accountHolderName, double balance){
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    //getter method to get the name
    String getAccountHolderName(){
        return accountHolderName;
    }

    //setter method for setting the name
    void setAccountHolderName(String newName){
        this.accountHolderName = newName;
    }


    //getter for balance
    double getBalance(){
        return balance;
    }

    //setter for balance
    void setBalance(double balance){
        if(balance >= 0) this.balance = balance;
        else System.out.println("Invalid, balance cannot be negative");
    }

    //deposite

    void deposite(double amount){
        if(amount  >= 0){
            balance += amount;
            System.out.println("Deposited amount : " + amount);
        }
        else{
            System.out.println("Amount should be greater than 0");
        }
    }

    //withdraw

    void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn amount : " + amount);
        }
        else{
            System.out.println("Invalid withdraw amount");
        }
    }
}

public class encapsulation_1 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Marry", 100);

        System.out.println("Account holder name : " + b1.getAccountHolderName());
        System.out.println("Current balance : " + b1.getBalance());

        b1.setBalance(1000);
        System.out.println("Updated balance " + b1.getBalance());

        b1.withdraw(5000);
        System.out.println("Updated balance " + b1.getBalance());

    }
}


// Create a class Employee with name, employeeId, and salary as private fields.
//Implement getter methods to display name, employeeId, and salary.
// Implement setter validation (salary cannot be negative).
// Provide a method increaseSalary(double amount).