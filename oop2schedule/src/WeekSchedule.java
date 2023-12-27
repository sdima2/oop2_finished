import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class WeekSchedule {

    private List<DaySchedule> weekSchedule;


    public WeekSchedule() {
        this.weekSchedule = new ArrayList<>();
    }

    public void addToWeekSchedule(DaySchedule daySchedule){ //добавляем расписание одной пары и сортируем по времени
        weekSchedule.add(daySchedule);
        weekSchedule.sort(Comparator.comparing(DaySchedule::getTime));
    }
    public void printer(List<DaySchedule> ds, int groupNumb) {
        String[] daysOfWeek = {"ПОНЕДЕЛЬНИК", "ВТОРНИК", "СРЕДА", "ЧЕТВЕРГ", "ПЯТНИЦА", "СУББОТА"};
        boolean hasLessons;
        for (int i = 0; i < daysOfWeek.length; i++) {
            hasLessons = false;
            System.out.println("————" + daysOfWeek[i] + "————");
            for (DaySchedule schedule : ds) {
                if (schedule.getDayoftheweek().equals(DayOfTheWeek.values()[i]) && schedule.getGroup().getGroupNumber() == groupNumb) {
                    System.out.println(schedule.getInformation());
                    hasLessons = true;
                }
            }
            if (!hasLessons) {
                System.out.println("Занятий нет");
            }
            System.out.println();
        }
    }


    public List<DaySchedule> getWeekSchedule() {
        return weekSchedule;
    }

    public void setWeekSchedule(List<DaySchedule> weekSchedule) {
        this.weekSchedule = weekSchedule;
    }


}
