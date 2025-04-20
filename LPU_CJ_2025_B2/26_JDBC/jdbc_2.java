// import java.sql.*;
// import java.util.Scanner;

// public class batch_processing {
//     private static final String url = "jdbc:mysql://localhost:3306/mydb2";
//     private static final String username = "root";
//     private static final String password = "Pass@1212";


//     public static void main(String[] args) {
//         try{
//             Class.forName("com.mysql.cj.jdbc.Driver");
//         }
//         catch (ClassNotFoundException e){
//             System.out.println(e.getMessage());
//         }

//         try{
//             Connection connection = DriverManager.getConnection(url, username, password);
//             Statement statement = connection.createStatement();
//             Scanner scanner = new Scanner(System.in);

//             while(true){
//                 System.out.print("Enter name : " );
//                 String name = scanner.next();
//                 System.out.print("Enter Age : ");
//                 int age = scanner.nextInt();
//                 System.out.print("Enter marks : ");
//                 double marks = scanner.nextDouble();
//                 System.out.print("Enter more data? (Y/N");
//                 String choice = scanner.next();
//                 String query = String.format("INSERT INTO students(name, age, marks) VALUES('%s', %d, %f)", name, age, marks);
//                 statement.addBatch(query);

//                 if(choice.equalsIgnoreCase("N")){
//                     break;
//                 }
//             }

//             int[] rowAffected = statement.executeBatch();



//         } catch (SQLException e) {
//             throw new RuntimeException(e);
//         }
//     }
// }
