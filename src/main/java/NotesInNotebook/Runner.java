package NotesInNotebook;

public class Runner {

    public static void main(String[] args){
        Notebook notebook = new Notebook();
        notebook.addNote("note");
        notebook.editNote("Note");
        notebook.removeNote(" ");
        notebook.lookNote();
    }


}
