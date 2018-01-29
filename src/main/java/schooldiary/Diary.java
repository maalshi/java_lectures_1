package schooldiary;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Diary {


    private int daysarray [] = new int[5];

    public void addDay() {
        int i = 0;
       while( i < 5) {
            daysarray[0] = i;
        }

        System.out.println("Day " + daysarray[i]);
    }

    public void addDate(String date){
        System.out.println(date);

    }

    public void addNote(int date, Note note){
        System.out.println(date);
        System.out.println(note);
      }

}
