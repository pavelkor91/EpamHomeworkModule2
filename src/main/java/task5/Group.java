package task5;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

@RequiredArgsConstructor
public class Group <T extends Number>{

    @NonNull private T mark;
    @Getter
    @NonNull private Courses course;
    @Getter
    private Map <Student,T> students = new HashMap<>();

    public void addStudents(Student ... students){
        IntStream.range(0,students.length).
                forEach(i -> this.students.
                        putIfAbsent(students[i],this.mark));
    }

    public void setMark(Student student, T mark){
        this.students.computeIfPresent(student, (stud, m) -> mark);
    }

    public T getMark(Student student){
        return this.students.get(student);
    }
}
