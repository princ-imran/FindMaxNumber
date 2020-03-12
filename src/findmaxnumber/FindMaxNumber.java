/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findmaxnumber;
import java.util.Scanner;
/**
 *
 * @author Spy Hacker
 */
public class FindMaxNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner myObj = new Scanner(System.in);
      int max, arry, i;
      System.out.print("Enter how many input number: ");
      arry = myObj.nextInt();  
      int num[];
      num = new int[arry];      
      for (i=0; i<arry; i++){
        System.out.print(i+" yout number: ");
        num[i] = myObj.nextInt();
     }
     max = num[0];
     for(i=0; i<arry; i++){
        if(max < num[i]){
            max = num[i];
        }
     }
     System.out.println(max+" is large number");
    }
    
}
