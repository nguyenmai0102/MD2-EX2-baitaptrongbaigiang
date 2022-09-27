package ex;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

                // hien thi cac so nguyen to trong nho hon 100

        int n;
                boolean check;
                Scanner scanner = new Scanner(System.in);
                System.out.println("nhap n");
               n = scanner.nextInt();
                if (n >= 2) {
                    System.out.printf("cac so nguyen to tu tu 0 den %d la\n" , n);
                    for (int i = 2; i < 100; i++) {
                        check = false;
                        for (int j = 2; j <= Math.sqrt(i); j++) {
                            if (i%j == 0) {
                                // j la uoc cua i
                                check = true;
                                break;
                            }
                        }
                        if (!check) {
                            System.out.printf("%d\t", i);

                        }
                    }
                    System.out.printf("\n");
                }
            }
        }
