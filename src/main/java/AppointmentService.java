import java.util.HashMap;
import java.util.Map;

public class AppointmentService {
    // appointment hashmap //
    Map<String, Object> appointmentHashMap = new HashMap<>();

    //  methods //
    public void addAppointment(Appointment appointment) throws MyExceptions {

        // check for duplicate appointments
        if (appointmentHashMap.containsKey(appointment.getAppointmentID())) {
            throw new MyExceptions("Appointment must have unique ID!");
        }

        // if successful, add appointment to appointmentHashMap
        appointmentHashMap.put(appointment.getAppointmentID(), appointment);
    };

    public void deleteAppointment(Appointment appointment) throws MyExceptions {

        // check for appointmentID in appointmentHashMap
        if (appointmentHashMap.containsKey(appointment.getAppointmentID())) {
            // if found, delete appointment
            appointmentHashMap.remove(appointment.getAppointmentID());
        }
        // if not found, throw exception
        else {
            throw new MyExceptions("appointment not found!");
        }
    }
}
