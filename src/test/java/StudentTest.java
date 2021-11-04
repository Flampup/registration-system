import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    ArrayList<Module> modules = new ArrayList<Module>();
    Module mod1 = new Module("Programing", "CT101");
    Module mod2 = new Module("Maths", "MA101");
    Course course = new Course("BCT", new DateTime(), new DateTime());
    Student student = new Student("Alan", 20, "01/01/2001", "1111", course);
    @Test
    void getUsername() {
        assertEquals("Alan20", student.getUsername());
    }
    @Test
    void getId() {
        assertEquals("1111", student.getId());
    }
    @Test
    void getName() {
        assertEquals("Alan", student.getName());
    }
    @Test
    void getModules() {
        assertEquals(modules, student.getModules());
    }
    @Test
    void getAge() {
        assertEquals(20, student.getAge());
    }
    @Test
    void getCourseEnrolled() {
        assertEquals(course, student.getCourseEnrolled());
    }
    @Test
    void getDob() {
        assertEquals("01/01/2001", student.getDob());
    }
    @Test
    void setAge() {
        student.setAge(22);
        assertEquals(22, student.getAge());
    }
    @Test
    void setId() {
        student.setId("1212");
        assertEquals("1212", student.getId());
    }
    @Test
    void setName() {
        student.setName("Patrick");
        assertEquals("Patrick", student.getName());
    }
    @Test
    void setModules() {
        ArrayList<Module> modules = new ArrayList<Module>();
        modules.add(mod1);
        modules.add(mod2);
        student.setModules(modules);
        assertEquals(modules, student.getModules());
    }
    @Test
    void setCourseEnrolled() {
        Course newCourse = new Course("Engineering", new DateTime(), new DateTime());
        student.setCourseEnrolled(newCourse);
        assertEquals(newCourse, student.getCourseEnrolled());
    }
    @Test
    void setDob() {
        student.setDob("05/08/1998");
        assertEquals("05/08/1998", student.getDob());
    }

}