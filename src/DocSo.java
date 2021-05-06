import java.util.Scanner;

public class DocSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int number = sc.nextInt();
        int a=number%10;
        int b=number/10;
        int c=number/100;
        String hangTram= null;
        String hangChuc = null;
        String hangDonVi = null;
        switch (number) {
            case 1:
                System.out.println("Một");
                break;
            case 0:
                System.out.println("Không");
                break;
            case 2:
                System.out.println("Hai");
                break;
            case 3:
                System.out.println("Ba");
                break;
            case 4:
                System.out.println("Bốn");
                break;
            case 5:
                System.out.println("Năm");
                break;
            case 6:
                System.out.println("Sáu");
                break;
            case 7:
                System.out.println("Bảy");
                break;
            case 8:
                System.out.println("Tám");
                break;
            case 9:
                System.out.println("Chín");
                break;
            case 10:
                System.out.println("Mười");
                break;
            case 100:
                System.out.println("Một trăm");
        }
        if(number>10 && number<100){
            switch (b){
                case 1:
                    hangChuc="Mười";
                    break;
                case 2:
                    hangChuc="Hai Mươi";
                    break;
                case 3:
                    hangChuc="Ba Mươi";
                    break;
                case 4:
                    hangChuc="Bốn Mươi";
                    break;
                case 5:
                    hangChuc="Năm Mươi";
                    break;
                case 6:
                    hangChuc="Sáu Mươi";
                    break;
                case 7:
                    hangChuc="Bảy Mươi";
                    break;
                case 8:
                    hangChuc="Tám Mươi";
                    break;
                case 9:
                    hangChuc="Chín Mươi";
                    break;    
            }
            switch (a){
                case 1:
                    hangDonVi="Mốt";
                    break;
                case 0:
                    hangDonVi="";
                    break;
                case 2:
                    hangDonVi="Hai";
                    break;
                case 3:
                    hangDonVi="Ba";
                    break;
                case 4:
                    hangDonVi="Bốn";
                    break;
                case 5:
                    hangDonVi="Năm";
                    break;
                case 6:
                    hangDonVi="Sáu";
                    break;
                case 7:
                    hangDonVi="Bảy";
                    break;
                case 8:
                    hangDonVi="Tám";
                    break;
                case 9:
                    hangChuc="Chín";
                    break;
            }
            System.out.println(hangChuc+" "+hangDonVi);
        }
    }
}
