
/**
 * Write a description of class teacher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Teacher extends Person
{
    // instance variables - replace the example below with your own
    private int Nip;
    private String course;
    /**
     * Constructor for objects of class teacher
     */
    public Teacher(String name, int Nip)
    {
        super(name);
        this.Nip = Nip;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getNip()
    {
        return Nip;
    }

    public void setNip(int nip) {
        Nip = nip;
    }
    
    public void setCourse(Course newCourse)
    {
        course = newCourse.getName();
    }
    
    public void print()
    {
        System.out.println(getName() + " (" + course + ")");
    }
}
