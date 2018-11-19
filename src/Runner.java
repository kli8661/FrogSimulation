public class Runner {
    public static void main(String[] args)
    {
        FrogSimulation sim0 = new FrogSimulation(24,5);
        FrogSimulation sim1 = new FrogSimulation(24,5);
        FrogSimulation sim2 = new FrogSimulation(24,5);
        FrogSimulation sim3 = new FrogSimulation(24,5);
        FrogSimulation sim4 = new FrogSimulation(24,5);

        System.out.println("Welcome to frog simulation!");
        System.out.println();
        System.out.println();
        System.out.println("Frog 1 Success Rate: " + sim0.runSimulations(5));
        System.out.println();
        System.out.println();
        System.out.println("Frog 2 Success Rate: " + sim1.runSimulations(5));
        System.out.println();
        System.out.println();
        System.out.println("Frog 3 Success Rate: " + sim2.runSimulations(5));
        System.out.println();
        System.out.println();
        System.out.println("Frog 4 Success Rate: " + sim3.runSimulations(5));
        System.out.println();
        System.out.println();
        System.out.println("Frog 5 Success Rate: " + sim4.runSimulations(5));
    }
}
