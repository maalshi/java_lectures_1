package schooldiary;

import schooldiary.enums.Lesson;
import schooldiary.enums.Mark;

public class Diary {

    String date;

    Day daysarray [] = new Day [5];

    public void addDay(){
        for (int i =0; i<5; i++){
            daysarray[i] = new Day(Note note);
            System.out.println(daysarray[i]);
            return;
        }
    }

    public void addDate(){
        System.out.println("1 Feb 2018");

    }


}
