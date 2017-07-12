package module04;

import java.util.List;

/**
 * Created by tetya on 12.07.2017.
 * Класс DeveloperDAO - содержит методы для работы с текстовым файлом
 */
public interface DeveloperDAO {

    void createDeveloper(Developer d);
    Developer readDeveloper(Long id);
    List<Developer> findAll();

    void deleteDeveloper(Long iD);
    void updateDeveloper(Developer d);



    void readFromFile();
    void writeToFile();

}
