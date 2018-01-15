package NotesInNotebook;

public class Note  {

    private String note;

    public Note(String note) {
        this.note = note;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        note = note;
    }

    @Override
    public String toString() {
        return "Note{" +
                "Note='" + note + '\'' +
                '}';
    }
}
