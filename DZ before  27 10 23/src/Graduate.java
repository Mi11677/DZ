public class Graduate extends Student {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Graduate(
            String lastName, String firstName, int age,
            String speciality, String group, double rating, double attendance,
            String subject) {
        super(lastName, firstName, age, speciality, group, rating, attendance);
        setSubject(subject);
        System.out.println("GConstructor:\t" + Integer.toHexString(hashCode()));
    }
    public Graduate(Graduate other)
    {
        super(other);
        this.subject = other.subject;
    }
    public String toString() {
        return super.toString() + " " + subject;
    }
}
