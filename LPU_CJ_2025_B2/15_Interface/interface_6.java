// Create an interface Payable with a method calculatePay().
// Implement FullTimeEmployee and PartTimeEmployee classes.
// Print the calculated salary for both employees.


interface Payable{
    void calculatePay();
}

class FullTimeEmployee implements Payable{
    int salary;

    FullTimeEmployee(int val){
        salary = val;
    }

    public void calculatePay(){
        System.out.println(salary);
    }
}

// class partTimeEmployee implements Payable{

// }

public class interface_6 {
    
}
