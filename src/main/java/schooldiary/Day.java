package schooldiary;

import schooldiary.enums.Lesson;
import schooldiary.enums.Mark;

public class Day {

    Note notesarray [] = new Note[10];

    public Day(Note note) {
    }

    public void addNote(){
        for (int i =0; i<10; i++){
            notesarray[i] = new Note();
        }
    }
}
