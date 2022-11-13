public class main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        byte aA = 127;
        short bB = 32767;
        int cC = 2147483647;
        long dD = 9223372036854775807L;
        float eE = 2.5f;
        double fF = 3.4465465434654;
        System.out.println(aA + "\n" + bB + "\n" + cC + "\n" + dD + "\n" + eE + "\n" + fF);
        System.out.println();

        //Task 2
        System.out.println("Task 2");
        byte aA1 = 2;
        byte aA2 = 67;
        short bB1 = -159;
        short bB2 = 569;
        short bB3 = 786;
        short bB4 = 27897;
        long cC1 = 987678965549L;
        float dD1 = 27.12f;
        boolean eE1 = false;
        System.out.println(aA1 + "\n" + aA2 + "\n" + bB1 + "\n" + bB2 + "\n" + bB3 + "\n" + bB4 + "\n" + cC1 + "\n" + dD1 + "\n" + eE1);
        System.out.println();

        //Task 3
        System.out.println("Task 3");
        byte studentLPClass = 23;
        byte studentASClass = 27;
        byte studentEAClass = 30;
        short totalPaper = 480;
        System.out.println("На каждого ученика рассчитано " + totalPaper / (studentLPClass + studentASClass + studentEAClass) + " листов бумаги");
        System.out.println();
                    }
}
