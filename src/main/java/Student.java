import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private String dob;
    private String id;
    private String username;
    private Course courseEnrolled;
    private ArrayList<Module> modules;

    public Student(String name, int age, String dob, String id, Course courseEnrolled){
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        username = getUsername();
        this.courseEnrolled = courseEnrolled;
        //retreive student modules as outlined in the course
        modules = courseEnrolled.getModules();
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public void setCourseEnrolled(Course courseEnrolled) {
        this.courseEnrolled = courseEnrolled;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public int getAge() {
        return age;
    }

    public Course getCourseEnrolled() {
        return courseEnrolled;
    }

    public String getDob() {
        return dob;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        //special string to avoid recursive call infinite loop
        String modNames = "";
        for(Module m :modules)
            modNames += m.getName() + ", ";
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dob='" + dob + '\'' +
                ", id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", courseEnrolled=" + courseEnrolled.getName() +
                ", modules=" + modNames +
                '}';
    }

    public String getUsername(){
        return name + String.valueOf(age);
    }
}
