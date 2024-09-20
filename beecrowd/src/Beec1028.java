import java.util.Scanner;

public class Beec1028 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 0; i < n; i++)
        {

            int a = in.nextInt();
            int b = in.nextInt();

            if(a < b)
            {
                int temp = a;
                a = b;
                b = temp;
            }

            while (b!=0)
            {
                int temp = a;
                a = b;
                b = temp % b;
            }

            System.out.println(a);

        }




//        for (int i = 0; i < n; i++) {
//            int a = in.nextInt(); //8
//            int b = in.nextInt(); //12
//
//            if (a < b)
//            {
//                int temp = a;
//                a = b;
//                b = temp;
//            }
//
//            while(b != 0)
//            {
//                int temp = a;// 12 // 8
//                a = b;// a = 8 // 4
//                b = temp % b; // b = 12%8 = 4 // 8%4 = 0
//            }
//
//            System.out.println(a);
//
//
//        }
    }

}
