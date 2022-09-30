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
        double numMonths  = numYears * 12;
        double monthlyRate  = annualRate / 1200;
        double numerator = monthlyRate * Math.pow(1 + monthlyRate, numMonths);
        double denominator = Math.pow(1 + monthlyRate, numMonths) - 1;
        double monthlyPayment = (numerator / denominator) * principal;
        double totalPayment = monthlyPayment * numMonths;
        double totalIntrest = totalPayment - principal;









        System.out.println("Principal:       $"+principal);
        System.out.println("Annual Rate:     "+annualRate +"%");
        System.out.println("Number of Years: "+numYears);
        System.out.println("Monthly Payment  $" + monthlyPayment);
        System.out.println("Total Payment:   $" + totalPayment);
        System.out.println("Total Intrest    $" + totalIntrest);

    }
}

