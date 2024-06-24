import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskTest {
    // for taskID //
    @Test
    void testTaskID() throws MyExceptions {

        Task task = new Task("12345", "Task #1", "Wisdom teeth removal");

        // check if taskID is right length
        assertTrue(task.getTaskID().length() < 11);
        // check if taskID is not null
        assertTrue(task.getTaskID() != null);
    }

    // positives:
    @Test
    void testTaskIDRightLength() throws MyExceptions {
        Task task = new Task("12345", "Task #1", "Wisdom teeth removal");

        // check if taskID is right length
        assertTrue(task.getTaskID().length() < 11);
    }
    @Test
    void testTaskIDNotNull() throws MyExceptions {
        Task task = new Task("12345", "Task #1", "Wisdom teeth removal");

        // check if taskID is not null
        assertTrue(task.getTaskID() != null);
    }

    // negatives:
    @Test
    void testTaskIDNull() {
        // check if taskID is null
        Assertions.assertThrows(MyExceptions.class, ()-> {
            new Task(null, "Task #1", "Wisdom teeth removal");
        });
    }
    @Test
    void testTaskIDTooLong() {
        // check if taskID is not right length
        Assertions.assertThrows(MyExceptions.class, ()-> {
            new Task("1234567891011", "Task #1", "Wisdom teeth removal");
        });
    }


    // for taskName //
    @Test
    void testTaskName() throws MyExceptions {
        Task task = new Task("12345", "Task #1", "Wisdom teeth removal");

        // check if taskName is right length
        assertTrue(task.getTaskName().length() < 21);
        // check if taskName is not null
        assertTrue(task.getTaskName() != null);
    }

    // positives
    @Test
    void testTaskNameRightLength() throws MyExceptions {
        Task task = new Task("12345", "Task #1", "Wisdom teeth removal");

        // check if taskName is right length
        assertTrue(task.getTaskName().length() < 21);
    }
    @Test
    void testTaskNameNotNull() throws MyExceptions {
        Task task = new Task("12345", "Task #1", "Wisdom teeth removal");

        // check if taskName is not null
        assertTrue(task.getTaskName() != null);
    }

    // negatives
    @Test
    void testTaskNameTooLong() {
        // check if taskName is too long
        Assertions.assertThrows(MyExceptions.class, ()-> {
            new Task("12345", "this name is too long", "Wisdom teeth removal");
        });
    }
    @Test
    void testTaskNameNull() {
        // check if taskName is null
        Assertions.assertThrows(MyExceptions.class, ()-> {
            new Task("12345", null, "Wisdom teeth removal");
        });
    }


    // for taskDesc //
    @Test
    void testTaskDesc() throws MyExceptions {
        Task task = new Task("12345", "Task #1", "Wisdom teeth removal");

        // check if task desc is right length
        assertTrue(task.getTaskDesc().length() < 51);
        // check if task desc is not null
        assertTrue(task.getTaskDesc() != null);
    }

    // positives:
    @Test
    void testTaskDescRightLength() throws MyExceptions {
        Task task = new Task("12345", "Task #1", "Wisdom teeth removal");

        // check if task desc is right length
        assertTrue(task.getTaskDesc().length() < 51);
    }
    @Test
    void testTaskDescNotNull() throws MyExceptions {
       Task task = new Task("12345", "Task #1", "Wisdom teeth removal");

        // check if task desc is not null
        assertTrue(task.getTaskDesc() != null);
    }

    // negatives
    @Test
    void testTaskDescTooLong() throws MyExceptions {
        // check if task desc is too long
        Assertions.assertThrows(MyExceptions.class, ()-> {
            new Task("12345", "Task #1", "this task description is waaaaaaaaaaaaaaaaay too long");
        });
    }
    @Test
    void testTaskDescNull() throws MyExceptions {
        // check if task desc is null
        Assertions.assertThrows(MyExceptions.class, ()-> {
            new Task("12345", "Task #1", null);
        });
    }
}
