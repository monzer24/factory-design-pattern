package base;

public abstract class BaseClass {

    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNameAndAge(){
        return getName() + " " + getAge();
    }

    public abstract String abstractMethod();
}
