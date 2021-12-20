
import java.io.*;
import java.util.Arrays;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.swing.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "home", value = "/homeServlet", urlPatterns = {"/homeServlet"})
public class HomeServlet extends HttpServlet {


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("\"application/x-www-form-urlencoded");
        PrintWriter writer = response.getWriter();

        String givenNumber = request.getParameter("givenNumber");
        String output;

        if(isInteger(givenNumber)){
            output = findNext(givenNumber);
        } else{
            output = "Something went wrong, please try again";
        }

        writer.println(output);

    }


    private static boolean isInteger(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Please input valid Integer");
        }
        return false;
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
