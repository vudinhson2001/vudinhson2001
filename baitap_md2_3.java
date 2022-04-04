
import java.util.Scanner;

public class baitap_md2_3 {
    public static void main(String[] args) {
        float wigth;
        float height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Chieu Rong :");
        wigth = sc.nextFloat();
        System.out.println("Chieu Dai : ");
        height = sc.nextFloat();
        float dientich = wigth * height;
        System.out.println("Dien Tich = " + dientich);
    }
}
