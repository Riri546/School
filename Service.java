package School;

public class Service {
    private StudyGroup group;
    private static int id;

    public Service(StudyGroup group){
        this.group = group;
    }

    public void addStudent(String name){
        Student student = new Student(id++, name);
        group.addStudent(student);
    }
}