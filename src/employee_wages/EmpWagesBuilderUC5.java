package employee_wages;

public class EmpWagesBuilderUC5 {


    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HRS = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;

    public static void main(String[] args) {

        int empHrs = 0;
        int empWages = 0;
        int totalEmpWages = 0;

            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck){
                case IS_FULL_TIME:
                    System.out.println("full timer");
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    System.out.println("part timer");
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;

            }
            empWages = empHrs * EMP_RATE_PER_HRS;
            totalEmpWages = empWages * NUM_OF_WORKING_DAYS;
            System.out.println("Employee wages per day: " + empWages);

        System.out.println("Monthly Employee wages: " + totalEmpWages);

    }
}
