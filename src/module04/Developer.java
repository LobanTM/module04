package module04;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tetya on 12.07.2017.
 *
 * Developer - POJO класс, который содержит данные о разработчике
 */
public class Developer implements Serializable{
    Long id;
    String nameDeveloper = "";
    Integer age = 0;
    String qualification = "";
    String experiance = "";
    //List<String> projects = new ArrayList<>();

    public Developer(String nameDeveloper, int age, String qualification, String experiance) {
        this.nameDeveloper = nameDeveloper;
        this.age = age;
        this.qualification = qualification;
        this.experiance = experiance;
        //this.projects = projects;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public String getNameDeveloper() {
        return nameDeveloper;
    }

    public void setNameDeveloper(String nameDeveloper) {
        this.nameDeveloper = nameDeveloper;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getExperiance() {
        return experiance;
    }

    public void setExperiance(String experiance) {
        this.experiance = experiance;
    }

   // public List<String> getProjects() {
   //     return projects;
   // }

   // public void setProjects(List<String> projects) {
   //     this.projects = projects;
   // }

    @Override
    public String toString() {
        return "Developer{" +
                //"ID=" + id +
                "nameDeveloper='" + nameDeveloper + '\'' +
                ", age=" + age +
                ", qualification='" + qualification + '\'' +
                ", experiance='" + experiance + '\'' +
    //            ", projects=" + projects +
                '}';
    }
}
