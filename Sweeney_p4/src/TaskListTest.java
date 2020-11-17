import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

public class TaskListTest {
    public ArrayList<TaskItem> taskList;

    @Test
    public void addingTaskItemsIncreasesSize(){
        ArrayList<TaskItem> taskList = new ArrayList<>();
        int firstSize = taskList.size();
        LocalDate dueDate = LocalDate.parse("2021-12-01");
        int tru = 0;

        this.taskList.add(new TaskItem("title", "description", dueDate));
        int secondSize = taskList.size();
        if(secondSize > firstSize){
            tru = 1;
        }

        assertEquals(1, tru);
    }
    @Test
    public void completingTaskItemChangesStatus(){}
    @Test
    public void completingTaskItemFailsWithInvalidIndex(){}
    @Test
    public void editingTaskItemChangesValues(){}
    @Test
    public void editingTaskItemDescriptionChangesValue(){}
    @Test
    public void editingTaskItemDescriptionFailsWithInvalidIndex(){}
    @Test
    public void editingTaskItemDueDateChangesValue(){}
    @Test
    public void editingTaskItemDueDateFailsWithInvalidIndex(){}
    @Test
    public void editingTaskItemTitleChangesValue(){}
    @Test
    public void editingTaskItemTitleFailsWithInvalidIndex(){}
    @Test
    public void gettingTaskItemDescriptionFailsWithInvalidIndex(){}
    @Test
    public void gettingTaskItemDescriptionSucceedsWithValidIndex(){}
    @Test
    public void gettingTaskItemDueDateFailsWithInvalidIndex(){}
    @Test
    public void gettingTaskItemDueDateSucceedsWithValidIndex(){}
    @Test
    public void gettingTaskItemTitleFailsWithInvalidIndex(){}
    @Test
    public void gettingTaskItemTitleSucceedsWithValidIndex(){}
    @Test
    public void newTaskListIsEmpty(){}
    @Test
    public void removingTaskItemsDecreasesSize(){}
    @Test
    public void removingTaskItemsFailsWithInvalidIndex(){}
    @Test
    public void savedTaskListCanBeLoaded(){}
    @Test
    public void uncompletingTaskItemChangesStatus(){}
    @Test
    public void uncompletingTaskItemFailsWithInvalidIndex(){}
}
