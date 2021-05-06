import java.util.Scanner;

public class DocSo1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập số: ");
        int number=sc.nextInt();
        String[] arr1 = {"Không","Một","Hai","Ba","Bốn","Năm","Sáu","Bảy","Tám","Chín","Mười"};
        String[] arr2 = {"Mười ","Hai Mươi ","Ba Mươi ","Bốn Mươi ","Năm Mươi ","Sáu Mươi ","Bảy Mươi ","Tám Mươi ","Chín Mươi "};
        String[] arr3 = {"Một Trăm ","Hai Trăm ","Ba Trăm ","Bốn Trăm ","Năm Trăm ","Sáu Trăm ","Bảy Trăm ","Tám Trăm ","Chín Trăm "};

        int hangTram=number/100;
        int hangDonVi=number%10;
        int d=number/10;
        int hangChuc=d%10;

        if(number>=0 && number<=10){
            System.out.println(arr1[number]);
        } else if(hangDonVi==0 && hangChuc==0){
            System.out.println(arr3[hangTram-1]);
        } else if(hangDonVi==0){
            System.out.println(arr3[hangTram-1]+arr2[hangChuc-1]);
        } else {
            System.out.println(arr3[hangTram-1]+arr2[hangChuc-1]+arr1[hangDonVi]);
        }
    }
}
