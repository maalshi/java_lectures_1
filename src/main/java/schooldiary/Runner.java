package schooldiary;

import schooldiary.enums.Lesson;
import schooldiary.enums.Mark;

public class Runner {

    public static void main(String[] args) {

        Diary diary = new Diary();
        diary.addDate("1 Feb 2018");
        diary.addDay(new Day(new Note(Lesson.ALGEBRA, "", Mark.FIVE)));
    }

}
