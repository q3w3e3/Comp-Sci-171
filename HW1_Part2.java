/***************************************
* HW1_Part2.java
* Jack Woodrow
*
* This programme prints the domensions and volume of a given box.
***************************************/

public class HW1_Part2
{
    public static void main(String[] args)
    {
            //Four variables are initialized, double is used in case of decimal values for any of the dimensions. 
            Double length = 11d;
            Double height = 4d;
            Double width  = 8.5;
            String units  = "Inches";
        // The lines below print out some flavor text and the dimensions of box
        System.out.println("A box with a length of: " + length + units);
        System.out.println("a height of: " + height + units);
        System.out.println("and a width of: " + width + units);
        System.out.println();
        System.out.println("has a total volume of: " + length * width * height + units + " cubbed."); // this line also calculates the volume of the box, unlike previous lines which simple returned the variables defined earlier.
    }
}

