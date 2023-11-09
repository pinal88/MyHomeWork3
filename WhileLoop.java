package myhomeworkpackage3;

public class WhileLoop {
    public static void main(String[] args) {
        int a = 20;
// print even number
        while (a >= 1) {
            if (a % 2 == 0)
                System.out.println(a+"even number");
            a--;
        }

    //print odd number
    int b =20;
    while (b>=1){
        if (b%2 != 0)
            System.out.println(b+"odd number");
        b--;
    }
    //table 9

    int i=1;
    while (i<=10){
        System.out.println(9+"*"+i+"="+(9*i));
        i++;

    }}
}