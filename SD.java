import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class SD here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SD extends School implements Extracurricular {
    // instance variables - replace the example below with your own
    private String codeClass;
    private int maxStudent;
    private List<Student> students;
    private List<Teacher> teachers;
    private String rangeAge;
    private boolean ParentConsul;

    /**
     * Constructor for objects of class SD
     */
    public SD(int grade, String codeClass, int studentNum) {
        super(grade);
        this.codeClass = codeClass;
        maxStudent = studentNum;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param y a sample parameter for a method
     * @return the sum of x and y
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

    public String getRangeAge() {
        return rangeAge;
    }

    public void setRangeAge(String rangeAge) {
        this.rangeAge = rangeAge;
    }

    public boolean getParentConsul(){
        if (ParentConsul == true) {
            System.out.println("Konsultasi orang tua dilakukan 2 kali setiap bulan");
        }else{
            System.out.println("Konsultasi orang tua tidak dilakukan");
        }
        return ParentConsul;
    }

    public void setParentConsul(boolean parentConsul) {
        ParentConsul = parentConsul;
    }

    @Override
    public void setGrade() {
        throw new UnsupportedOperationException("Unimplemented method 'setGrade'");
    }

    @Override
    public ArrayList<String> getCourse() {
        return super.getCourse();
    }

    public void addStudent(Student student) {
        if (students.size() == maxStudent) {
            System.out.println("Class is full");
        } else {
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
}
