import java.time.LocalTime;

public class DaySchedule {

    private DayOfTheWeek dayoftheweek;
    private LocalTime time;
    private Subject subject;
    private Lecturer lecturer;
    private Group group;



    public DaySchedule(DayOfTheWeek dayoftheweek, LocalTime time, Subject subject, Lecturer lecturer, Group group) {
        this.dayoftheweek = dayoftheweek;
        this.time = time;
        this.subject = subject;
        this.lecturer = lecturer;
        this.group = group;

    }

    public String getInformation(){
        return subject.getName() + ", Преподаватель " + lecturer.getName() + " "  + lecturer.getSurname() + ", " + time.toString();

    }

    public DayOfTheWeek getDayoftheweek() {
        return dayoftheweek;
    }

    public void setDayoftheweek(DayOfTheWeek dayoftheweek) {
        this.dayoftheweek = dayoftheweek;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

}

