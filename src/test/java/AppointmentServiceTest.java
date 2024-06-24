import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Calendar;

public class AppointmentServiceTest {
    AppointmentService service = new AppointmentService();


    // test add appointments //
    @Test
    void testAddAppointment() throws MyExceptions {
        Calendar cal = Calendar.getInstance();
        cal.set(2026, 9, 8);

        Appointment appt = new Appointment("12345", cal.getTime(), "Meeting at 2PM");

        // test adding appointments
        Assertions.assertDoesNotThrow(()-> {
            service.addAppointment(appt);
        });
    }
    @Test
    void testAddAppointmentDuplicateID() throws MyExceptions {
        Calendar cal = Calendar.getInstance();
        cal.set(2026, 9, 8);

        Appointment appt = new Appointment("12345", cal.getTime(), "Meeting at 2PM");
        service.addAppointment(appt);
        Appointment appt2 = new Appointment("12345", cal.getTime(), "Meeting at 2PM");

        // test adding appointments with duplicate ID
        Assertions.assertThrows(MyExceptions.class, ()-> {
            service.addAppointment(appt2);
        });
    }


    // test delete appointments //
    @Test
    void testDeleteAppointment() throws MyExceptions {
        Calendar cal = Calendar.getInstance();
        cal.set(2026, 9, 8);

        Appointment appt = new Appointment("12345", cal.getTime(), "Meeting at 2PM");
        service.addAppointment(appt);

        // test deleting appointments
        Assertions.assertDoesNotThrow(()-> {
            service.deleteAppointment(appt);
        });
    }
    @Test
    void testDeleteAppointmentIDNotFound() throws MyExceptions {
        Appointment appt = new Appointment();

        // test deleting appointments with non-existent appointment
        Assertions.assertThrows(MyExceptions.class, ()-> {
            service.deleteAppointment(appt);
        });
    }
}
