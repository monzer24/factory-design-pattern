import base.BaseClass;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FactoryClass factory = new FactoryClass();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        try {
            System.out.println("Enter S for soldier, T for children.Teacher or D for children.Doctor");
            String input = scanner.next();
            System.out.println("Enter a name");
            String name = scanner.next();
            System.out.println("Enter an age");
            String age = scanner.next();
            if (input != null) {
                BaseClass bClass = factory.getPersonFactory(input, name, age);
                System.out.println(bClass.abstractMethod());
            }
        }catch (NullPointerException e){
            main(new String[0]);
        }
    }

}
