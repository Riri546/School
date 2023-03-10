package School;

public class Main {
    public static void main(String[] args) {
        StudyGroup<Student> group = new StudyGroup<>();
        Service<Student> service = new Service<>(group);
        
        service.addStudent("Маша");
        service.addStudent("Вася");
        service.addStudent("Петя");
        service.addStudent("Кирилл");
        service.addStudent("Даниил");

        for (Student student : group) {
            System.out.println(student);
        }

        System.out.println();
        service.sortByName();

        for (Student student : group) {
            System.out.println(student);
        }

        System.out.println();
        service.sortById();

        for (Student student : group) {
            System.out.println(student);
        }

        // Iterator<Student> iterator = group.iterator();
        // while(iterator.hasNext()){
        // Student student = iterator.next();
        // System.out.println(student);
        // }
    }
}
