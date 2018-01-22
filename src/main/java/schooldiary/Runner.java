package schooldiary;

import schooldiary.enums.Lesson;
import schooldiary.enums.Mark;
import sun.util.calendar.JulianCalendar;

import java.util.Date;

public class Runner {

    public static void main(String[] args) {
        Note note;

        Diary diary = new Diary();
        diary.addNote(new Date(10/02/2018), new Note(Lesson.MATHS, "", Mark.FOUR));
    }

}
