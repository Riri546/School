package School;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup {
    private List<Student> studentList;

    public StudyGroup(){
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student){
        studentList.add(student);
    }
}
