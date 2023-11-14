
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student extends Person
{
    // instance variables - replace the example below with your own
    private int Nis;
    private int creditSkor;
    /**
     * Constructor for objects of class Student
     */
    public Student(String name, int Nis)
    {
        super(name);
        this.Nis = Nis;

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getNis()
    {
      return Nis;
    }

    public void setNis(int nis) {
        Nis = nis;
    }

   public int getCreditSkor() {
       return creditSkor;
   }

   public void setCreditSkor(int creditSkor) {
       this.creditSkor = creditSkor;
   }
   
   public void print()
    {
        System.out.println(getName() + " (" + Nis + ")");
    }
}
