package com;

public class weightonmars {



    public static void main(String[] args) {
        //How much you weigh on Mars
        float earthWeightkamanzi;
        float marsWeightkamanzi;
        double marsWgtInDblkamanzi;
        int marsWeightInIntkamanzi;

        earthWeightkamanzi=63;
        marsWeightkamanzi=(earthWeightkamanzi*0.38F);
        System.out.println(earthWeightkamanzi + "kg on Earth is " + marsWeightkamanzi+ "kg on Mars" );

        //from float to double
        marsWgtInDblkamanzi=marsWeightkamanzi;
        System.out.println("Kilograms on Mars after conversion to double" + marsWgtInDblkamanzi);

        //to 4 decimal places
        System.out.printf("Kilograms on Mars displayed to four decimal places: %.4f %n" , marsWgtInDblkamanzi);

        //a floating point type cast to integer
        marsWeightInIntkamanzi = (int)marsWgtInDblkamanzi;
        System.out.println("Kilograms on Mars when casted to integer " + marsWeightInIntkamanzi);

        //casting int type to char
        char c = (char)marsWeightInIntkamanzi;
        System.out.println("The ASCII table equivalent of marsWeightInInt is: " + c);


        //assign the value of performing some mathematical operation on the char character to the new int variable
        int exampleOfMathOnChar = c * c;
        System.out.println("An example of a mathematical operations on the char type: " + exampleOfMathOnChar);




    }
}
