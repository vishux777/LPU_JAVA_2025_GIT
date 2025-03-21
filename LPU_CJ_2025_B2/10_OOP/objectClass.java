class Car{
    String model;
    int price;

    public String toString(){
        return model + " : " + price;
    }

    public boolean equals(Car other){
        if(this.model.equals(other.model)){
            return true;
        }
        else return false;
    }
}

public class objectClass {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.model = "2020";
        c1.price = 100;

        Car c2 = new Car();
        c2.model = "2020";
        c2.price = 100;

        System.out.println(c1.equals(c2));
        // System.out.println(c1);
    }
}
