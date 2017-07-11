package module01.module1_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by tetya on 11.07.2017.
 */
public class Massive {
    int size; //розмір масиву

    public void setSize(int size) {
        this.size = size;
    }

    List<Integer> list = new ArrayList<>();

    public List<Integer> scanList(){
        Scanner scan;
        System.out.println("введіть розмір масиву");
        scan = new Scanner(System.in);
        size = scan.nextInt();

        int index = 1;
        while (index<size+1){
            System.out.println("Enter number " + index);
            scan = new Scanner(System.in);
            list.add(scan.nextInt());
            index++;
        }
        return list;
    }

    public void writeList(){
        System.out.println(list);
    }

    public int searchByNum(Integer num){
        int i = -1; //немає в переліку
        if (list.contains(num)) i = list.indexOf(num);
        return i;
    }

    public void writeSortList(){
        Collections.sort(list); //сортування по зростанню
        System.out.println(list);
    }
}
