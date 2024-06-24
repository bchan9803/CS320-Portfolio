import java.util.HashMap;
import java.util.Map;

public class TaskService {
    // task hashmap //
    Map<String, Object> taskHashMap = new HashMap<>();

    //  methods //
    public void addTask(Task task) throws MyExceptions {
        // check for duplicate tasks
        if (taskHashMap.containsKey(task.getTaskID())) {
            throw new MyExceptions("Task could not be added! Task must have unique ID!");
        }

        // if successful, add task to taskHashMap
        taskHashMap.put(task.getTaskID(), task);
    };

    public void deleteTask(Task task) throws MyExceptions {
        // check for taskID in taskHashMap
        if (taskHashMap.containsKey(task.getTaskID())) {
            // if found, delete task
            taskHashMap.remove(task.getTaskID());
        }
        // if not found, throw exception
        else {
            throw new MyExceptions("Task could not be deleted! TaskID not found!");
        }
    }

    public void updateTask(Task task, String name, String desc) throws MyExceptions {
        // check for taskID in taskHashMap
        if (taskHashMap.containsKey(task.getTaskID())) {
            task.setTaskName(name);
            task.setTaskDesc(desc);

            // test updated task output
            System.out.println("taskID: " + task.getTaskID());
            System.out.println("taskName: " + task.getTaskName());
            System.out.println("taskDesc: " + task.getTaskDesc());
        }
        // if not found, throw exception
        else {
            throw new MyExceptions("Task could not be updated! TaskID not found.");
        }
    }
}
