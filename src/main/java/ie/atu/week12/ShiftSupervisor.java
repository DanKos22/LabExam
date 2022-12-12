package ie.atu.week12;

public class ShiftSupervisor extends ShiftWorker {

    private double salary;

    public ShiftSupervisor() {
    }

    @Override
    public String getReportDetails() {
       return "ShiftSupervisor{" +
                "salary=" + salary +
                '}';
    }

}
