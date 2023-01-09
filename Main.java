package School;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        StudyGroup group = new StudyGroup();
        Service service = new Service(group);
        service.addStudent("Маша");
        service.addStudent("Вася");
        service.addStudent("Петя");
        service.addStudent("Кирилл");
        service.addStudent("Даниил");

        for (Student student : group) {
            System.out.println(student);
        }

        Iterator<Student> iterator = group.iterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            System.out.println(student);
        }
    }
}
