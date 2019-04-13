package exercise;

public class Ex_1_11 {

    public static void main(String[] args) {
        int currentPopulation = 312032486;
        int noOfDaysInYear = 365;


        //get total number of seconds
        int totalSecondsInYear = 365 * 24 * 60 * 60;


        double birthInYear = totalSecondsInYear/7.0;

        double deathInYear = totalSecondsInYear/13.0;

        double immigrantsInYear = totalSecondsInYear/45.0;


        System.out.println("Current Population is ");
        System.out.printf("%d", currentPopulation);
        System.out.println();

        double afterFirstYear = birthInYear + immigrantsInYear - deathInYear + currentPopulation;
        System.out.println("Population after first year is ");
        System.out.printf("%f", afterFirstYear);
        System.out.println();

        double afterSecondYear = birthInYear + immigrantsInYear -deathInYear + afterFirstYear;
        System.out.println("Population after second year is ");
        System.out.printf("%f", afterSecondYear);
        System.out.println();

    }
}
