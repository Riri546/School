package School;

import java.util.Iterator;
import java.util.List;

public class StudyGroupIterator<T> implements Iterator<T> {

    private int index;
    private List<T> studentList;

    public StudyGroupIterator(List<T> studentList) {
        this.studentList = studentList;
    }

    @Override
    public boolean hasNext() {
        return index < studentList.size();
    }

    @Override
    public T next() {
        return studentList.get(index++);
    }
}
