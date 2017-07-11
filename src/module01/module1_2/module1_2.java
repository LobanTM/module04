package module01.module1_2;

import java.util.Scanner;

/**
 * Created by tetya on 11.07.2017.
 */
public class module1_2 {
    public static void main(String[] args) {
        Massive m = new Massive();
        m.scanList();

        boolean b = true;
        while (b){

            System.out.println("1 - показати перелік; 2 - пошук за значенням; 3 - сортування; 0 - выход");
            Scanner scan = new Scanner(System.in);

            int key = scan.nextInt();
            switch (key){
                case 1:{m.writeList();}break;
                case 2:{
                    System.out.println("значення:");
                    scan = new Scanner(System.in);
                    System.out.println("індекс елементу: " + m.searchByNum(scan.nextInt()));
                }break;
                case 3:{m.writeSortList();}break;
                case 0: b=false;
            }
        }
    }
}
