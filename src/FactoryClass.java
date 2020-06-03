import base.BaseClass;
import children.Doctor;
import children.Soldier;
import children.Teacher;

public class FactoryClass {

    public BaseClass getPersonFactory(String person, String name, String age){
        if(person.toLowerCase().equals("s")){
            return new Soldier(name, age);
        }else if(person.toLowerCase().equals("t")){
            return new Teacher(name, age);
        }else if(person.toLowerCase().equals("d")){
            return new Doctor(name, age);
        }
        else return null;
    }

}
