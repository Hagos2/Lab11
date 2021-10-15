package Assignment11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FindExceptions2 {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
       try {
           int num = input.nextInt();
           if (num != 0) {
               throw new Exception("not zero");

           }
           System.out.println("I am happy with the input");
       }
        catch(InputMismatchException e){
            System.out.println("Invalid Entry");

        }
        catch(Exception e){

            System.out.println("Error : "+ e.getMessage());
        }
       finally {
           System.out.print("Finally clause Excited");
       }

        /**
         a) input=-1
         -1!=0;=>true
         output
         =>Error:not zero
         =>Finally clause Excited
         b) input=0;
         if(0!=0) false this condition
         so output
         =>I am happy with the input
        => Finally clause Excited
         c) input=12xy=> string
         output
         =>Invalid Entry//InputMismatchException e
        => Finally clause Executed
         */
    }
       }
