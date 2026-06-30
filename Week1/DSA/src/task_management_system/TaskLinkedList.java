package task_management_system;

public class TaskLinkedList {

    private Task head;

    // Add Task
    public void addTask(Task task) {

        if (head == null) {
            head = task;
            return;
        }

        Task current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = task;
    }

    // Search Task
    public Task searchTask(int taskId) {

        Task current = head;

        while (current != null) {

            if (current.taskId == taskId) {
                return current;
            }

            current = current.next;
        }

        return null;
    }

    // Traverse Tasks
    public void traverseTasks() {

        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        Task current = head;

        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }

    // Delete Task
    public void deleteTask(int taskId) {

        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        if (head.taskId == taskId) {
            head = head.next;
            System.out.println("Task deleted successfully.");
            return;
        }

        Task current = head;

        while (current.next != null && current.next.taskId != taskId) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Task not found.");
        } else {
            current.next = current.next.next;
            System.out.println("Task deleted successfully.");
        }
    }
}