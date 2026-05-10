public class Main {
    public static void main(String[] args) {

        Experiment exp = new Experiment();

        System.out.println("Small Graph:");
        Graph small = exp.createGraph(10);
        exp.runTraversals(small);

        System.out.println("\nMedium Graph:");
        Graph medium = exp.createGraph(30);
        exp.runTraversals(medium);

        System.out.println("\nLarge Graph:");
        Graph large = exp.createGraph(100);
        exp.runTraversals(large);
    }
}