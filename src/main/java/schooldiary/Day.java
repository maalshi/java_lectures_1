package schooldiary;

import schooldiary.enums.Lesson;
import schooldiary.enums.Mark;

import java.util.Date;

public class Day {

    private Date date;
    private Note notesarray [] = new Note[10];

    public Day(Note note, Note note1, Note note2) {

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
