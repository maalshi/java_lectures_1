package schooldiary;

import schooldiary.enums.Lesson;
import schooldiary.enums.Mark;
import sun.util.calendar.JulianCalendar;

import java.util.Calendar;
import java.util.Date;

public class Runner {

    public static void main(String[] args) {
        Note note;
        Date date;

        Calendar calendar = Calendar.getInstance();
        Diary diary = new Diary();
        diary.addNote(2, new Note(Lesson.ALGEBRA, "", Mark.FIVE));
       // diary.initDays();
    }

}
