public class Task {
    // variables
    private String taskID;
    private String taskName;
    private String taskDesc;

    // default constructor
    public Task() {}

    // constructor
    public Task(
            String taskID,
            String taskName,
            String taskDesc
    ) throws MyExceptions {
        // setters added to constructor in order to provide input validation
        this.setTaskID(taskID);
        this.setTaskName(taskName);
        this.setTaskDesc(taskDesc);
    }

    // getters
    public String getTaskID() {
        return taskID;
    };
    public String getTaskName() {
        return taskName;
    };
    public String getTaskDesc() { return taskDesc; };


    // setters
    public void setTaskID(String taskID) throws MyExceptions {
        // check for taskID value (must not be null)
        if (taskID == null) {
            throw new MyExceptions("taskID cannot be null!");
        }
        // check for taskID length (must not exceed 10)
        if (taskID.length() > 10) {
            throw new MyExceptions("taskID length cannot exceed 10!");
        }
        // add taskID if successful
        else {
            this.taskID = taskID;
        }
    };

    public void setTaskName(String taskName) throws MyExceptions {
        // check for taskName value (must not be null)
        if (taskName == null) {
            throw new MyExceptions("taskName cannot be null!");
        }
        // check if taskName length exceeds 20
        if (taskName.length() > 20) {
            throw new MyExceptions("taskName length cannot exceed 20!");
        }
        // add taskName if successful
        else {
            this.taskName = taskName;
        }
    };

    public void setTaskDesc(String taskDesc) throws MyExceptions {
        // check for taskDesc value (must not be null)
        if (taskDesc == null) {
            throw new MyExceptions("taskDesc cannot be null!");
        }
        // check for taskDesc length (must not exceed 50)
        if (taskDesc.length() > 50) {
            throw new MyExceptions("taskDesc length cannot exceed 50!");
        }
        // add taskDesc if successful
        else {
            this.taskDesc = taskDesc;
        }
    };
}
