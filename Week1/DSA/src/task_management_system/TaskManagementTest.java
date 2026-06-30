package task_management_system;

public class TaskManagementTest {

    public static void main(String[] args) {

        TaskLinkedList taskList = new TaskLinkedList();

        taskList.addTask(new Task(101, "Complete Java Assignment", "Pending"));
        taskList.addTask(new Task(102, "Prepare Presentation", "In Progress"));
        taskList.addTask(new Task(103, "Submit Report", "Completed"));

        System.out.println("All Tasks");
        taskList.traverseTasks();

        System.out.println("\nSearching Task 102");
        Task task = taskList.searchTask(102);

        if (task != null)
            System.out.println(task);
        else
            System.out.println("Task not found.");

        System.out.println("\nDeleting Task 101");
        taskList.deleteTask(101);

        System.out.println("\nTasks After Deletion");
        taskList.traverseTasks();
    }
}