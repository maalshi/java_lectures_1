package schooldiary;

import schooldiary.enums.Lesson;
import schooldiary.enums.Mark;

public class Note {

    private Lesson lesson;
    private String hometask;
    private Mark mark;

    public Note(Lesson lesson, String hometask, Mark mark) {
        this.lesson = lesson;
        this.hometask = hometask;
        this.mark = mark;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

    public String getHometask() {
        return hometask;
    }

    public void setHometask(String hometask) {
        hometask = hometask;
    }

    @Override
    public String toString() {
        return "Note{" +
                "hometask='" + hometask + '\'' +
                ", lesson=" + lesson +
                ", mark=" + mark +
                '}';
    }

}
