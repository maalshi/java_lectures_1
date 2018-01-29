package schooldiary;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Diary {


    private int daysarray [] = new int[5];

    public void addDay() {
        for (int i=0; i<5;i++){
            daysarray[i] = i;
        }
    }

    public void addDate(String date){
        System.out.println(date);

    }

    public void addNote(int date, Note note){
        System.out.println(date);
        System.out.println(note);
      }

}
