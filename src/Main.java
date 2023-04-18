import java.util.Arrays;

public class Main  {
    public static void main(String[] args) {
        double[] digits = {2.4, 0.8, -1.2, 1.9, 3.4, -4.2, 3.2, -1.0, 2.5, 3.6, -3.1, 2.8, 1.2, -2.5, -2.6};
        double sum = 0.0;
        int coll = 0;
        boolean proverka = false;
        for (double foreach : digits ) {
            if (foreach < 0) {
                proverka = true;
            } else if (foreach > 0 && proverka) {
                sum += foreach;
                coll ++;
                System.out.println(foreach);

            }

        }
        System.out.println("арифметическое число " + sum/coll);
    }
}

