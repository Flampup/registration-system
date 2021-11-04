import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ModuleTest {
    ArrayList<Student> students = new ArrayList<Student>();
    ArrayList<Course> courses = new ArrayList<Course>();
    Module module = new Module("Maths", "MA101");
    Course course = new Course("BCT", new DateTime(), new DateTime());
    Student student1 = new Student("Alan", 20, "01/01/2001", "1111", course);
    Student student2 = new Student("David", 21, "01/01/2000", "1121", course);

    @Test
    void getStudents() {
        assertEquals(students, module.getStudents());
    }

    @Test
    void getName() {
        assertEquals("Maths", module.getName());
    }

    @Test
    void getCourses() {
        assertEquals(courses, module.getCourses());
    }

    @Test
    void getId() {
        assertEquals("MA101", module.getId());
    }

    @Test
    void addCourse() {
        course.addStudent(student1);
        module.addCourse(course);
        courses.add(course);
        assertEquals(courses, module.getCourses());
        assertEquals(course.getStudents(), module.getStudents());
    }

    @Test
    void addStudent() {
        module.addStudent(student2);
        students.add(student2);
        assertEquals(students, module.getStudents());
    }

    @Test
    void setName() {
        module.setName("Intro to Archeology");
        assertEquals("Intro to Archeology", module.getName());
    }

    @Test
    void setId() {
        module.setId("PH301");
        assertEquals("PH301", module.getId());
    }
}