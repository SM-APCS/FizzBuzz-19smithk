/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

/**
 *
 * @author Kyle Smith
 * @class AP CSA
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //created "for" loop to create repetition
        for (int i = 0; i <= 100; i++)
        {
            //see if variable i is divisible by 3
            if (i % 3 == 0)
            {
                System.out.println("fizz");
            //see if the variable i is divisible by 5 as well as by the previous 3
                if (i % 5 == 0)
                {
                    System.out.println("FizzBuzz");
                }
            }
            //sees whether the variable i is JUST divisible by 5
            else if ( i % 5 == 0)
            {
                    System.out.println("buzz");
            }
        }

    }
    
}
