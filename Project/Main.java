package DoctorClinic;

public class Main {
    public static void main(String[] args) {
        Clinic clinic = new Clinic();
        int choice;
        do {
            choice = clinic.displayMenu();
            switch (choice) {
                case 1:
                    clinic.viewVisitorList();
                    break;

                case 2:
                    clinic.addNewVisitor();
                    break;

                case 3:
                    clinic.editVisitorDetails();
                    break;

                case 4:
                    clinic.viewAppointmentSchedule();
                    break;

                case 5:
                    clinic.bookAppointment();
                    break;

                case 6:
                    clinic.editOrCancelAppointment();
                    break;

                case 7:
                    System.out.println("Operations Successful......Exit");
                    break;

                default:
                    System.out.println("Invalid Choice");
                    continue;
            }
        } while (choice != 7);
    }
}
