public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int a = 34567;
        byte b = 6;
        short c = 27890;
        long d = 987L;
        float e = 7.234f;
        double f = 8.34562d;
        System.out.println("Значение перемнной a с типом int равно " + a);
        System.out.println("Значение перемнной b с типом byte равно " + b);
        System.out.println("Значение перемнной c с типом short равно " + c);
        System.out.println("Значение перемнной d с типом long равно " + d);
        System.out.println("Значение перемнной e с типом float равно " + e);
        System.out.println("Значение перемнной f с типом double равно " + f);

        float appleWeight = 27.12f;
        long matches = 987678965549L;
        double bananasWeight = 2.786;
        short distance = 569;
        short x = -159;
        int y = 27897;
        byte age = 67;

        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        int totalStudents = class1 + class2 + class3;
        short totalPaper = 480;
        int oneStudent = totalPaper / totalStudents;
        System.out.println("На каждого ученика расчитано " + oneStudent + " листов бумаги");

        byte productivePerTwoMinute = 16;
        int productivePerOneMinute = productivePerTwoMinute / 2;
        int productivePerTwentyMinute = productivePerOneMinute * 20;
        System.out.println("За 20 минут машина произвела " + productivePerTwentyMinute + " штук бутылок");
        int minutsOneDay = 60 * 24;
        int productivePerOneDay = productivePerOneMinute * minutsOneDay;
        System.out.println("За одни сутки машина произвела " + productivePerOneDay + " штук бутылок");
        int productivePerThreeDays = productivePerOneDay * 3;
        System.out.println("За три дня машина произвела " + productivePerThreeDays + " штук бутылок");
        int productivePerOneMounts = productivePerOneDay * 30;
        System.out.println("За один месяц машина произвела " + productivePerOneMounts + " штук бутылок");

        byte totalCansOfPaint = 120;
        int whiteColorForClassroom = 2;
        int brownColorForClassroom = 4;
        int totalClassroom = 120 / (whiteColorForClassroom + brownColorForClassroom);
        int totalWhiteColorCans = totalClassroom * 2;
        int totalBrownColorCans = totalClassroom * 4;
        System.out.println("В школе, где " + totalClassroom + " классов, нужно " + totalWhiteColorCans + " банок белой краски и " + totalBrownColorCans + " банок коричневой краски.");

        int totalBananas = 5 * 80;
        int totalMilk = 2 * 105;
        int totalIceCream = 2 * 100;
        int totalEgg = 4 * 70;
        int sportBreakfastPerGr = totalBananas + totalMilk + totalIceCream + totalEgg;
        System.out.println("Спортинвый завтрак из " + sportBreakfastPerGr + " граммов.");
        int grPerKg = 1000;
        float sportBreakfastPerKg = sportBreakfastPerGr / (float) grPerKg;
        System.out.println("Спортивный завтрак из " + sportBreakfastPerKg + " килограмм.");

        int excessWeight1 = 7;
        int excessWeight2 = excessWeight1 * 1000;
        int totalDays1 = excessWeight2 / 250;
        System.out.println("Если каждый день спортсмен будет терять по 250 грамм, то на похудение уйдет " + totalDays1 + " дней.");
        int totalDays2 = excessWeight2 / 500;
        System.out.println("Если каждый день спортсмен будет терять по 500 грамм, то на похудение уйдет " + totalDays2 + " дней.");
        int totalDays3 = (totalDays1 + totalDays2) / 2;
        System.out.println("В среднем на похудение у спортсмена может уйти " + totalDays3 + " дней.");

        int salaryMary1 = 67760;
        float salaryMary2 = salaryMary1 * 0.10f + salaryMary1;
        float salaryMaryInYear = (salaryMary2 * 12) - (salaryMary1 * 12);
        System.out.println("Маша теперь получет " + salaryMary2 + " рублей. Годовой  доход вырос на " + salaryMaryInYear + " рублей.");
        int salaryDen1 = 83690;
        float salaryDen2 = salaryDen1 * 0.10f + salaryDen1;
        float salaryDenInYear = (salaryDen2 * 12) - (salaryDen1 * 12);
        System.out.println("Денис теперь получет " + salaryDen2 + " рублей. Годовой  доход вырос на " + salaryDenInYear + " рублей.");
        int salaryKris1 = 76230;
        float salaryKris2 = salaryKris1 * 0.10f + salaryKris1;
        float salaryKrisInYear = (salaryKris2 * 12) - (salaryKris1 * 12);
        System.out.println("Кристина теперь получет " + salaryKris2 + " рублей. Годовой  доход вырос на " + salaryKrisInYear + " рублей.");


    }
}