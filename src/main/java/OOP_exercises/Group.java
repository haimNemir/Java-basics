package OOP_exercises;

public class Group {
    private String nameOfTheGroup;
    private int existingNumberOfNotes;
    private Note[] arrayOfNotes = new Note[4];

    public Group (String nameOfTheGroup){
        this.nameOfTheGroup = nameOfTheGroup;
    }

    /* Setter */

    public void addNote(Note note){
        if (existingNumberOfNotes < arrayOfNotes.length){
            for (int i = 0; i < arrayOfNotes.length; i++) {
                if (arrayOfNotes[i] == null){
                    arrayOfNotes[i] = note;
                    existingNumberOfNotes++;
                    break;
                }
            }
        } else {
            System.out.println("Group out of space");
        }
    }

    public void removeNote(int positionOfNote){
        if (positionOfNote > 0 && positionOfNote < arrayOfNotes.length+1)
            arrayOfNotes[positionOfNote-1] = null;
        else
            System.out.println("Invalid position");
    }


    public void setNameOfTheGroup(String nameOfTheGroup) {
        this.nameOfTheGroup = nameOfTheGroup;
    }

    /* Getter */

    public Note getOneNoteFromTheArray(int positionOfTheNoteInTheArray){
        if (positionOfTheNoteInTheArray > 0 && positionOfTheNoteInTheArray < arrayOfNotes.length+1)
            if (arrayOfNotes[positionOfTheNoteInTheArray-1] != null)
                 return arrayOfNotes[positionOfTheNoteInTheArray-1];
            else{
                System.out.println("This position is empty");
                Note note = new Note("","","","");
                return (note);
            }
        else {
            System.out.println("Invalid position");
            return arrayOfNotes[arrayOfNotes.length-1];
        }
    }

    public String getNameOfTheGroup() {
        return nameOfTheGroup;
    }

    public int getExistingNumberOfNotes() {
        return existingNumberOfNotes;
    }

    public Note[] getArrayOfNotes() {
        return arrayOfNotes;
    }
}