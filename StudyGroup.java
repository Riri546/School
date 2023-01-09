package School;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Iterable<Student> {
    private List<Student> studentList;

    public StudyGroup() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return null;
    }

    class StudyGroupIterator implements Iterator<Student> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Student next() {
            return null;
        }
    }
}
