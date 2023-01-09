package School;

public class StudyGroupIterator implements Iterator<Student> {

    private int index;

    @Override
    public boolean hasNext() {
        return index < studentList.size();
    }

    @Override
    public Student next() {
        return studentList.get(index++);
    }
}
