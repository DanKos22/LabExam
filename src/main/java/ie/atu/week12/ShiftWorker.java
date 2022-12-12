package ie.atu.week12;

public class ShiftWorker extends Employee {

    private int shiftNum;
    private int payrollNum;
    private double hourly_pay_rate;

    public ShiftWorker() {
    }

    public int getShiftNum() {
        return shiftNum;
    }

    public void setShiftNum(int shiftNum) {
        this.shiftNum = shiftNum;
    }

    public int getPayrollNum() {
        return payrollNum;
    }

    public void setPayrollNum(int payrollNum) {
        this.payrollNum = payrollNum;
    }

    public double getHourly_pay_rate() {
        return hourly_pay_rate;
    }

    public void setHourly_pay_rate(double hourly_pay_rate) {
        this.hourly_pay_rate = hourly_pay_rate;
    }

    @Override
    public String getReportDetails() {
        return "ShiftWorker{" + super.getReportDetails() +
                "shiftNum=" + shiftNum +
                ", payrollNum=" + payrollNum +
                ", hourly_pay_rate=" + hourly_pay_rate +
                '}';
    }


}
