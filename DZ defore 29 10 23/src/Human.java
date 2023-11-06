public class Human {
    private String lastName;
    private String firstName;
    private int age;
    public String getLastName()
    {
        return  lastName;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public int getAge()
    {
        return age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Human (String lastName, String firstName, int age)
    {
        setLastName(lastName);
        setFirstName(firstName);
        setAge(age);
        System.out.println("HConstructor:\t" + Integer.toHexString(hashCode()));

    }
    public Human(Human other)
    {
        this.lastName = other.lastName;
        this.firstName = other.firstName;
        this.age = other.age;
        System.out.println("HCopyConstructor:\t" + Integer.toHexString(hashCode()));
    }
    public void init(String[] values)
    {
        lastName = values[1];
        firstName = values[2];
        age = Integer.parseInt(values[3].trim());
    }
    public String toString()
    {
        return lastName + ", " + firstName + ", " + age;
    }
}
