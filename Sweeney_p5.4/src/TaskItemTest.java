import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import jdk.internal.jimage.ImageStrings;
import jdk.nashorn.internal.objects.AccessorPropertyDescriptor;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

public class TaskItemTest {
    public ArrayList<TaskItem> taskList;
    @Test
    public void creatingTaskItemFailsWithInvalidDueDate(){
        LocalDate date = LocalDate.parse("2020-11-01");
        TaskItem task = new TaskItem("title", "description", date);

        assertEquals("ERROR: Can not add date previous to today!", task.getDueDate());
    }

    @Test
    public void creatingTaskItemFailsWithInvalidTitle(){
        LocalDate date = LocalDate.parse("2021-12-12");
        TaskItem task = new TaskItem("", "Description", date);
        String title = "";

        String expectedMessage = "ERROR: Title must contain at least 1 character!";
        Exception e = null;
        String actualMessage = "ERROR: Can not add date previous to today!";

        assertEquals("ERROR: Title must contain at least 1 character!", task);
    }


    @Test
    public void creatingTaskItemSucceedsWithValidDueDate(){

    }

    @Test
    public void creatingTaskItemSucceedsWithValidTitle(){

    }

    @Test
    public void settingTaskItemDueDateFailsWithInvalidDate(){

    }

    @Test
    public void settingTaskItemDueDateSucceedsWithValidDate(){

    }

    @Test
    public void settingTaskItemTitleFailsWithInvalidTitle(){

    }

    @Test
    public void settingTaskItemTitleSucceedsWithValidTitle(){

    }
}
