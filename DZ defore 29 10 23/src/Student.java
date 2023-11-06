public class Student extends Human
{
    private String speciality;
    private String group;
    private double rating;
    private double attendance;

    public String getSpeciality() {
        return speciality;
    }

    public String getGroup() {
        return group;
    }

    public double getRating() {
        return rating;
    }

    public double getAttendance() {
        return attendance;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setAttendance(double attendance) {
        this.attendance = attendance;
    }

    public Student(String lastName, String firstName, int age, String speciality, String group, double rating, double attendance) {
        super(lastName, firstName, age);
        setSpeciality(speciality);
        setGroup(group);
        setRating(rating);
        setAttendance(attendance);
        System.out.println("SConstructor:\t" + Integer.toHexString(hashCode()));

    }
    public  Student(Human human, String speciality, String group, double rating, double attendance)
    {
        super(human);
        setSpeciality(speciality);
        setGroup(group);
        setRating(rating);
        setAttendance(attendance);
        System.out.println("SConstructor:\t" + Integer.toHexString(hashCode()));
    }
    public Student(Student other)
    {
        super(other);
        this.speciality = other.speciality;
        this.group = other.group;
        this.rating = other.rating;
        this.attendance = other.attendance;
        System.out.println("SCopyConstructor:\t" + Integer.toHexString(hashCode()));
    }

    @Override
    public void init(String[] values) {
        super.init(values);
        speciality = values[4];
        group = values[5];
        rating = Double.parseDouble(values[6].trim());
        attendance = Double.parseDouble(values[7].trim());
    }

    @Override
    public String toString() {
        return super.toString() + ", "
                + speciality + ", " + group + ", " +  rating + ", " + attendance;
    }
}
