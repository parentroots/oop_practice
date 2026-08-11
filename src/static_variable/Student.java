package static_variable;

public class Student {

    String name;
    int id;
    static String universityName = "BPI";

    Student(String name, int id) {

        this.name = name;
        this.id = id;

        System.out.println("Name Is: " + name);
        System.out.println("Identity Is: " + id);
        System.out.println("University Name Is: " + universityName);
        System.out.println();
        
        System.out.println("===================================");
        
    }


}