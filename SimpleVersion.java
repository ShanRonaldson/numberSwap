import java.util.Scanner;

public class SimpleVersion {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        outputMessage("Input a number between 0 and 9223372036854775807: ");
        String givenNumber = input.nextLine();

        String message;
        if(isInteger(givenNumber)){
            message = findNext(givenNumber)
        } else{
            message = "Something went wrong, please try again."
        }

        outputMessage(message);

    }

    private static boolean isInteger(String num){
        try {
            Integer.parseInt(num);
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Please input valid Integer");
        }
        return false;
    }

    private static void outputMessage(String message){
        System.out.print(message);
    }

    private static void swap(char[] numberArray, int smallestDigit, int length) {
        char temp = numberArray[smallestDigit];
        numberArray[smallestDigit] = numberArray[length];
        numberArray[length] = temp;
    }

    public static String findNext(String givenNumber) {
        int findSmallest;
        String output;

        char[] numberArray = givenNumber.toCharArray();
        int length = numberArray.length;

        /*
        find the number that is the smaller than the digit next to it
         */
        for (findSmallest = length - 1; findSmallest > 0; findSmallest--) {
            if (numberArray[findSmallest] > numberArray[findSmallest - 1]) {
                break;
            }
        }

        if (findSmallest == 0) {
            output = "No answer";
        } else {
            int min = findSmallest;
            int numAfterSmallest = numberArray[findSmallest - 1];

            for (int j = findSmallest + 1; j < length; j++) {
                if (numberArray[j] > numAfterSmallest && numberArray[j] < numberArray[min]) {
                    min = j;
                }
            }

            swap(numberArray, findSmallest - 1, min);

            Arrays.sort(numberArray, findSmallest, length);

            String convertedNumber = String.copyValueOf(numberArray);

            output = "Next number with same set of digits is: " + convertedNumber;

        }

        return output;
    }


}
