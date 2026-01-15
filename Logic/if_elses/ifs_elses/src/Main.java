import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        var insertion = new Scanner((System.in));
        System.out.print("YOUR NAME: ");
        var name = insertion.next();

        System.out.print("YOUR AGE: ");
        var age = insertion.nextInt();

        // Emancipated
        System.out.print("IS EMANCIPATED? ");
        //IGNORING S OR s
        var isEmancipated = insertion.next().equalsIgnoreCase("s");


        //CONDITIONS CAN WRITE LIKE THIS//
        /*
         var canDrive = (age >= 18) || (age >= 16 && isEmancipated);
         var message = canDrive ? name + ", you can drive! \n" : name + ", you cannot drive!"


         if (canDrive){
            System.out.printf("%s, you can drive!", name);
         }

         */



        //CHECKING...
        if (age >= 18){

            System.out.printf("%s, you can drive!", name);
        }
        else if (age >= 16 && isEmancipated){
            System.out.printf("%s, you're %s years old, but you're emancipated and can to drive! Enjoy.",name, age);
        }
        else{
            System.out.printf("%s, you can't Drive!", name);
        }

        System.out.println("\nEnd If");

    }
}