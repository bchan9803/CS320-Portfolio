import java.util.Date;

public class Appointment {
    // variables
    private String appointmentID;
    private Date appointmentDate;
    private String appointmentDesc;

    // default constructor
    public Appointment() {}

    // constructor
    public Appointment(
        String appointmentID,
        Date appointmentDate,
        String appointmentDesc
    ) throws MyExceptions {
        // setters added to constructor in order to provide input validation
        this.setAppointmentID(appointmentID);
        this.setAppointmentDate(appointmentDate);
        this.setAppointmentDesc(appointmentDesc);
    }

    // getters
    public String getAppointmentID() {
        return appointmentID;
    };
    public Date getAppointmentDate() {
        return appointmentDate;
    };
    public String getAppointmentDesc() {
        return appointmentDesc;
    };

    // setters
    public void setAppointmentID(String appointmentID) throws MyExceptions {
        // check for appointmentID value (must not be null)
        if (appointmentID == null) {
            throw new MyExceptions("appointmentID cannot be null!");
        }
        // check for appointmentID length (must not exceed 10)
        if (appointmentID.length() > 10) {
            throw new MyExceptions("appointmentID length cannot exceed 10!");
        }
        // add appointmentID if successful
        else {
            this.appointmentID = appointmentID;
        }
    };

    public void setAppointmentDate(Date appointmentDate) throws MyExceptions {
        // check for appointmentDate value (must not be null)
        if (appointmentDate == null) {
            throw new MyExceptions("appointmentDate cannot be null!");
        }
        // check if appointment date is in the past
        Date currDate = new Date();

        if (appointmentDate.before(currDate)) {
            throw new MyExceptions("appointmentDate cannot be in the past!");
        }
        // add appointmentDate if successful
        else {
            this.appointmentDate = appointmentDate;
        }
    };

    public void setAppointmentDesc(String appointmentDesc) throws MyExceptions {
        // check for appointmentDesc value (must not be null)
        if (appointmentDesc == null) {
            throw new MyExceptions("appointmentDesc cannot be null!");
        }
        // check for appointmentDesc length (must not exceed 50)
        if (appointmentDesc.length() > 50) {
            throw new MyExceptions("appointmentDesc length cannot exceed 50!");
        }
        // add appointmentDesc if successful
        else {
            this.appointmentDesc = appointmentDesc;
        }
    };
}
