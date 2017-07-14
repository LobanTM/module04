package module02.module2_2;

/**
 * Created by tetya on 14.07.2017.
 */
public class MyFixCollection {
    Integer[] collection;
    int size =16;
    int position = -1;

    public MyFixCollection() {
        collection = new Integer[this.size];
    }

    public MyFixCollection(int size) {
        this.size = size;
        collection = new Integer[this.size];
    }

    public int getSize() {
        return position+1;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Integer[] getCollection() {
        return collection;
    }

    public void add(Integer el){
        if (position< size-1){ //кількістьелементів не перевищує макимум (16)
            position++;
            collection[position] = el;

        }else{                  //достигнуто максимуму, перший елемент видаляємо
            for (int i = 0; i < size-1; i++) {
                collection[i]=collection[i+1];
            }
            collection[size-1]=el;
        }
    }
}
