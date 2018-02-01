package schooldiary;

import schooldiary.enums.Lesson;
import schooldiary.enums.Mark;
import sun.util.calendar.JulianCalendar;

import java.util.Calendar;
import java.util.Date;

public class Runner {

    public static void main(String[] args) {
        Note note;

        Calendar calendar = Calendar.getInstance();
        Date date = new Date();
        Diary diary = new Diary();
        //diary.addNote(new Date(2018,10,10), new Note(Lesson.ALGEBRA, "", Mark.FIVE));
        diary.initDays(5, calendar.set(2010, 10, 10));
    }

}
