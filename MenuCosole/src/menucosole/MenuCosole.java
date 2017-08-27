/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menucosole;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class MenuCosole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 0;
        while (a == 0) {
            System.out.println("-----------MENU---COSOLE-----------");
            System.out.println("» 1. Hien Thi Danh Sach");
            System.out.println("» 2. Them Moi");
            System.out.println("» 3. Sua");
            System.out.println("» 4. Xoa");
            System.out.println("» 5. Thoat");
            System.out.println("___________________________________");
            System.out.print("Nhap Lua Chon Cua Ban:");
            Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();
            switch (i) {
                case 1:
                    System.out.println("");
                    System.out.println("+---------------------------------+");
                    System.out.println("|Ban Da Chon: 1.Hien Thi Danh Sach|");
                    System.out.println("+---------------------------------+");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("+---------------------------------+");
                    System.out.println("|Ban Da Chon: 2. Them Moi         |");
                    System.out.println("+---------------------------------+");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("+---------------------------------+");
                    System.out.println("|Ban Da Chon: 3. Sua              |");
                    System.out.println("+---------------------------------+");
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("+---------------------------------+");
                    System.out.println("|Ban Da Chon: 4. Xoa              |");
                    System.out.println("+---------------------------------+");
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("");
                    System.out.println("+---------------------------------+");
                    System.out.println("|Ban Da Chon: 5. Thoat            |");
                    System.out.println("+---------------------------------+");
                    System.out.println("");
                    a = 1;
                    break;
            };

        };
    }
;
}
}
