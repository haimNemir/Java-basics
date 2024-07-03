package OOP_exercises;

public class Note {
    private String title;
    private String content;
    private String date;
    private String status;

    /* Constructor */

    public Note(String title, String content, String date, String status){
        this.title = title;
        this.content = content;
        this.date = date;
        this.status = status;
    }

    /* Getter */

    public String getTitle(){
        return title;
    }

    public String getContent(){
        return content;
    }

    public String getDate(){
        return date;
    }

    public String getStatus(){
        return status;
    }

    /* Setter */

    public void setTitle(String title){
        this.title = title;
    }

    public void setContent(String content){
        this.content = content;
    }

    public void setStatus(String status){
        this.status = status;
    }
}






