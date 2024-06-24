import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskServiceTest {
    TaskService service = new TaskService();

    // test add task //
    @Test
    void testAddTask() throws MyExceptions {
        Task task = new Task("12345", "Chore #1", "Clean room");

        // test adding task
        Assertions.assertDoesNotThrow(()-> {
            service.addTask(task);
        });
    }
    @Test
    void testAddTaskWithDuplicateID() throws MyExceptions {
        Task task = new Task("12345", "Chore #1", "Clean room");
        service.addTask(task);
        Task task2 = new Task("12345", "Chore #2", "Clean room");

        // test adding task with duplicate ID
        Assertions.assertThrows(MyExceptions.class, ()-> {
            service.addTask(task2);
        });
    }

    // test delete task //
    @Test
    void testDeleteTask() throws MyExceptions {
        Task task = new Task("12345", "Chore #1", "Clean room");
        service.addTask(task);

        // test deleting appointments
        Assertions.assertDoesNotThrow(()-> {
            service.deleteTask(task);
        });
    }
    @Test
    void testDeleteTaskIDNotFound() throws MyExceptions {
        Task task = new Task();

        // test deleting task with non-existent task
        Assertions.assertThrows(MyExceptions.class, ()-> {
            service.deleteTask(task);
        });
    }


    // test update task //
    @Test
    void testUpdateTask() throws MyExceptions {
        Task task = new Task("12345", "Chore #1", "Clean room");
        service.addTask(task);

        String name = "Chore #2";
        String desc = "Wipe kitchen table";

        // test updating task
        Assertions.assertDoesNotThrow(()-> {
            service.updateTask(task, name, desc);
        });
    }
    @Test
    void testUpdateTaskIDNotFound() throws MyExceptions {
        Task task = new Task();

        String name = "Chore #2";
        String desc = "Wipe kitchen table";

        // test updating task with non-existent task
        Assertions.assertThrows(MyExceptions.class, ()-> {
            service.updateTask(task, name, desc);
        });
    }
}
