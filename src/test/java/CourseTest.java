import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {
    ArrayList<Module> modules = new ArrayList<Module>();
    ArrayList<Student> students = new ArrayList<Student>();
    Module mod1 = new Module("Programing", "CT101");
    Module mod2 = new Module("Maths", "MA101");
    Course course = new Course("BCT", new DateTime(2021, 9, 1, 9, 0), new DateTime( 2022, 6, 1, 17,0));
    Student student1 = new Student("Alan", 20, "01/01/2001", "1111", course);
    Student student2 = new Student("David", 18, "23/11/2003", "1112", course);
    @Test
    void getName() {
        assertEquals("BCT", course.getName());
    }

    @Test
    void getModules() {
        assertEquals(modules, course.getModules());
    }

    @Test
    void getStudents() {
        assertEquals(students, course.getStudents());
    }

    @Test
    void getEndDate() {
        assertEquals(new DateTime( 2022, 6, 1, 17,0), course.getEndDate());
    }

    @Test
    void getStartDate() {
        assertEquals(new DateTime(2021, 9, 1, 9, 0), course.getStartDate());
    }

    @Test
    void setName() {
        course.setName("BA");
        assertEquals("BA", course.getName());
    }

    @Test
    void addModule() {
        course.addModule(mod1);
        modules.add(mod1);
        assertEquals(modules, course.getModules());
        course.addModule(mod2);
        modules.add(mod2);
        assertEquals(modules, course.getModules());
    }

    @Test
    void addStudent() {
        course.addStudent(student1);
        students.add(student1);
        assertEquals(students, course.getStudents());
        course.addStudent(student2);
        students.add(student1);
        assertNotEquals(students, course.getStudents());
    }

    @Test
    void setEndDate() {
        DateTime newDate = new DateTime();
        course.setEndDate(newDate);
        assertEquals(newDate, course.getEndDate());
    }

    @Test
    void setStartDate() {
        DateTime newDate = new DateTime();
        course.setStartDate(newDate);
        assertEquals(newDate, course.getStartDate());
    }
}