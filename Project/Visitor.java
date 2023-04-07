package DoctorClinic;

public class Visitor {
    private String name;
    private int age;
    private String phone;
    private String emailId;

    public Visitor(String nameNew, int ageNew, String phNo, String email) {
        this.name = nameNew;
        this.age = ageNew;
        this.phone = phNo;
        this.emailId = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

}
