public class Specialist extends Graduate {

    private int grade;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Specialist(String lastName, String firstName, int age,
                      String speciality, String group, double rating, double attendance,
                      String subject, int grade) {

        super(lastName, firstName, age, speciality, group, rating, attendance, subject);
        this.grade = grade;
        System.out.println("SpConnstructor:\t" + Integer.toHexString(hashCode()));
    }

    public Specialist (Graduate graduate, int grade)
    {
        super(graduate);
        this.grade = grade;
        System.out.println("SpConstructor:\t" + Integer.toHexString(hashCode()));
    }
    public Specialist(Specialist other)
    {
        super(other);
        this.grade = other.grade;
        System.out.println("SpCopyConstructor\t" + Integer.toHexString(hashCode()));
    }

    @Override
    public String toString() {
        return super.toString() + " grade: " + grade;

    }
}
