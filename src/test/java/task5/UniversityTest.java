package task5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class UniversityTest {

    University university;
    Student stud1;
    Student stud2;
    Student stud3;
    Student stud4;
    Student stud5;
    Student stud6;
    Student stud7;
    List<Group> groups;
    @BeforeEach
    void install() {
        university = new University("IFMO");

         stud1 = new Student("IvanovAndrey" , 20);
         stud2 = new Student("PetrovPetr" , 19);
         stud3 = new Student("SergeevIvan" , 18);
         stud4 = new Student("AndreevSergey" , 22);
         stud5 = new Student("PavlovPavel" , 22);
         stud6 = new Student("SemenovSemen" , 21);
         stud7 = new Student("StepanovStepan" , 23);
         groups = new ArrayList<>();
         groups.add(new Group(1, Courses.MATH));
         groups.add(new Group(2.5, Courses.ENGLISH));
         groups.add(new Group(1, Courses.COMPUTER_SIENCE));
         groups.get(0).addStudents(stud1,stud2,stud3);
         groups.get(1).addStudents(stud2,stud4,stud5);
         groups.get(2).addStudents(stud7,stud6,stud1);
         university.addGroup(groups);
    }

    @Test
    void getMarksTest(){
        university.getStudentMarks(stud1);
        university.getStudentMarks(stud2);
        university.getStudentMarks(stud6);
    }

    @Test
    void testSetMark(){
        groups.get(0).setMark(stud6, 5);
        assertThat(groups.get(0).getMark(stud6), equalTo(5));
    }
}
