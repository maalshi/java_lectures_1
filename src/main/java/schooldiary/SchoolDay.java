package schooldiary;

import schooldiary.enums.Lesson;
import schooldiary.enums.Mark;

import java.util.Date;

public class SchoolDay {

    private Date date;
    private Note notesarray [] = new Note[10];

    public SchoolDay(Date date) {
        this.date = date;
    }


    public void addNote (Note note){
        for (int i =0; i<10; i++) {
            if (notesarray[i] == null) {
                notesarray[i] = note;
            }
            return;
        }
    }

}
