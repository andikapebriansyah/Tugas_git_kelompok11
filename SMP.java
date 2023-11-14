import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class SMP here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SMP extends School implements Extracurricular
{
    // instance variables - replace the example below with your own
    private String codeClass; 
    private int maxStudent;
    private List<Student> students;
    private List<Teacher> teachers;
    
    /**
     * Constructor for objects of class SMP
     */
    public SMP(int grade, String codeClass, int studentNum)
    {
        super(grade);
        this.codeClass = codeClass;
        maxStudent = studentNum;
        students = new ArrayList<Student>();
        teachers = new ArrayList<Teacher>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */

   @Override
   public int getGrade() {
       return super.getGrade();
   }
   public String getCodeClass() {
       return codeClass;
   }

   public int getNumOfStudent() {
       return maxStudent;
 
   }

   @Override
   public void setCourse(String sub) {
       course.add(sub);
   }

@Override
public void setGrade() {
    throw new UnsupportedOperationException("Unimplemented method 'setGrade'");
}

@Override
public ArrayList<String> getCourse() {
    return super.getCourse();
}

public void addStudent (Student student){
    if (students.size()==maxStudent) {
        System.out.println("Class is full");
    }else{
        students.add(student);
    }
}

public void addTeachers(Teacher teacher) {
    teachers.add(teacher);
}

@Override
public String DayOfExc() {
    return "Pramuka: Sabtu, Rohis: Jumat, OSIS: setiap hari ngerodi";
}

@Override
public String NameOfExc() {
    return "Pramuka, Rohis, OSIS";
}

public void printList()
    {
        System.out.println("\t\t+-----------------------+");
        System.out.println("\t\t|\tSiswa SMP\t|");
        System.out.println("\t\t+-----------------------+");
        System.out.println("Room: " + codeClass + "\n");
        System.out.println("Class list:");
        for(Student student : students) {
            System.out.print("- ");
            student.print();
        }
        System.out.println("\nTeacher: ");
        for(Teacher teacher : teachers) {
            System.out.print("- ");
            teacher.print();
        }
        System.out.println("\nNumber of students: " + students.size());
    }
}
