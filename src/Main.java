public class Main
{
    public static void main(String[] args)
    {
        double springCost = 100.00;
        double summerCost = 150.00;
        double winterCost = 200.00;
        double autumnCost = 250.00;

        double totalCost = springCost + summerCost + winterCost + autumnCost;

        System.out.println("Spring maintenance cost is: $" + springCost);
        System.out.println("Summer maintenance cost is: $" + summerCost);
        System.out.println("Winter maintenance cost is: $" + winterCost);
        System.out.println("Autumn maintenance cost is: $" + autumnCost);
        System.out.println("Total yearly maintenance cost is: $" + totalCost);
    }
}