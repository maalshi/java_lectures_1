package NotesInNotebook;

public class Notebook {

    Note[] notes = new Note[10];

    public void addNote(){
        notes = new Note[1];
        notes [0] = Note.ADDED_NOTE;

    }
    public void editNote(){
        notes = new Note[1];
        notes[0] = Note.EDITED_NOTE;

    }
    public void removeNote(){
        notes = new Note[1];
        notes[0] = Note.REMOVED_NOTE;

    }
    public void lookNote(){
        System.out.println(notes[0]);

    }
}
