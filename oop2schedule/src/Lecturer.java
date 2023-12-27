import java.util.ArrayList;
import java.util.List;
public class Lecturer {
    private int lecturerID;
    private String name;
    private String surname;
    private List<Subject> subjects;

    public Lecturer(int lecturerID, String name, String surname) {
        this.lecturerID = lecturerID;
        this.name = name;
        this.surname = surname;
        this.subjects = new ArrayList<>();
    }


    public void addSubject(Subject subject){
        subjects.add(subject);
    }
    public void removeSubject(Subject subject){
        subjects.remove(subject);
    }


    public int getLecturerID() {
        return lecturerID;
    }

    public void setLecturerID(int lecturerID) {
        this.lecturerID = lecturerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}
