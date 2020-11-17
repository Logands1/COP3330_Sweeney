import java.io.Serializable;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TaskItem implements Serializable{
    private String title;
    private String description;
    private LocalDate dueDate;
    private boolean complete;

    public TaskItem(String title, String description, LocalDate dueDate) {
        this.setTitle(title);
        this.setDescription(description);
        this.setDueDate(dueDate);
        this.complete = false;

    }


    public void setTitle(String title) throws NullPointerException{
        if (title.trim().equals("") || title == null) {
            throw new NullPointerException("\nERROR: Title must contain at least 1 character!\n");
        } else {
            this.title = title;
        }
    }

    public String getTitle() {
        return this.title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDueDate(LocalDate dueDate)  throws DateTimeException {
        if (dueDate.compareTo(LocalDate.now()) < 0) {
            throw new DateTimeException("\nERROR: Can not add date previous to today!\n");
        } else {
            DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            this.dueDate = LocalDate.parse(dueDate.format(formattedDate));
        }
    }

    public LocalDate getDueDate() {
        return this.dueDate;
    }

    public String printTask(){
        return ("[" + dueDate + "]" + title + ":" + description);
    }



    public boolean isComplete(){
        return this.complete;
    }

    public boolean markComplete(){
        this.complete = true;
        return this.complete;
    }

    public boolean markIncomplete(){
        this.complete = false;
        return this.complete;
    }

    public String printStringTask(){
        return ("Title: " + title + " Description: " + description + " Due Date: " + dueDate + (complete?"***": ""));
    }

}