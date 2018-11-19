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
            if(d > goalDistance)
            {
                return true;
            }
            else if (d < 0)
            {
                return false;
            }
        }
        if(d < goalDistance)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public double runSimulations(int num)
    {
        double yes = 0;
        for(int i = 0; i < num; i++)
        {
            simulate();
            if(simulate())
            {
                yes++;
            }
        }
        return (yes/num);
    }
}
