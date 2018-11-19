public class Runner {
    public static void main(String[] args)
    {
        FrogSimulation sim0 = new FrogSimulation(24,5);
        FrogSimulation sim1 = new FrogSimulation(24,5);
        FrogSimulation sim2 = new FrogSimulation(24,5);
        FrogSimulation sim3 = new FrogSimulation(24,5);
        FrogSimulation sim4 = new FrogSimulation(24,5);

        System.out.println("Frog 1 Success Rate: " + sim0.runSimulations(5));
        System.out.println("Frog 1 Success Rate: " + sim1.runSimulations(5));
        System.out.println("Frog 1 Success Rate: " + sim2.runSimulations(5));
        System.out.println("Frog 1 Success Rate: " + sim3.runSimulations(5));
        System.out.println("Frog 1 Success Rate: " + sim4.runSimulations(5));
    }
}
