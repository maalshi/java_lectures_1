package schooldiary;

import java.util.Date;

public class Diary {


    private Day daysarray [] = new Day [5];

    public void addDay(){

        for (int i =0; i<5; i++){
            daysarray[i] = daysarray[i];
            System.out.println(daysarray[i]);
            return;
        }
    }

    public void addDate(String date){
        System.out.println(date);

    }

    public void addNote(Date date, Note note){
        System.out.println(date);
        System.out.println(note);
      }

}
