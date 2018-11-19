public class FrogSimulation {
    private int goalDistance;
    private int maxHops;

    public FrogSimulation(int dist, int numHops)
    {
        goalDistance = dist;
        maxHops = numHops;
    }

    private int hopDistance()
    {
        return (int)Math.floor(Math.random() * 21) - 5;
    }

    public boolean simulate()
    {
        int d = 0;
        for(int i = 0; i < maxHops; i++)
        {
            d+=hopDistance();
            System.out.print(" | " + d + " | ");
            if(d >= goalDistance)
            {
                System.out.print("Final Distance Reached | " + d + " | Success");
                System.out.println();
                return true;
            }
            else if (d < 0)
            {
                System.out.print("Final Distance Reached | " + d + " | Failure");
                System.out.println();
                return false;
            }
        }
        return false;
    }

    public double runSimulations(int num)
    {
        double yes = 0;
        for(int i = 0; i < num; i++)
        {
            if(simulate())
            {
                yes++;
            }
        }
        return (yes/num);
    }
}
