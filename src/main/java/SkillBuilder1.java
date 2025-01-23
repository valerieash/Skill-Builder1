import java.util.Scanner;

/**
 * Skill Builder 0
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {
    public static void main(String[] args) {
        int userInt;
        double userDouble;
        String userString;

        Scanner input = new Scanner(System.in);
        System.out.println("You're Jane's Friend!");
        System.out.println("What's your name?");
        userString = input.nextLine();
        //System.out.println(userString);

        System.out.println("Enter a floating-point number:");
        double spice = input.nextDouble();
        //System.out.println(spice);

        //mathematical expressions
        double spice2 = (4.0/3.0) * Math.pow(2,Math.sqrt(5)/Math.pow(spice,3));
        System.out.println("Well Jean Claude, the spice value resulted in " + spice2);

        //converting to integer
        //integer is outputting 1.5 and not 1.50
        double roundedDouble = Math.round(spice2 * 100.00) / 100.00;
        System.out.println("And the converted value is " + String.format("%.2f",roundedDouble));

        calcWallPaint();
        //^ get rid
    }
    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);


        // define our named constants
        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        double wallHeight = input.nextDouble();

        // Prompt user to input wall's width
        //.1
        System.out.println("Enter wall width (feet):");
        double wallWidth = input.nextDouble();
        double wallArea = (wallHeight * wallWidth);
        System.out.println("Wall area: " + wallArea + " square feet" );

        //.2 convert 180 into gallons
        //cylinder dimensions
        double paintNeeded = (wallArea / squareFeetPerGallons);
        System.out.printf("Paint needed: %.2f gallons\n",paintNeeded);

        int cansNeeded = (int) Math.ceil(paintNeeded);
        System.out.println("Cans needed: " + cansNeeded + "(s)");






        //System.out.println("Paint needed:" + gallons );




    }
}
