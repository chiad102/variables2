public class Main {
    public static void main(String[] args) {
        byte b = 1;
        int i = 10000;
        float f = 1.01f;
        double d = 1.02;
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);

        float num1 = 27.12f;
        long num2 = 987678965549L;
        double num3 = 2.786;
        int num4 = 569;
        int num5 = -159;
        int num6 = 27897;
        byte num7 = 67;

        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        int paper = 480;
        System.out.println("На каждого ученика рассчитано " + (paper/(teacher1 + teacher2 + teacher3)) + " листов бумаги");

        int machineProductivity = (16 / 2) * 60; // производительность машины в час
        short minutes20 = (short) (machineProductivity / 3);
        short hours24 = (short) (machineProductivity * 24);
        int hours72 = machineProductivity * 72;
        int month = machineProductivity * hours24 * 30;
        System.out.println("За 20 минут машина произвела " + minutes20 + " бутылок");
        System.out.println("За сутки машина произвела " + hours24 + " бутылок");
        System.out.println("За 3 дня машина произвела " + hours72 + " бутылок");
        System.out.println("За 1 месяц машина произвела " + month + " бутылок");

        byte paints = 120;
        byte whiteColorPerRoom = 2;
        byte brownColorPerRoom = 4;
        int allRooms = paints / (whiteColorPerRoom + brownColorPerRoom);
        int whiteColors = allRooms * whiteColorPerRoom;
        int brownColors = allRooms * brownColorPerRoom;
        System.out.println("В школе, где " + allRooms + " классов, нужно " + whiteColors + " банок белой краски и " + brownColors + " банок коричневой краски.");

        byte bananasWeight = 80;
        byte milkWeight = 105;
        byte iceCream = 100;
        byte egg = 70;
        int recipe = (bananasWeight * 5) + (milkWeight * 2) + (iceCream * 2) + (egg * 4);
        float recipeWeightOnKg = recipe / 1000f;
        System.out.println(recipe);
        System.out.println(recipeWeightOnKg);

        short weightDiff = 7000;
        short losingWeight1 = 250;
        short losingWeight2 = 500;
        int result1 = weightDiff / losingWeight1;
        int result2 = weightDiff / losingWeight2;
        int result3 = (result1 + result2) / 2;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        int moneyMasha = 67760;
        int moneyDen = 83690;
        int moneyKris = 76230;
        float gradeMasha = moneyMasha + (moneyMasha * 0.1f);
        float gradeDen = moneyDen + (moneyDen * 0.1f);
        float gradeKris = moneyKris + (moneyKris * 0.1f);
        float profitMasha = (gradeMasha * 12) - (moneyMasha * 12);
        float profitDen = (gradeDen * 12) - (moneyDen * 12);
        float profitKris = (gradeKris * 12) - (moneyKris * 12);
        System.out.println("Маша теперь получает " + gradeMasha + " рублей. Годовой доход вырос на " + profitMasha + " рублей.");
        System.out.println("Денис теперь получает " + gradeDen + " рублей. Годовой доход вырос на " + profitDen + " рублей.");
        System.out.println("Кристина теперь получает " + gradeKris + " рублей. Годовой доход вырос на " + profitKris + " рублей.");


    }
}