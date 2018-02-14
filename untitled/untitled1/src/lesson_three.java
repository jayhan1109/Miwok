import java.util.ArrayList;

public class lesson_three {
    public static void main(String[] args) {
        Student Harry=new Student("Harry",91,87);
        System.out.println(Harry);
        System.out.println(Harry.getGrade());
        System.out.println(Harry.getMathScore());
        System.out.println(Harry.getScienceScore());

        Student Jack=new Student("Jack",87,85);
        System.out.println(Jack);
        System.out.println(Jack.getGrade());
        System.out.println(Jack.getMathScore());
        System.out.println(Jack.getScienceScore());

        ArrayList<Student> students_grade=new ArrayList<>();
        students_grade.add(new Student("Lucas",86,76));
        students_grade.add(new Student("James",99,98));

        for(int i=0;i<students_grade.size();i++)
            System.out.println(students_grade.get(i));
    }
}
