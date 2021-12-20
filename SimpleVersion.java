import java.util.Scanner;

public class SimpleVersion {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        outputMessage("Input a number between 0 and 9223372036854775807: ");
        String givenNumber = input.nextLine();


    }

    private static void outputMessage(String message){
        System.out.print(message);
    }

}
