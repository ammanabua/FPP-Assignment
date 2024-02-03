package Assignment.Assignment12.Problem1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScoresInput {
    private static int getInputs(){
        Scanner sc = new Scanner(System.in);

        while (true) {
            try{
                System.out.println("Enter a score in the ranger (0 - 100): ");
                int score = sc.nextInt();

                if (score < 0 || score > 100){
                    throw new UnsupportedOperationException("Score must be in the range of 0 - 100");
                }

                return score;
            }
            catch(InputMismatchException e) {
                System.out.println("Invalid Input! Please enter number in the range of 0 - 100");

                sc.nextLine();
            }
            catch(UnsupportedOperationException e){
                throw e;
            }
        }
    }

    public static void main(String[] args) {
        try{
            int userScores = getInputs();

            System.out.println("You entered: " + userScores);
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid Input. Please enter a valid number in the range 0-100");
        }
        catch (UnsupportedOperationException e){
            System.out.println("UnsupportedOperationException: " + e.getMessage());
        }
    }
}
