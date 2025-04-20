// import javax.swing.plaf.nimbus.State;
// import java.sql.*;

// public class Main {

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


//        try{ // retrive data from table using statement interface
//            Connection connection = DriverManager.getConnection(url, username, password);
//            Statement statement = connection.createStatement();
//            String query = "select * from students";
//            ResultSet resultSet = statement.executeQuery(query);
//
//            while(resultSet.next()){
//                int id = resultSet.getInt("id");
//                String name = resultSet.getString("name");
//                int age = resultSet.getInt("age");
//                double marks = resultSet.getDouble("marks");
//
//                System.out.println("ID : " + id + " , Name : " + name + " , Age : " + age + " , Marks : " + marks);
//            }
//        }

//        try{ //reterieve data using preparedInterface
//            Connection connection = DriverManager.getConnection(url, username, password);
//            String query = "SELECT marks FROM students WHERE id = ?";
//            PreparedStatement preparedStatement = connection.prepareStatement(query);
//            preparedStatement.setInt(1,1);
//
//            ResultSet resultSet = preparedStatement.executeQuery();
//            if(resultSet.next()){
//                double marks = resultSet.getDouble("marks");
//                System.out.println("Marks : " + marks);
//            }
//            else{
//                System.out.println("Marks not found");
//            }
//
//        }
//        try{ //Insert using statement interface
//            Connection connection = DriverManager.getConnection(url, username,password);
//            Statement statement = connection.createStatement();
//
//            String query = String.format("INSERT INTO students(name, age, marks) VALUES ('%s',%d, %f)", "Jack", 25, 75.3);
//
//            int rowsAffected = statement.executeUpdate(query);
//            if(rowsAffected > 0){
//                System.out.println("Data Inserted successfully");
//            }
//            else{
//                System.out.println("Data not inserted");
//            }
//
//        }

//        try{ //insert using preparedInterface
//            Connection connection = DriverManager.getConnection(url,username, password);
//            String query = "INSERT INTO students(name, age, marks) VALUES(?, ?, ?)";
//            PreparedStatement preparedStatement = connection.prepareStatement(query);
//            preparedStatement.setString(1, "Marry");
//            preparedStatement.setInt(2,24);
//            preparedStatement.setDouble(3,64.3);
//
//            int rowAffected = preparedStatement.executeUpdate();
//
//            if(rowAffected > 0){
//                System.out.println("Data Inserted successfully");
//            }else{
//                System.out.println("Data not inserted");
//            }
//        }

//        try{ //Update using statement interface
//            Connection connection = DriverManager.getConnection(url,username,password);
//            Statement statement = connection.createStatement();
//
//            String query = String.format("UPDATE students SET marks = %f WHERE id = %d", 50.5, 1);
//
//            int rowsAffected = statement.executeUpdate(query);
//            if(rowsAffected > 0){
//                System.out.println("Data updated successfully");
//            }else{
//                System.out.println("Data not updated");
//            }
//        }

//        try{ //update using preparedInterface
//            Connection connection = DriverManager.getConnection(url,username,password);
//            String query = "UPDATE students SET marks = ? WHERE id = ?";
//            PreparedStatement preparedStatement = connection.prepareStatement(query);
//
//            preparedStatement.setDouble(1, 99.9);
//            preparedStatement.setInt(2,3);
//            int rowsAffected = preparedStatement.executeUpdate();
//            if(rowsAffected > 0){
//                System.out.println("Data updated");
//            }else{
//                System.out.println("Data not updated");
//            }
//
//
//        }

//        try { //Delete using statement interface
//            Connection connection = DriverManager.getConnection(url,username,password);
//            Statement statement = connection.createStatement();
//
//            String query = "DELETE FROM students WHERE id = 2";
//
//            int rowsAffected = statement.executeUpdate(query);
//            if(rowsAffected > 0){
//                System.out.println("Data deleted successfully");
//            }else{
//                System.out.println("Data not deleted");
//            }
//        }

//        try{ //Delete using preparedInterface
            //homework
//        }
//        catch (SQLException e){
//            System.out.println(e.getMessage());
//        }
    }
}