package ie.atu.week12;

public class EmployeeApp {
    public static void main(String[] args) {

        // Instance of the Employee class
        Employee person = new Employee();
        person.setName("Paulina");
        person.setIdNum("777");

        System.out.println("Details are: " + person.getReportDetails());

        ShiftWorker worker = new ShiftWorker();
        worker.setPayrollNum(200);
        worker.setShiftNum(1);
        worker.setHourly_pay_rate(14);

        System.out.println("Details: " + worker.getReportDetails());

        ShiftSupervisor supervisor = new ShiftSupervisor();
        supervisor.setSalary(1400);

    }
}
