import java.util.Scanner;

public class Beec1170 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i = in.nextInt();

        while(i != 0)
        {
            double food = in.nextDouble();

            int count = 0;

            while (food > 1)
            {
                food/=2;
                count++;
            }


            System.out.println(count + " dias");
            i--;
        }
    }
}
