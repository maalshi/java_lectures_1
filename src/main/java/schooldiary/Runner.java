package schooldiary;

import schooldiary.enums.Lesson;
import schooldiary.enums.Mark;
import sun.util.calendar.JulianCalendar;

import java.util.Date;

public class Runner {

    public static void main(String[] args) {
        Note note;
        Date date;

        Diary diary = new Diary();
        diary.addNote(new Date(10/04/2018), new Note(Lesson.MATHS, "page 1 task 4", Mark.FOUR));
    }

}
