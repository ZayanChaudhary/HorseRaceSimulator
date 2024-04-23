class Main {
    public static void main(String[] args) {
        Horse eq = new Horse('\u265E', "Storm", 0.0);

        System.out.println(eq.getName());
        System.out.println(eq.getSymbol());
        System.out.println(eq.getConfidence());

        System.out.println(eq.hasFallen());

        Race rc = new Race(10);

        Horse alpha = new Horse('♕', "Alpha", 1.0);
        Horse beta = new Horse('♔', "Beta", 0.5);
        Horse gamma = new Horse('♞', "Gamma", 1.5);

        rc.addHorse(alpha, 1);
        rc.addHorse(beta, 2);
        rc.addHorse(gamma, 3);

        rc.startRace();

    }
}