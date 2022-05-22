package employee_wages;

public class EmpWagesBuilderUC2 {

    public static void main(String[] args) {

        int IS_FULL_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;

        int empHrs = 0;
        int empWages = 0;

        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME)
            empHrs = 8;
        else
            empHrs = 0;

        empWages = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Employee wages is: " + empWages);

    }
}
