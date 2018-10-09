/**
 * RectArea3 - Lab 2-2 - A program which prompts the user for a width and height and prints to the console a formatted area.
 *
 * @author Andrew Albanese
 * @version 2016-01-26
 */
import java.util.Scanner;
public class RectArea3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Enter width and height: ");
        int width = in.nextInt();
        int height = in.nextInt();
        
        int area = width * height;
        
        System.out.println("\narea = " + area);
    }
}