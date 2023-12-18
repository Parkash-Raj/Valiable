import java.util.*;

class NumberGame {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int maxAttempts = 10;

        int score = 0;




        System.out.println("Welcome to the Number Guessing Game!");

        do
        {




            int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

            int attempts = 0;

            boolean hasGuessedCorrectly = false;

            System.out.println("\nNew round! Try to guess the number between " + lowerBound + " and " + upperBound + ".");





            while (attempts < maxAttempts)
            {

                System.out.print("Enter your guess: ");

                int userGuess = scanner.nextInt();
                attempts++;


                if (userGuess == targetNumber) {

                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");

                    hasGuessedCorrectly = true;


                    break;

                }
                else if (userGuess < targetNumber) {

                    System.out.println("Too low! Try again.");



                }
                else {

                    System.out.println("Too high! Try again.");
                }
            }




            if (!hasGuessedCorrectly)
            {
                System.out.println("Sorry! You've reached the maximum number of attempts. The correct number was: " + targetNumber);
            }
            else
            {
                score++;



            }

            System.out.print("Do you want to play again? (yes/no): ");




        }

        while (scanner.next().equalsIgnoreCase("yes"));



        System.out.println("Thanks for playing! Your total score is: " + score);






    }
}
