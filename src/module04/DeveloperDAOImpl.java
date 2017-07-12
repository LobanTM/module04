package module04;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tetya on 12.07.2017.
 */
public class DeveloperDAOImpl implements DeveloperDAO {
    private static final String FILE_PATH = "C:\\Users\\tetya\\IdeaProjects\\Java7\\src\\resource\\testFile";
    Developer dev;

    @Override
    public void createDeveloper(Developer d) {
        //d.setId(Long.valueOf(3));
        System.out.println("create " + d.toString());

        try {
            final FileOutputStream fos = new FileOutputStream(FILE_PATH);
            final ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(d);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Developer readDeveloper(Long id) {

        Developer d  = null;
        FileInputStream fin = null;
        try {
            fin = new FileInputStream(FILE_PATH);
            // Создаем объект ObjectInputStream для чтения сериализованного объекта
            ObjectInputStream ois = new ObjectInputStream(fin);
            // Восстанавливаем состояние объекта из файла
            d  = (Developer) ois.readObject();
            //if (d == null)System.out.println("List is empty");
            //System.out.println(d.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return d;
    }

    @Override
    public List<Developer> findAll() {
        List<Developer> listDevelopers = new ArrayList<>();
        listDevelopers.add(new Developer("1",20,"G", "Excellent"));
        listDevelopers.add(new Developer("2",20,"H", "Well"));
        listDevelopers.add(new Developer("3",20,"L", "Low"));
        return listDevelopers;
    }

    @Override
    public void deleteDeveloper(Long iD) {
        //System.out.println("delete Developer with number " + iD);

        try {
            final FileOutputStream fos = new FileOutputStream(FILE_PATH);
            final ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(null);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateDeveloper(Developer d) {
        System.out.println("update " + d.toString());

        try {
            final FileOutputStream fos = new FileOutputStream(FILE_PATH);
            final ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(d);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void readFromFile() {

    }

    @Override
    public void writeToFile() {

    }
}
