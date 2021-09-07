package solution;

import textio.TextIO;

public class Main {
    public static void main (String[]args){
        StatCalc calc = new StatCalc();
        System.out.println("Welcome to this little stat calculator. " +
                "Simply put in a list of non-zero numbers you wish to have analyzed.");
        System.out.println("When you're done, type 0 to analyze the numbers.");
        while(true){
            double num = TextIO.getlnDouble();
            if((int)(num)==0){
                break;
            }else{
                calc.enter(num);
            }
        }
        System.out.println("The results are as follows:");
        System.out.println("The number of numbers entered was "+ calc.getCount()+".");
        System.out.println("The sum of numbers entered was "+ calc.getSum()+".");
        System.out.println("The mean of numbers entered was "+ calc.getMean()+".");
        System.out.println("The standard deviation of numbers entered was "+ calc.getStandardDeviation()+".");
        System.out.println("The max of numbers entered was "+ calc.getMax()+".");
        System.out.println("The min of numbers entered was "+ calc.getMin()+".");
    }
}
