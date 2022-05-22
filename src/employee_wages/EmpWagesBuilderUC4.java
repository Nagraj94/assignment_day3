package employee_wages;

public class EmpWagesBuilderUC4 {

    private static final int IS_FULL_TIME = 1;
    private static final int IS_PART_TIME = 2;
    private static final int EMP_RATE_PER_HOUR = 20;


    public static void main(String[] args) {

        int empHrs = 0;
        int empWages = 0;

        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empCheck){
            case IS_FULL_TIME:
                empHrs = 8;
                break;
            case IS_PART_TIME:
                empHrs = 4;
                break;
            default:
                empHrs = 0;
        }

        empWages = empHrs*EMP_RATE_PER_HOUR;
        System.out.println("Employee wages is: " + empWages);
    }
}
