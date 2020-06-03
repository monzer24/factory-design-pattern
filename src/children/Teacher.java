package children;

import base.BaseClass;

public class Teacher extends BaseClass {

    public Teacher(String name, String age) {
        super.setName(name);
        super.setAge(age);
    }

    @Override
    public String abstractMethod() {
        return super.getName() + " is a " + super.getAge() + " children.Teacher who teaches us";
    }
}
