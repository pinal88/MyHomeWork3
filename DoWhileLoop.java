package myhomeworkpackage3;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        int d = 2;
        do {
            System.out.println(i+"odd number");
            i = i + 2;
        } while (i <= 20);
        {
            do {
                System.out.println(d+"even number");
                d = d + 2;
            } while (d <= 20);
        }
        int k = 1;
        do {
            System.out.println(8 + "*" + k + "=" + (8 * k));
            k++;
        } while (k <= 10);
    }
}
