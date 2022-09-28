package ex;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        do {


            System.out.println("*************MENU************");
            System.out.println("In hình chữ nhật");
            System.out.println("In hình tam giác vuông, có cạnh góc vuông ở botton-left\n");
            System.out.println("In hình tam giác vuông, có cạnh góc vuông ở top-left");
            System.out.println("In hình tam giác cân");
            System.out.println("lua chon cua ban\n");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    // in hinh chu nhat

                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 11; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                case 2:
                    // in hinh tam giac vuong co canh o trai
                    for (int i = 1; i < 10; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");

                        }
                        System.out.println("*");

                    }
                case 3:
//In hình tam giác vuông, có cạnh góc vuông ở top-left
                    for (int i = 10; i > 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("*");

                    }
                case 4:

                    while (true) ;



    }

}