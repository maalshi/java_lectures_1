package schooldiary;

import schooldiary.enums.Lesson;
import schooldiary.enums.Mark;

public class Day {

    Note notesarray [] = new Note[10];

    public Day(Note note) {

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
