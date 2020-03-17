import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int n1=sca.nextInt();
        System.out.println("Enter Second  number : ");
        int n2=sca.nextInt();
        int gcd = 1;
            for(int i = 1; i <= n1 && i <= n2; ++i)
            {
                // Checks if i is factor of both integers
                if(n1 % i==0 && n2 % i==0)
                    gcd = i;
            }
            System.out.printf("G.C.D of %d and %d is %d", n1, n2, gcd);
        }
}