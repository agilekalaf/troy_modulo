import java.util.Scanner;
//use the import statement above to set up the Scanner variable 'reader'

//this is a class declaration which means the code could be used as a module
public class Main {

    //this is the main method required to 'run' the program
    public static void main (String []args){
        Scanner reader = new Scanner (System.in);          //the reader variable i mentioned above
        double num1;
        double num2;
        double num3;
        double num4;
        double num5;
        System.out.println ("Please enter five values for computation \n");
        System.out.print ("Value 1: ");
        num1 = reader.nextDouble();
        System.out.print ("");
        System.out.print ("Value 2: ");
        num2 = reader.nextDouble();
        System.out.print ("");
        System.out.print ("Value 3: ");
        num3 = reader.nextDouble();
        System.out.print ("");
        System.out.print ("Value 4: ");
        num4 = reader.nextDouble();
        System.out.print ("");
        System.out.print ("Value 5: ");
        num5 = reader.nextDouble();
        System.out.println ("");
        getAverage(num1, num2, num3, num4, num5);
        getModulus(num1, num5);
    } //ends main code

    //this method gets the average of all number entered
    public static void getAverage (double n1, double n2, double n3, double n4, double n5) {

        double av = (n1+n2+n3+n4+n5)/5;
        System.out.println ("The average of " + n1 + " , " + n2 + " , " + n3 + " , " + n4 + ",and " + n5 + " is " + av);

    } //end of getAverage

    //this method gets the modulus (remainder) of the first and fifth numbers (or whatever two numbers you give it)
    public static void getModulus (double d1, double d2) {

        double modulus = d1%d2;
        System.out.println ("The modulus of " + d1 + " and " + d2 + " is: " + modulus + "\n");

    } // end of getModulus
} // end class

