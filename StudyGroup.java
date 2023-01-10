package School;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup<T extends Test> implements Iterable<T> {
    private List<T> studentList;

    public StudyGroup() {
        studentList = new ArrayList<>();
    }

    public List<T> getStudentList() {
        return studentList;
    }

    public void addStudent(T student) { 
        System.out.print(student.getId());
        studentList.add(student);
    }

    @Override
    public Iterator<T> iterator() {
        return new StudyGroupIterator(studentList);
    }

    
}
