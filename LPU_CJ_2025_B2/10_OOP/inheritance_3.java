//Types of inheritance

//-------------------------------------------
//1. Single inheritance -> A single child extends a single parent class

// class Parent{
//     void show(){
//         System.out.println("From parent");
//     }
// }

// class Child extends Parent{
//     void display(){
//         System.out.println("From Child");
//     }
// }

//-------------------------------------------
//2. Multilevel inheritance -> A class is derieved from  another derieved class

// class A{
//     void printA(){
//         System.out.println("From A");
//     }
// }

// class B extends A{
//     void printB(){
//         System.out.println("From B");
//     }
// }

// class C extends B{
//     void printC(){
//         System.out.println("From C");
//     }
// }

//-------------------------------------------
//3. Hierarchical inheritance -> A single parent class is inherited by multiple child classes

// class Parent{
//     void show(){
//         System.out.println("From Parent");
//     }
// }

// class Child1 extends Parent{
//     void display1(){
//         System.out.println("From child 1");
//     }
// }

// class Child2 extends Parent{
//     void display2(){
//         System.out.println("From child 2");
//     }
// }

//-------------------------------------------
// 4. Multiple inheritance -> NOT SUPPORTED IN JAVA with classes

// class Parent1{

// }

// class Parent2{
    
// }

// class Child extends Parent1, Parent2{

// }

//possible via interface
// interface Parent1{

// }
// interface Parent2{

// }

// class Child implements Parent1, Parent2{

// }


public class inheritance_3 {
    public static void main(String[] args) {

    }
}


// Create a base class Vehicle with properties speed and fuelCapacity.
// Create subclasses Car and Bike that inherit Vehicle and have their own methods.