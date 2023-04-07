package DoctorClinic;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class AppointmentSchedule {
    private String date;
    private ArrayList<Appointment> appointments;
    private List<String> timeSlots = Arrays.asList("9:00-10:00", "10:00-11:00", "11:00-12:00", "12:00-13:00",
            "14:00-15:00", "15:00-16:00", "16:00-17:00");

    public AppointmentSchedule(String dateNew) {
        this.date = dateNew;
        this.appointments = new ArrayList<>();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(ArrayList<Appointment> appointments) {
        this.appointments = appointments;
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public void removeAppointment(Appointment appointment) {
        appointments.remove(appointment);
    }

    public void displayAvailableTimeSlots() {
        for (String timeSlot : timeSlots) {
            if (!appointments.contains(timeSlot)) {
                System.out.println(timeSlot);
            }
        }
    }

    public void displayAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments scheduled.");
        } else {
            for (Appointment appointment : appointments) {
                System.out.println("Appointment Date: " + appointment.getDate());
                System.out.println("Appointment Time Slot: " + appointment.getTime());
                System.out.println("Visitor Name: " + appointment.getVisitorName());
                System.out.println("Reason for Visit: " + appointment.getReason());
                System.out.println();
            }
        }
    }

    public Appointment getAppointment(String date2, String timeSlot) {
        for (Appointment appointment : appointments) {
            if (appointment.getDate().equals(date) && appointment.getTime().equals(timeSlot)) {
                return appointment;
            }
        }
        return null;
    }

}
