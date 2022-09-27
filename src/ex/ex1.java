package ex;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        do {
            System.out.println("*************MENU************");
            System.out.println("In hình chữ nhật");
            System.out.println("In hình tam giác vuông, có cạnh góc vuông ở botton-left\n");
            System.out.println("In hình tam giác vuông, có cạnh góc vuông ở top-left");
            System.out.println("In hình tam giác cân");
            System.out.println("lua chon cua ban");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    // in hinh chu nhat

                    System.out.printf("input width");
                    String width = scanner.nextLine();
                    System.out.printf("input height");
                    String height = scanner.nextLine();
                    System.out.printf("%d %d ", width, height);

                    for (int i = 0; i < width.length(); i++) {
                        for (int j = 0; j <height.length() ; j++) {

                        }
                    }
                    System.out.println("*");

                case 2:
                    System.out.println("dien so n");
                    int n= scanner.nextInt();
                    for (int i = 1; i < n; i++) {
                        for (int j = 1; j < i; j++) {

                        }

                    }
                    System.out.println("*");

                case 3:
                    System.out.println("input m");
                    int m = scanner.nextInt();
                    for (int i = m; i >=1; i--) {
                        for (int j = 1; j <i ; j++) {

                        }
                    }
                    System.out.println("*");

                case 4:
                    System.out.println("input x");
                    int x = scanner.nextInt();
                    for (int i = 1; i <=x; i++) {
                        for (int j = 1; j <i ; j++){
                        }
                        for (int j=x; j >=1 ; j--) {

                        }
                    }
                    System.out.println("*");

                case 5:
                    System.exit(0);
                default:
                    System.err.println("Vui long nhap tu 1-4");
            }
        }while(true);



    }
}
