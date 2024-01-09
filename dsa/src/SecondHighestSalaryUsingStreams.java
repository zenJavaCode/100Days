
/*TODO:- You have been given a list of Employess Salary, you need to find out the second highest salary from the list using streams*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SecondHighestSalaryUsingStreams {

    public static void main(String[] args) {
        List<Double> salaries = Arrays.asList(1000.0, 2500.0, 1500.0, 3000.0, 2000.0);

        Double secondHighestSalry = salaries.stream().distinct().sorted().skip(1).findFirst().orElseThrow(() -> new IllegalStateException("Not enough salary holder"));
        System.out.println("second highest salary is  :"+secondHighestSalry);
    }


}
