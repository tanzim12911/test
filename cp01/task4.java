package cp01;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        if (year % 4 == 0 || (year % 400 == 0 && year % 100 == 0))
            System.out.println(year + ": true");
        else
            System.out.println(year + ": false");
    }
}
