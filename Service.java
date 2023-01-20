package School;

import java.util.Collections;

public class Service<T extends Student> {
    private StudyGroup<T> group;
    private static int id;

    public Service(StudyGroup<T> group) {
        this.group = group;
    }

    public void addStudent(String name) {
        T student = (T) new Student(id++, name);
        group.addStudent(student);
    }

    public void sortByName() {
        Collections.sort(group.getStudentList());
    }

    public void sortById() {
        Collections.sort(group.getStudentList(), new StudentComparatorById());
    }
}
