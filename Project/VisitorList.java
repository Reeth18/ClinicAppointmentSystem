package DoctorClinic;

import java.util.ArrayList;

public class VisitorList {
    private ArrayList<Visitor> visitors;

    public VisitorList() {
        this.visitors = new ArrayList<>();
    }

    public ArrayList<Visitor> getVisitors() {
        return visitors;
    }

    public void setVisitors(ArrayList<Visitor> visitors) {
        this.visitors = visitors;
    }

    public void addVisitor(Visitor visitor) {
        visitors.add(visitor);
    }

    public void removeVisitor(Visitor visitor) {
        visitors.remove(visitor);
    }

}
