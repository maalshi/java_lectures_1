package schooldiary;

import schooldiary.enums.Lesson;
import schooldiary.enums.Mark;

public class Note {


    @Override
    public String toString() {
        return "Note{" +
                "hometask='" + hometask + '\'' +
                ", subject=" + subject +
                ", mark=" + mark +
                '}';
    }

    private String hometask;
    private Lesson subject;
    private Mark mark;


    public Note(Lesson lesson, String hometask, Mark five) {
    }

    public String getHometask() {
        return hometask;
    }

    public void setHometask(String hometask) {
        hometask = hometask;
    }

}
