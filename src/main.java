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

        //Task 4
        System.out.println("Task 4");
        byte efficiencyMachine = 16/2; //Производительнсть машины в минуту
        System.out.println("Производительность машины - " + efficiencyMachine + " бутылок в минуту");
        byte timeEfficiency1 = 20; //20 минут
        short timeEfficiency2 = 24 * 60; //Минут в сутках
        int timeEfficiency3 = timeEfficiency2 * 3; //Минут в 3 сутках
        int timeEfficiency4 = timeEfficiency2 * 30; //Минут в месяце при 30 днях
        System.out.println("За 20 минут работы машина произвела бутылок " + efficiencyMachine * timeEfficiency1 + " штук" +
                "\n" + "За сутки работы машина произвела бутылок " + efficiencyMachine * timeEfficiency2 + " штук" +
                "\n" + "За 3 дня работы машина произвела бутылок " + efficiencyMachine * timeEfficiency3 + " штук" +
                "\n" + "За 1 месяц работы машина произвела бутылок " + efficiencyMachine * timeEfficiency4 + " штук");
        System.out.println();

        //Task 5
        System.out.println("Task 5");
        byte totalCan = 120;
        byte canWhitePaintFor1Class = 2;
        byte canBrownPaintFor1Class = 4;
        int totalClass = totalCan / (canWhitePaintFor1Class + canBrownPaintFor1Class);
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalClass * 2 + " банок белой краски и " + totalClass * 4 + " банок коричневой краски");
        System.out.println();

        //Task 6
        System.out.println("Task 6");
        short weightBanans = 5 * 80;
        short weightMilk = 2 * 105;
        short weightIcecream = 2 * 100;
        short weightEggs = 4 * 70;
        float totalWeight = weightBanans + weightMilk + weightIcecream + weightEggs;
        System.out.println("Вес спорт-завтрака " + totalWeight / 1000 + " кг.");
        System.out.println();

        //Task 7
        System.out.println("Task 7");
        short totalWeightLoss = 7 * 1000;
        short speedOfWeightLoss1 = 250;
        short speedOfWeightLoss2 = 500;
        System.out.println("Потребуется " + totalWeightLoss / speedOfWeightLoss1 + " дней чтобы сбросить 7 кг. по 250 гр. в сутки" +
                "\n" + "Потребуется " + totalWeightLoss / speedOfWeightLoss2 + " дней чтобы сбросить 7 кг. по 500 гр. в сутки" +
                "\n" + "В среднем потребуется " + (totalWeightLoss / speedOfWeightLoss1 + totalWeightLoss / speedOfWeightLoss2) / 2 + " день для похудения");
        System.out.println();
    }
}
