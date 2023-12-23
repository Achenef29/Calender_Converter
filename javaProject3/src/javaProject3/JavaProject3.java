package javaProject3;

import java.util.*;

public class JavaProject3 {

    public static void main(String[] args) {
        int op = 0;
        ethiogrego et = new ethiogrego();
        gregoethio gre = new gregoethio();
        Scanner s = new Scanner(System.in);
        // System.out.println("please enter ethiopian day, month, year respectively");
        System.out.println("=====================================================================================================");
        System.out.println("this program is used to convert ethiopian calander to gregorian  and gregorian to ethiopian calander ");
        System.out.println("=====================================================================================================");
        for (op = 0;; op++) {
            System.out.println("please choose the following option");
            System.out.println("=====================================================================");
            System.out.println("1  ethiopian calander to gregorian calander");
            System.out.println("2  gregorian calander to ethiopian calander");
            System.out.println("3  exit ");
            op = s.nextInt();
            if (op == 1) {
                et.ethioconverter();
            }
            if (op == 2) {
                gre.gregoconverter();
            }
            if (op == 3) {
                System.out.println("the program is terminated");
                break;
            }
        }
    }
}
