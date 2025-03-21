
class Bank{

    static class Transaction{
        void process(){
            System.out.println("Transaction Completed");
        }
    }
}


public class annonymousInner_2 {
    public static void main(String[] args) {
        
        Bank.Transaction obj = new Bank.Transaction();

        obj.process();

    }
}



// Create a class Bank with a static nested class Transaction.
// The Transaction class should have a method process() that prints "Transaction Completed".
// Demonstrate creating the nested class object without creating a Bank object.