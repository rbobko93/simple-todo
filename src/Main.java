import domain.Task;

public class Main {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();

        Task task = new Task("Nazwa1", "Desc");
        todoList.addTask(task);
    }
}
