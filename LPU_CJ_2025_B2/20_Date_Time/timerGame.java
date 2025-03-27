import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.Random;

public class timerGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(20);
        int userGuess = 0;
        
        System.out.println("Welcome to Number Guessing Game, you have 10 Seconds to guess");
        System.out.println("Start Guessing...");

        LocalTime satrtTime = LocalTime.now();

        while(true){

            System.out.print("Enter your guess : ");
            userGuess = scanner.nextInt();

            if(userGuess == randomNumber){
                LocalTime endTime = LocalTime.now();
                long timeTaken = ChronoUnit.SECONDS.between(satrtTime, endTime);
                System.out.println("Corrext! You guessed correct answer in : " + timeTaken + "s");
                break;
            }
            else if(userGuess < randomNumber){
                System.out.println("Too Low, Try again");
            }
            else{
                System.out.println("Too High, Try again");
            }

            long gamePlayingTime = ChronoUnit.SECONDS.between(satrtTime, LocalTime.now());

            if(gamePlayingTime > 10){
                //Lose
                System.out.println("Game Over,the correct answer was : " + randomNumber);
                break;
            }

        }

        scanner.close();
    }
}
