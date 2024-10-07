public class testtasktracker {
    public static void main (String[] args) {
        tasktracker track = new tasktracker();
        track.addtask("Submit Email 1 at 8PM");
        track.addtodo("Start Homework 1");
        track.addtask("Submit Email 2 at 8:30PM");
        track.addtodo("Start Homework 2");
        track.showtasks();
        track.showtodos();
        track.removetasks(1);
        track.removetodos(2);
        track.showtasks();
        track.showtodos();
        track.showcompleted();
    }
}