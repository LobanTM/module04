package module04;

import java.util.List;

/**
 * Created by tetya on 12.07.2017.
 * Класс DeveloperController - экземпляр которого создаётся в DeveloperView для обработки запросов из консоли и содержит DeveloperDAO.
 */
public class DeveloperController {
    DeveloperDAO developerDAO;
    public DeveloperController(DeveloperDAO developerDAO) {
        this.developerDAO = developerDAO;
    }

    public void addDev(Developer d){
        developerDAO.createDeveloper(d);
    }

    public Developer showDev(Long id){
        return developerDAO.readDeveloper(id);
    }

    public void editDev(Developer d){
        developerDAO.updateDeveloper(d);
    }

    public void delDev(Long iD){
        developerDAO.deleteDeveloper(iD);
    }
    public List<Developer> showAll(){
        return developerDAO.findAll();
    }
}
