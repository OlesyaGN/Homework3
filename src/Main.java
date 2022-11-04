public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println(" Задача 1. ");
        int x = 5;
        System.out.println(" Значение переменной x с типом int равно " + x);
        byte v = 3;
        System.out.println(" Значение переменной v с типом byte равно " + v);
        short b = 6;
        System.out.println(" Значение переменной b с типом short равно " + b);
        long n = 8_200L;
        System.out.println(" Значение переменной n с типом long равно " + n);
        float k = 2.567F;
        System.out.println(" Значение переменной k с типом float равно " + k);
        double m = 1.564;
        System.out.println(" Значение переменной m с типом double равно " + m);

        // Задача 2
        System.out.println(" Задача 2. ");
        float j = 27.12F;
        long r = 987_678_965_549L;
        double o = 2.786;
        boolean q = false;
        char t = 569;
        short y = -159;
        int e = 27897;
        byte z = 67;

        // Задача 3
        System.out.println(" Задача 3. ");
        int studentFirstClass = 23;
        int studentSecondClass= 27;
        int studentThirdClass = 30;
        int totalSheets = 480;
        int sheetsOne = ( totalSheets /(studentFirstClass + studentSecondClass + studentThirdClass));
        System.out.println(" На каждого ученика рассчитано " + sheetsOne + " листов бумаги. ");

        // Задача 4
        System.out.println(" Задача 4. ");
        int bottles = 16;
        int minutes = 2;
        int efficiencyOneMinute = bottles/minutes;
        int twentyMinutes = 20;
        System.out.println( " За "+ twentyMinutes + " минут машина произвела бутылок " + efficiencyOneMinute * twentyMinutes + " штук. ");
        int oneDay = 24 * 60;
        System.out.println( " За "+ oneDay + " минут машина произвела бутылок " + efficiencyOneMinute * oneDay + " штук. ");
        int threeDay = oneDay * 3;
        System.out.println( " За "+ threeDay + " минут машина произвела бутылок " + efficiencyOneMinute * threeDay + " штук. ");
        int month = oneDay * 30;
        System.out.println( " За "+ month + " минут машина произвела бутылок " + efficiencyOneMinute * month + " штук. ");
        // Задача 5
        System.out.println(" Задача 5. ");
        int totalPaint = 120;
        int whitePaintOneClass = 2;
        int brownPaintOneClass = 4;
        int totalClass = totalPaint / (whitePaintOneClass+ brownPaintOneClass);

        System.out.println( " В школе, где " + totalClass + " классов, нужно " + totalClass * whitePaintOneClass + " банок белой краски и " + totalClass * brownPaintOneClass + " банок коричневой краски. " );

        //Задача 6
        System.out.println( "Задача 6. " );
        double weightBananas = 80.0 * 5;
        double weightMilk = 105.0 * 2;
        double weightIceCream = 100.0 * 2;
        double weightEgges = 70.0 * 4;
        double weightBreakfastGram = weightBananas + weightMilk + weightIceCream + weightEgges;
        System.out.println(" Общий вес завтрака " + weightBreakfastGram / 1000.0 + " кг. ");
        // Задача 7
        System.out.println(" Задача 7. ");
        int needLoseWeightGram = 7 * 1000;
        int weightMin = 250;
        int weightMax = 500;
        int daysLoseWeight1 = needLoseWeightGram / weightMin;
        System.out.println(" Дней " + daysLoseWeight1 + " на похудение ,если спортсмен будет терять по 250 грамм в день . ");
        int daysLoseWeight2 = needLoseWeightGram / weightMax;
        System.out.println(" Дней " + daysLoseWeight2 + " на похудение ,если спортсмен будет терять по 500 грамм в день . ");
        int daysAverage = (daysLoseWeight1 + daysLoseWeight2) / 2;
        System.out.println(" В среднем на похудение " + daysAverage + " день. ");
        // Задача 8.
        System.out.println(" Задача 8. ");
        int salaryMasha = 67600;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int salaryIncreaseMasha = salaryMasha * 10 / 100 + salaryMasha;
        int salaryIncreaseDenis = salaryDenis * 10 / 100 + salaryDenis;
        int salaryIncreaseKristina = salaryKristina * 10 / 100 + salaryKristina;
        System.out.println(" Маша теперь получает " + salaryIncreaseMasha +  " рублей. Годовой доход вырос на "+ salaryMasha * 10 /100 + " рублей ." );
        System.out.println(" Денис теперь получает " + salaryIncreaseDenis +  " рублей. Годовой доход вырос на "+ salaryDenis * 10 /100 + " рублей ." );
        System.out.println(" Кристина теперь получает " + salaryIncreaseKristina +  " рублей. Годовой доход вырос на "+ salaryKristina * 10 /100 + " рублей ." );























    }
}