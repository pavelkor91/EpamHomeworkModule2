package task5;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class University {

    @NonNull private String name;

    private List<Group> groups = new ArrayList<>();

    public void addGroup(Group group){
        groups.add(group);
    }

    public void addGroup(List<Group> groups){
        this.groups.addAll(groups);
    }

    public void getStudentMarks(Student student){
        System.out.println("Marks of student " + student.getName());
            for (Group g: groups){
                if(g.getStudents().containsKey(student)){
                    System.out.println(g.getCourse().toString() + ":" + g.getMark(student));
                }
            }
    }


}
