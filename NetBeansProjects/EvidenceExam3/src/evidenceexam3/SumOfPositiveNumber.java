
package evidenceexam3;

import java.util.Scanner;

public class SumOfPositiveNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number");
        int numbers=input.nextInt();
        int sum=0;
      while(numbers>=0){
          sum=sum+numbers;
          System.out.println("Entere Number");
          numbers=input.nextInt();
      }
      input.close();
        System.out.println("sum is "+ sum);
    }
}
