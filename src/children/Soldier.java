package children;

import base.BaseClass;

public class Soldier extends BaseClass {

    public Soldier(String name, String age) {
        super.setName(name);
        super.setAge(age);
    }

    @Override
    public String abstractMethod() {
        return super.getName() + " is a " + super.getAge() + " children.Soldier who works to keep as safe";
    }
}
