package School;

import java.util.Collections;

public class Service {
    private StudyGroup group;
    private static int id;

    public Service(StudyGroup group) {
        this.group = group;
    }

    public void addStudent(String name) {
        Student student = new Student(id++, name);
        group.addStudent(student);
    }

    public void sortByName() {
        Collections.sort(group.getStudentList());
    }

    public void sortById(){
        Collections.sort(group.getStudentList(), new StudentComparatorById());
    }
}
