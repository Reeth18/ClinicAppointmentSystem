package DoctorClinic;

public class Appointment {
    private String visitorName;
    private String date;
    private String time;
    private String reason;

    public Appointment(String name1, String dateNew, String timeNew, String reasonNew) {
        this.visitorName = name1;
        this.date = dateNew;
        this.time = timeNew;
        this.reason = reasonNew;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

}