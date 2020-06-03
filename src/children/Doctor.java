package children;

import base.BaseClass;

public class Doctor extends BaseClass {

    public Doctor(String name, String age) {
        super.setName(name);
        super.setAge(age);
    }

    @Override
    public String abstractMethod() {
        return super.getName() + " is a " + super.getAge() + " children.Doctor who cares about us";
    }

}
