package com.company;

public class Main {

    public static void main(String[] args) {
	// Задача 1
        byte apple = 4;
        short pear = 5;
        int banana = 10;
        long cherry = 15;
        float cherryWeight = 1.5f;
        double bananaWeight = 3.2;
        boolean cherryWeightIsEnough = cherryWeight > 2;
        char bar = 35;

    // Задача 2
    double fighter1 = 78.2;
    double fighter2 = 82.7;
    double fightersTotalWeight = fighter1 + fighter2;
    double fightersWeightDifference = fighter2 - fighter1;
    System.out.println("Общий вес " + fightersTotalWeight);
    System.out.println("Разница в весе " + fightersWeightDifference);

    // Задача 3
        int banana1 = 80;
        int milk = 105;
        int icecream = 100;
        int egg = 70;
        int babana1TotalWeight = banana1 * 5;
        System.out.println(babana1TotalWeight + " грамм");
        int milkTotalWeight = milk * 2;
        System.out.println(milkTotalWeight + " грамм");
        int icecreamTotalWeight = icecream * 2;
        System.out.println(icecreamTotalWeight +" грамм");
        int eggTotalWeight = egg * 4;
        System.out.println(eggTotalWeight +" грамм");
        int totalWeightOfRecipe = babana1TotalWeight + milkTotalWeight + icecreamTotalWeight + eggTotalWeight;
        System.out.println("Общий вес рецепта " + totalWeightOfRecipe + " грамм");
        float totalWeightOfRecipeKilo = totalWeightOfRecipe / 1000f;
        System.out.println("Общий вес рецепта " + totalWeightOfRecipeKilo + " кг" );

    // Задача 4
        int lostWeightKg = 7;
        int lostWeightGr = lostWeightKg * 1000;
        System.out.println("Вес, который нужно сбросить " + lostWeightGr + "грамм");
        int dailyLoss1 = 250;
        int dailyLoss2 = 500;
        int weightLossRate1 = lostWeightGr / dailyLoss1;
        System.out.println(lostWeightGr / dailyLoss1 + " дней потребуется, чтобы сбросить 7 кг");
        int weightLossRate2 = lostWeightGr / dailyLoss2;
        System.out.println(lostWeightGr / dailyLoss2 + " дней потребуется, чтобы сбросить 7 кг");



    // Задача 5
        int mashaOldSalary = 67760;
        double mashaIncrease = 1.1;
        double mashaNewSalary = mashaOldSalary * mashaIncrease;
        System.out.println("Маша.Новая зарплата " + mashaOldSalary * mashaIncrease);
        int mashaOldAnnualSalary = mashaOldSalary *12;
        System.out.println("Маша.Старая зарплата за год " + mashaOldSalary * 12);
        int mashaNewSalary1 = 74536;
        int mashaNewAnnualSalary = mashaNewSalary1 * 12;
        System.out.println("Маша.Новая зарплата за год " + mashaNewSalary1 * 12);
        int mashaNewAnnualSalary1 = 894432;
        int mashaOldAnnualSalary1 = 813120;
        int mashaDifference = mashaNewAnnualSalary1 - mashaOldAnnualSalary1;
        System.out.println(mashaNewAnnualSalary1 - mashaOldAnnualSalary1);


        int denisOldSalary = 83690;
        double denisIncrease = 1.1;
        double denisNewSalary = denisOldSalary * denisIncrease;
        System.out.println("Денис.Новая зарплата " + denisOldSalary * denisIncrease);
        int denisOldAnnualSalary = denisOldSalary * 12;
        System.out.println("Денис.Старая заплата за год " + denisOldSalary * 12);
        double denisNewSalary1 = 92059.00000000001;
        double denisNewAnnualSalary = denisNewSalary1 * 12;
        System.out.println("Денис.Новая зарплата за год " + denisNewSalary1 * 12);
        double denisNewAnnualSalary1 = 1104708.0000000002;
        int denisOldAnnualSalary1 = 1004280;
        double denisDifference = denisNewAnnualSalary1 - denisOldAnnualSalary1;
        System.out.println(denisNewAnnualSalary1 - denisOldAnnualSalary1);

        int KrisOldSalary = 76230;
        double KrisIncrease = 1.1;
        double KristNewSalary = KrisOldSalary * KrisIncrease;
        System.out.println("Кристина.Новая зарплата " + KrisOldSalary * KrisIncrease);
        int KrisOldAnnualSalary = KrisOldSalary * 12;
        System.out.println("Кристина.Старая зарплата за год " + KrisOldSalary * 12);
        int KrisNewSalary1 = 83853;
        int KrisNewAnnualSalary = KrisNewSalary1 * 12;
        System.out.println("Кристина.Новая зарплата за год " + KrisNewSalary1 * 12);
        int KrisNewAnnualSalary1 = 1006236;
        int KrisOldAnnualSalary1 = 914760;
        int KrisDifference = KrisNewAnnualSalary1 - KrisOldAnnualSalary1;
        System.out.println(KrisNewAnnualSalary1 - KrisOldAnnualSalary1);









    }
}
