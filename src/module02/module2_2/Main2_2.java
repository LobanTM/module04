package module02.module2_2;

/**
 * Created by tetya on 14.07.2017.
 */
public class Main2_2 {
    public static void main(String[] args) {
        MyFixCollection myFixCollection = new MyFixCollection();

        for (int i = 0; i < 20; i++) {
            myFixCollection.add(i+8);
            print(myFixCollection);
        }
    }

    public static void print(MyFixCollection m){
        System.out.println("==========================================================");
        System.out.println("size "+ m.getSize());
        System.out.print("all: " );
        for (Integer i: m.getCollection()) {
            System.out.print(" " + i); }
        System.out.println("");
    }
}
