import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Calendar;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppointmentTest {
    // for appointmentID //
    @Test
    void testAppointmentID() throws MyExceptions {
        Calendar cal = Calendar.getInstance();
        cal.set(2026, 9, 8);

        Appointment appt1 = new Appointment("12345", cal.getTime(), "Wisdom teeth removal");

        // check if appointmentID is right length
        assertTrue(appt1.getAppointmentID().length() < 11);
        // check if appointmentID is not null
        assertTrue(appt1.getAppointmentID() != null);
    }

    // positives:
    @Test
    void testAppointmentIDRightLength() throws MyExceptions {
        Calendar cal = Calendar.getInstance();
        cal.set(2026, 9, 8);

        Appointment appt2 = new Appointment("12345", cal.getTime(), "Take out the trash");

        // check if appointmentID is right length
        assertTrue(appt2.getAppointmentID().length() < 11);
    }
    @Test
    void testAppointmentIDNotNull() throws MyExceptions {
        Calendar cal = Calendar.getInstance();
        cal.set(2026, 9, 8);

        Appointment appt3 = new Appointment("011", cal.getTime(), "Take out the trash");

        // check if appointmentID is not null
        assertTrue(appt3.getAppointmentID() != null);
    }

    // negatives:
    @Test
    void testAppointmentIDNull() {
        Calendar cal = Calendar.getInstance();
        cal.set(2026, 9, 8);

        // check if appointmentID is null
        Assertions.assertThrows(MyExceptions.class, ()-> {
            new Appointment(null, cal.getTime(), "Take out the trash");
        });
    }
    @Test
    void testAppointmentIDTooLong() {
        Calendar cal = Calendar.getInstance();
        cal.set(2026, 9, 8);

        // check if appointmentID is not right length
        Assertions.assertThrows(MyExceptions.class, ()-> {
            new Appointment("1234567891011", cal.getTime(), "Take out the trash");
        });
    }


    // for appointmentDate //
    @Test
    void testAppointmentDate() throws MyExceptions {
        Date currDate = new Date();

        Calendar cal = Calendar.getInstance();
        cal.set(2026, 9, 8);

        Appointment appt1 = new Appointment("011", cal.getTime(), "Take out the trash");

        // check if appointmentDate is not in the past
        assertTrue(currDate.before(appt1.getAppointmentDate()));

        // check if appointmentDate is not null
        assertTrue(appt1.getAppointmentDate() != null);
    }

    // positives
    @Test
    void testAppointmentDateNotInThePast() throws MyExceptions {
        Date currDate = new Date();

        Calendar cal = Calendar.getInstance();
        cal.set(2026, 9, 8);

        Appointment appt1 = new Appointment("011", cal.getTime(), "Take out the trash");

        // check if appointmentDate is not in the past
        assertTrue(currDate.before(appt1.getAppointmentDate()));
    }
    @Test
    void testAppointmentDateNotNull() throws MyExceptions {
        Date currDate = new Date();

        Calendar cal = Calendar.getInstance();
        cal.set(2026, 9, 8);

        Appointment appt1 = new Appointment("011", cal.getTime(), "Take out the trash");

        // check if appointmentDate is not null
        assertTrue(appt1.getAppointmentDate() != null);
    }

    // negatives
    @Test
    void testAppointmentDateNull() {
        // check if appointmentDate is null
        Assertions.assertThrows(MyExceptions.class, ()-> {
            new Appointment("12345", null, "Take out the trash");
        });
    }
    @Test
    void testAppointmentDateInThePast() {
        Calendar cal = Calendar.getInstance();
        cal.set(2021, 9, 8);

        // check if appointmentDate is not right length
        Assertions.assertThrows(MyExceptions.class, ()-> {
            new Appointment(
                    "12345",
                    cal.getTime(),
                    "Take out the trash and buy  new weed wacker"
            );
        });
    }


    // for appointmentDesc //
    @Test
    void testAppointmentDesc() throws MyExceptions {
        Calendar cal = Calendar.getInstance();
        cal.set(2026, 9, 8);

        Appointment appt1 = new Appointment(
                "12345",
                cal.getTime(),
                "Take out the trash and buy new weed wacker"
        );

        // check if appointment desc is right length
        assertTrue(appt1.getAppointmentDesc().length() < 51);
        // check if appointment desc is not null
        assertTrue(appt1.getAppointmentDesc() != null);
    }

    // positives:
    @Test
    void testAppointmentDescRightLength() throws MyExceptions {
        Calendar cal = Calendar.getInstance();
        cal.set(2026, 9, 8);

        Appointment appt1 = new Appointment(
                "12345",
                cal.getTime(),
                "Take out the trash and buy new weed wacker"
        );

        // check if appointment desc is right length
        assertTrue(appt1.getAppointmentDesc().length() < 51);
    }
    @Test
    void testAppointmentDescNotNull() throws MyExceptions {
        Calendar cal = Calendar.getInstance();
        cal.set(2026, 9, 8);

        Appointment appt1 = new Appointment(
                "12345",
                cal.getTime(),
                "Take out the trash and buy new weed wacker"
        );

        // check if appointment desc is not null
        assertTrue(appt1.getAppointmentDesc() != null);
    }

    // negatives
    @Test
    void testAppointmentDescTooLong() {
        Calendar cal = Calendar.getInstance();
        cal.set(2026, 9, 8);

        // check if appointmentDesc is too long
        Assertions.assertThrows(MyExceptions.class, ()-> {
            new Appointment("12345",
                    cal.getTime(),
                    "Take out the trash. This is important. If you do not take out the trash, your house might smell. And if your house smells, it could attract bugs. And if bugs come, then nobody will want to visit.");
        });
    }
    @Test
    void testAppointmentDescNull() {
        Calendar cal = Calendar.getInstance();
        cal.set(2026, 9, 8);

        // check if appointmentDesc is null
        Assertions.assertThrows(MyExceptions.class, ()-> {
            new Appointment(
                    "011",
                    cal.getTime(),
                    null
            );
        });
    }
}
