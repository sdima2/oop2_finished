import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.print("Введите номер группы: ");

        Scanner scanner1 = new Scanner(System.in);

        int groupNumb = Integer.parseInt (scanner1.nextLine());



        Time time = new Time();
        WeekSchedule weekSchedule = new WeekSchedule();

  

        Subject subject1 = new Subject(1,"Английский язык", 1);
        Subject subject2 = new Subject(2,"География", 1);
        Subject subject3 = new Subject(3,"Философия", 1);
        Subject subject4 = new Subject(4,"Литература", 1);
        Subject subject5 = new Subject(4,"Физическая культура", 1);


        Lecturer lecturer1 = new Lecturer(1,"Сергей", "Иванов");
        Lecturer lecturer2 = new Lecturer(2,"Сергей", "Петров");
        Lecturer lecturer3 = new Lecturer(3,"Надежда", "Андреевна");
        Lecturer lecturer4 = new Lecturer(3,"Виктор", "Сергеев");

        Group group1 = new Group(1);
        Group group2 = new Group(2);

        Student student1 = new Student(1,"Петр", "Петров");
        Student student2 = new Student(2,"Алена", "Попова");

        Student student3 = new Student(3,"Андрей", "Петров");
        Student student4 = new Student(4,"Антон", "Андреев");

        group1.addStudent(student1);
        group1.addStudent(student2);

        group2.addStudent(student3);
        group2.addStudent(student4);

        DaySchedule schedule1 = new DaySchedule(DayOfTheWeek.MONDAY, time.firstPair, subject1, lecturer1, group1); //группа 1
        DaySchedule schedule2 = new DaySchedule(DayOfTheWeek.MONDAY, time.secondPair, subject2, lecturer2, group1);
        DaySchedule schedule3 = new DaySchedule(DayOfTheWeek.TUESDAY, time.thirdPair, subject1, lecturer1, group1);
        DaySchedule schedule4 = new DaySchedule(DayOfTheWeek.FRIDAY, time.secondPair, subject3, lecturer3, group1);
        DaySchedule schedule5 = new DaySchedule(DayOfTheWeek.FRIDAY, time.fifthPair, subject4, lecturer3, group1);
        DaySchedule schedule6 = new DaySchedule(DayOfTheWeek.WEDNESDAY, time.secondPair, subject5, lecturer4, group1);
        DaySchedule schedule7 = new DaySchedule(DayOfTheWeek.THURSDAY, time.firstPair, subject1, lecturer1, group1);
        DaySchedule schedule8 = new DaySchedule(DayOfTheWeek.THURSDAY, time.fourthPair, subject2, lecturer2, group1);

        DaySchedule schedule10 = new DaySchedule(DayOfTheWeek.SATURDAY, time.fourthPair, subject5, lecturer4, group2); //группа 2
        DaySchedule schedule11 = new DaySchedule(DayOfTheWeek.MONDAY, time.firstPair, subject1, lecturer1, group2);
        DaySchedule schedule12 = new DaySchedule(DayOfTheWeek.MONDAY, time.secondPair, subject2, lecturer2, group2);
        DaySchedule schedule13 = new DaySchedule(DayOfTheWeek.TUESDAY, time.thirdPair, subject1, lecturer1, group2);
        DaySchedule schedule14 = new DaySchedule(DayOfTheWeek.FRIDAY, time.secondPair, subject3, lecturer3, group2);
        DaySchedule schedule15 = new DaySchedule(DayOfTheWeek.FRIDAY, time.fifthPair, subject4, lecturer3, group2);
        DaySchedule schedule16 = new DaySchedule(DayOfTheWeek.WEDNESDAY, time.secondPair, subject5, lecturer4, group2);
        DaySchedule schedule17 = new DaySchedule(DayOfTheWeek.THURSDAY, time.firstPair, subject1, lecturer1, group2);
        DaySchedule schedule18 = new DaySchedule(DayOfTheWeek.THURSDAY, time.fourthPair, subject2, lecturer2, group2);
        DaySchedule schedule19 = new DaySchedule(DayOfTheWeek.SATURDAY, time.thirdPair, subject5, lecturer4, group2);



        weekSchedule.addToWeekSchedule(schedule1);
        weekSchedule.addToWeekSchedule(schedule2);
        weekSchedule.addToWeekSchedule(schedule3);
        weekSchedule.addToWeekSchedule(schedule4);
        weekSchedule.addToWeekSchedule(schedule5);
        weekSchedule.addToWeekSchedule(schedule6);
        weekSchedule.addToWeekSchedule(schedule7);
        weekSchedule.addToWeekSchedule(schedule8);


        weekSchedule.addToWeekSchedule(schedule10);
        weekSchedule.addToWeekSchedule(schedule11);
        weekSchedule.addToWeekSchedule(schedule12);
        weekSchedule.addToWeekSchedule(schedule13);
        weekSchedule.addToWeekSchedule(schedule14);
        weekSchedule.addToWeekSchedule(schedule15);
        weekSchedule.addToWeekSchedule(schedule16);
        weekSchedule.addToWeekSchedule(schedule17);
        weekSchedule.addToWeekSchedule(schedule18);
        weekSchedule.addToWeekSchedule(schedule19);




        Subject subject6 = new Subject(6,"Электродинамика", 1);
        Subject subject7 = new Subject(7,"Термостатика", 1);
        Subject subject8 = new Subject(8,"Философия", 1);
        Subject subject9 = new Subject(9,"Английский язык", 1);
        Subject subject10 = new Subject(10,"Физическая культура", 1);


        Lecturer lecturer5 = new Lecturer(5,"Андрей", "Иванов");
        Lecturer lecturer6 = new Lecturer(6,"Дмитрий", "Соколов");
        Lecturer lecturer7 = new Lecturer(7,"Варвара", "Петренко");
        Lecturer lecturer8 = new Lecturer(8,"Екатерина", "Журавлева");

        Group group3 = new Group(3);
        Group group4 = new Group(4);

        Student student5 = new Student(5,"Петр", "Петров");
        Student student6 = new Student(6,"Алена", "Попова");

        Student student7 = new Student(7,"Андрей", "Петров");
        Student student8 = new Student(8,"Антон", "Андреев");

        group1.addStudent(student5);
        group1.addStudent(student6);

        group2.addStudent(student7);
        group2.addStudent(student8);

        DaySchedule schedule20 = new DaySchedule(DayOfTheWeek.MONDAY, time.firstPair, subject6, lecturer5, group3); //группа 3
        DaySchedule schedule21 = new DaySchedule(DayOfTheWeek.MONDAY, time.secondPair, subject9, lecturer6, group3);

        DaySchedule schedule23 = new DaySchedule(DayOfTheWeek.FRIDAY, time.secondPair, subject6, lecturer8, group3);
        DaySchedule schedule24 = new DaySchedule(DayOfTheWeek.FRIDAY, time.fifthPair, subject10, lecturer7, group3);
        DaySchedule schedule25 = new DaySchedule(DayOfTheWeek.WEDNESDAY, time.secondPair, subject7, lecturer5, group3);
        DaySchedule schedule26 = new DaySchedule(DayOfTheWeek.THURSDAY, time.firstPair, subject1, lecturer6, group3);
        DaySchedule schedule27 = new DaySchedule(DayOfTheWeek.THURSDAY, time.fourthPair, subject2, lecturer7, group3);
        DaySchedule schedule28 = new DaySchedule(DayOfTheWeek.SATURDAY, time.fourthPair, subject6, lecturer8, group3);

        DaySchedule schedule29 = new DaySchedule(DayOfTheWeek.SATURDAY, time.fourthPair, subject6, lecturer7, group4); //группа 4
        DaySchedule schedule30 = new DaySchedule(DayOfTheWeek.MONDAY, time.firstPair, subject7, lecturer6, group4);
        DaySchedule schedule31 = new DaySchedule(DayOfTheWeek.MONDAY, time.secondPair, subject8, lecturer5, group4);
        DaySchedule schedule32 = new DaySchedule(DayOfTheWeek.TUESDAY, time.thirdPair, subject9, lecturer6, group4);
        DaySchedule schedule33 = new DaySchedule(DayOfTheWeek.FRIDAY, time.secondPair, subject6, lecturer7, group4);
        DaySchedule schedule34 = new DaySchedule(DayOfTheWeek.FRIDAY, time.fifthPair, subject9, lecturer8, group4);
        DaySchedule schedule35 = new DaySchedule(DayOfTheWeek.WEDNESDAY, time.secondPair, subject8, lecturer7, group4);
        DaySchedule schedule36 = new DaySchedule(DayOfTheWeek.THURSDAY, time.firstPair, subject7, lecturer6, group4);
        DaySchedule schedule37 = new DaySchedule(DayOfTheWeek.THURSDAY, time.fourthPair, subject6, lecturer5, group4);
        DaySchedule schedule38 = new DaySchedule(DayOfTheWeek.SATURDAY, time.fifthPair, subject7, lecturer6, group4);

        weekSchedule.addToWeekSchedule(schedule20);
        weekSchedule.addToWeekSchedule(schedule21);

        weekSchedule.addToWeekSchedule(schedule23);
        weekSchedule.addToWeekSchedule(schedule24);
        weekSchedule.addToWeekSchedule(schedule25);
        weekSchedule.addToWeekSchedule(schedule26);
        weekSchedule.addToWeekSchedule(schedule27);
        weekSchedule.addToWeekSchedule(schedule28);

        weekSchedule.addToWeekSchedule(schedule29);
        weekSchedule.addToWeekSchedule(schedule30);
        weekSchedule.addToWeekSchedule(schedule31);
        weekSchedule.addToWeekSchedule(schedule32);
        weekSchedule.addToWeekSchedule(schedule33);
        weekSchedule.addToWeekSchedule(schedule34);
        weekSchedule.addToWeekSchedule(schedule35);
        weekSchedule.addToWeekSchedule(schedule36);
        weekSchedule.addToWeekSchedule(schedule37);
        weekSchedule.addToWeekSchedule(schedule38);



        List<DaySchedule> weekSchedule1 = weekSchedule.getWeekSchedule();


        System.out.println("Расписание группы " + groupNumb);


        weekSchedule.printer(weekSchedule1, groupNumb);


    }
}