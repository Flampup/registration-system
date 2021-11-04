import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;

public class Module {
    private String name;
    private String id;
    private ArrayList<Student> students;
    private ArrayList<Course> courses;

    public Module(String name, String id){
        this.name = name;
        this.id = id;
        students = new ArrayList<Student>();
        courses = new ArrayList<Course>();
    }

    public void addCourse(Course course){
        courses.add(course);
        ArrayList<Student> studentsInCourse = course.getStudents();
        for(Student s : studentsInCourse)
            addStudent(s);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        String studentsString = "";
        for(Student s : students)
            studentsString += s.getName() + " ID: " + s.getId() + ", ";
        String coursesString = "";
        for(Course c : courses)
            coursesString += c.getName() + ", ";
        return "Module{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                "students=" + studentsString +
                "courses=" + coursesString +
                '}';
    }
}
