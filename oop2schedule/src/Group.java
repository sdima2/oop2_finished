import java.util.ArrayList;
import java.util.List;

public class Group {

    private int groupNumber;
    private List<Student> students;


    public Group(int groupNumber) {
        this.groupNumber = groupNumber;
        this.students = new ArrayList<>();

    }
    public void addStudent(Student student) {
            students.add(student);
    }
    public void removeStudent(Student student) {
            students.remove(student);
    }


    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }




}
