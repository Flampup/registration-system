import org.joda.time.DateTime;

import java.util.ArrayList;

public class Course {
    private String name;
    private ArrayList<Module> modules;
    private ArrayList<Student> students;
    private DateTime startDate;
    private DateTime endDate;

    public Course(String name, DateTime startDate, DateTime endDate){
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        modules = new ArrayList<Module>();
        students = new ArrayList<Student>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addModule(Module module) {
        this.modules.add(module);
        //update student modules when one is added to the course
        for(Student s : students)
            s.setModules(this.getModules());
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    @Override
    public String toString() {
        //build special strings for objects to avoid infinite loop
        String modNames = "";
        for(Module m :modules)
            modNames += m.getName() + ", ";
        String studentsString = "";
        for(Student s : students)
            studentsString += s.getName() + " ID: " + s.getId() + ", ";

        return "Course{" +
                "name='" + name + '\'' +
                ", modules=" + modNames +
                ", students=" + studentsString +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
