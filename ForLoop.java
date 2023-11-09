package myhomeworkpackage3;

public class ForLoop {
    public static void main(String[] args) {
        //print even number 0 to 10
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0)
                System.out.println(i+"even number");
        }
        //print odd numbers
        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0)
                System.out.println(i+"odd number");
        }
        //print generate tables of 10
        for (int i = 0; i <= 10; i++) {
                System.out.println(10+"*"+i+"="+(10*i));
        }
    }
}