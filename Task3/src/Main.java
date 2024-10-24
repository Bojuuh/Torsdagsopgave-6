import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();

        ArrayList<String> student1Courses = new ArrayList<>();
        student1Courses.add("Java 1.0");
        student1Courses.add("Python");
        Student student1 = new Student("Elliot", student1Courses);

        ArrayList<String> student2Courses = new ArrayList<>();
        student2Courses.add("Math");
        student2Courses.add("Physics");
        Student student2 = new Student("Markus", student2Courses);

        ArrayList<String> student3Courses = new ArrayList<>();
        student3Courses.add("History");
        student3Courses.add("English");
        Student student3 = new Student("Bob", student3Courses);

        ArrayList<String> student4Courses = new ArrayList<>();
        student4Courses.add("Math");
        student4Courses.add("Chemistry");
        student4Courses.add("Java 1.0");
        Student student4 = new Student("John", student4Courses);

        ArrayList<String> student5Courses = new ArrayList<>();
        student5Courses.add("Math");
        student5Courses.add("English");
        Student student5 = new Student("Jane", student5Courses);

        persons.add(student1);
        persons.add(student2);
        persons.add(student3);
        persons.add(student4);
        persons.add(student5);

        ArrayList<String> teacher1Courses = new ArrayList<>();
        teacher1Courses.add("Math");
        teacher1Courses.add("Physics");
        Teacher teacher1 = new Teacher("Bobby", teacher1Courses);

        ArrayList<String> teacher2Courses = new ArrayList<>();
        teacher2Courses.add("Java 1.0");
        teacher2Courses.add("Computer Science");
        Teacher teacher2 = new Teacher("Tess", teacher2Courses);

        ArrayList<String> teacher3Courses = new ArrayList<>();
        teacher3Courses.add("Java 1.0");
        teacher3Courses.add("Game development");
        Teacher teacher3 = new Teacher("Jesper", teacher3Courses);

        persons.add(teacher1);
        persons.add(teacher2);
        persons.add(teacher3);

        for (Person person : persons) {
            boolean result = person.addCourse("Java 1.0");
            if (!result){
                if (person instanceof Student){
                    System.out.println(person.getName() + " has already passed this course");
                } else if (person instanceof Teacher){
                    System.out.println(person.getName() + " can't teach this course");
                }
            }
        }
    }
}