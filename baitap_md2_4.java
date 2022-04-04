import java.util.Scanner;

public class baitap_md2_4 {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("'a * x + b = c', vui long nhap:");
        Scanner sc = new Scanner(System.in);
        System.out.println("a :");
        double a = sc.nextDouble();
        System.out.println("b :");
        double b = sc.nextDouble();
        System.out.println("c :");
        double c = sc.nextDouble();
        if (a != 0) {
            double dapan = (c - b) / a;
            System.out.printf("x = %f!\n", dapan);
        }else{
            if(b==c){
                System.out.println("The solution is all x!");
            }else {
                System.out.print("No solution!");
            }
        }
    }
}
