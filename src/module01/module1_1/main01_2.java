package module01.module1_1;

import java.util.*;

/**
 * Created by tetya on 11.07.2017.
 */
public class main01_2 {
    public static void main(String[] args) {
        Massive m = new Massive();
        m.scanList();
        m.writeList();
        m.writeSortList();
    }
}

class Massive{

    List<Integer> list = new ArrayList<>();
    public List<Integer> scanList(){
        Scanner scan;
        //boolean b = true;
        int index = 1;
        while (index<6){
            System.out.println("Enter number " + index);
            scan = new Scanner(System.in);
            list.add(scan.nextInt());
            index++;
        }
        return list;
    }

    public void writeList(){
        //вьівод массива
        ListIterator<Integer> lIter = list.listIterator();
        while (lIter.hasNext()) System.out.print(lIter.next() + " ");
        System.out.println(" ");
        // for (Integer i: list){
        //     System.out.print(i);
        //     System.out.println(" ");

    }
    public void writeSortList(){
        Collections.sort(list); //сортування по зростанню
        System.out.println(list);

    }

}