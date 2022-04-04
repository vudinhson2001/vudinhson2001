import java.util.Scanner;

public class baitap_md2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("tháng muốn đếm ngày: ");
        int month = sc.nextInt();
        switch (month) {
            case 2:
                System.out.println("thang '2' co 28 hoac 29 ngay");
                break;

            case 1:
                System.out.println("thang : " + month + " co 31 ngay");
                break;
            case 3:
                System.out.println("thang : " + month + " co 31 ngay");
                break;
            case 5:
                System.out.println("thang : " + month + " co 31 ngay ");
                break;
            case 7:
                System.out.println("thang : " + month + " co 31 ngay ");
                break;
            case 8:
                System.out.println("thang : " + month + " co 31 ngay");
                break;
            case 10:
                System.out.println("thang : " + month + " co 31 ngay");
                break;
            case 12:
                System.out.println("thang : " + month + " co 31 ngay");
                break;
            case 6:
                System.out.println("thang : " + month + " co 30 ngay");
                break;
            case 9:
                System.out.println("thang : " + month + " co 30 ngay");
                break;
            case 11:
                System.out.println("thang : " + month + " co 30 ngay");
                break;
            default:
                System.out.println("khong co");
                break;
        }
    }
}
