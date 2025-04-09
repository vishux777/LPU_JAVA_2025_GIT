
// class A implements Runnable{
//     public void run(){

//         System.out.println(Thread.currentThread().getName());
//         for(int i = 1; i <= 10; i++){

//             System.out.println("111");

//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B implements Runnable{
//     public void run(){
//         System.out.println(Thread.currentThread().getName());

//         for(int i = 1; i <= 10; i++){

//             System.out.println("55");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }
public class threads_2 {
    public static void main(String[] args) {
        Runnable obj1 = () -> {

                System.out.println(Thread.currentThread().getName());
                for(int i = 1; i <= 10; i++){
        
                    System.out.println("111");
        
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        };

        Runnable obj2 = () -> {
            System.out.println(Thread.currentThread().getName());
            for(int i = 1; i <= 10; i++){
    
                System.out.println("55");
    
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
