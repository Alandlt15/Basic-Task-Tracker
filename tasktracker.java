import java.util.ArrayList;
import java.util.List;

/**
   tasktracker can track tasks and to-do items. Adds either or
   to a completed list once they are removed from their lists.
*/
public class tasktracker {
    //instance variables
    private int num_tasks;
    private int num_todo;
    
    //lists declaration
    private List<String> task_details;
    private List<String> todo_details;
    private List<String> completed;

    /**
      Constructs 3 empty lists.
   */
    public tasktracker() {
        this.num_tasks = 0;
        this.num_todo = 0;
        task_details = new ArrayList<>();
        todo_details = new ArrayList<>();
        completed = new ArrayList<>();
    }

    /**
      Adds a task into task_details list.
      @param task is the string to add.
   */
    public void addtask(String task) {
        task_details.add(task);
        this.num_tasks++;
    }

    /**
      Adds a todo into todo_details list.
      @param todo is the string to add.
   */
    public void addtodo(String todo) {
        todo_details.add(todo);
        this.num_todo++;
    }

    /**
      Gets the string element of the task list.
      @param index is used to return the string.
   */
    public String gettask(int index) {
        return task_details.get(index-1);
    }

    /**
      Gets the string element of the todo list.
      @param index is used to return the string.
   */
    public String gettodo(int index) {
        return todo_details.get(index-1);
    }

    /**
      Shows all the items in task list.
   */
    public void showtasks() {
        System.out.println("Pending Tasks:");
        for (int i = 0; i < task_details.size(); i++) {
            System.out.println((i+1) + ". " + task_details.get(i));
        }
    }

    /**
      Shows all the items in the todo list.
   */
    public void showtodos() {
        System.out.println("Pending To-do:");
        for (int i = 0; i < todo_details.size(); i++) {
            System.out.println((i+1) + ". " + todo_details.get(i));
        }
    }

    /**
      Removes an element from the task list and adds it to complete.
      @param index is the elemnet to remove.
   */
    public void removetasks(int index) {
        String remove = gettask(index-1);
        task_details.remove(index-1);
        this.num_tasks--;
        completed.add(remove);
    }
    /**
      Removes an element from the todo list and adds it to complete.
      @param index is the elemnet to remove.
   */
    public void removetodos(int index) {
        String remove = gettodo(index-1);
        todo_details.remove(index-1);
        this.num_todo--;
        completed.add(remove);
    }
    /**
      Shows all the items in the completed list.
   */
    public void showcompleted() {
        System.out.println("Completed:");
        for (int i = 0; i < completed.size(); i++) {
            System.out.println((i+1) + ". " + completed.get(i));
        }
    }
}