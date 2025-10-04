import java.util.Scanner;
import java.util.Locale;
import entities.Student;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);


        Scanner reader = new Scanner(System.in);
        Student student = new Student();
        System.out.print("enter the student's name: ");
        student.name = reader.nextLine();
        System.out.printf("%n enter the student's 1st quarter note: ");
        student._1quarterNote = reader.nextDouble();
        System.out.printf("%n enter the student's 2st quarter note: ");
        student._2quarterNote = reader.nextDouble();
        System.out.printf("%n enter the student's 3st quarter note: ");
        student._3quarterNote = reader.nextDouble();

        System.out.println(student.isAprovedOrNot());
    }
}
