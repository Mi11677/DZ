public class HumanFactory
{
    public static Human Create(String type)
    {
        switch (type)
        {
            case "Student":     return new Student ("", "", 0, "", "", 0, 0);
            case "Teacher":     return new Teacher ("", "", 0, "",  0);
            case "Graduate":    return new Graduate ("", "", 0, "", "", 0, 0, "");
            case "Specialist":  return new Specialist ("", "", 0, "", "", 0, 0,"", 0);
            default: return null;
        }
    }
}
