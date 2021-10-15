package Assignment11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FindExceptions1 {
    public static  void main(String[]args){
        try {
            Scanner input = new Scanner(System.in);

            int num = input.nextInt();
            if (num != 0) {
                throw new Exception("not zero");

            }
            System.out.print("I am happy with the input");
        }
        catch(InputMismatchException e){
            System.out.print("Invalid Entry");

        }
        catch(Exception e){

            System.out.print("Error : "+ e.getMessage());
        }
        /**
         a) input=-1
         -1!=0;=>true
         output=Error:not zero
         b) input=0;
         if(0!=0) false this condition
         so output=I am happy with the input
         c) input=12xy=> string
         output =Invalid Entry//InputMismatchException e
         */
    }
    }

