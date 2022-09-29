// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04avst
{
    public static void main(String[] args)
    {
        System.out.println("Lab04a, Student Version\n");

        double principal  = 250000;
        double annualRate = 4.85;
        double numYears   = 30;
        double numMonths  = (numYears * 12);
        double monthlyRate  = (4.85/12);
        double monthlyPayment = ((monthlyRate * (Math.pow(monthlyRate + 1, numMonths)/(Math.pow(1 + monthlyRate, numMonths) - 1) * principal)));









        System.out.println("Principal:       $"+principal);
        System.out.println("Annual Rate:     "+annualRate +"%");
        System.out.println("Number of Years: "+numYears);

    }
}

