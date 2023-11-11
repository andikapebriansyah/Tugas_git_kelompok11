import java.util.ArrayList;

/**
 * Write a description of class School here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class School
{
    // instance variables - replace the example below with your own
    private int grade;
    protected ArrayList<String> course;

    /**
     * Constructor for objects of class School
     */
    public School(int grade)
    {
       this.grade = grade;
       course = new ArrayList<>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getGrade() {
        return grade;
    }

    public abstract void setGrade();

    public abstract void setCourse(String course);

    public ArrayList<String> getCourse() {
        return course;
    }
}
