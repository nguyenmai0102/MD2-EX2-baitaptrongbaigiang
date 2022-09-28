package ex;

public class bai2 {
    public static void main(String[] args) {
        // hien thi 20 so nguyen to dau tien
        int cnt =0;
        int a=2;
        System.out.println("20 so nguyen to dau tien la: ");
        do {
            // kiem tra a co phai la so nguyen to khong
            boolean check = false;
            for (int i = 2; i <=Math.sqrt(a) ; i++) {
                if (a%i==0){
                    check=true;
                }

            }
            if (!check){
                // a laf so nguyen to
                System.out.printf("%d\n",a);
                cnt++;
            }
            a++;
        }while (cnt!=20);
    }
}
