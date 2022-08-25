public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1(){
        int i = 100000;
        byte b = 123;
        short s = 13412;
        long l = 123455454L;
        float f = 123.1f;
        System.out.println("Переменная типа int равна " + i +  " , типа byte равна "+ b +" , типа short равна "+s+" ," +
                " типа long равна " +l+" , типа float равна "+f);
    }
    public static void task2(){
        float f1 = 27.12f;
        long l = 987678965549L;
        byte b1 = 2;
        short s1 = 786;
        boolean bool = false;
        short  s2 = 569;
        short s3 = -159;
        int i = 27897;
        byte b2 = 67;
    }
    public static void task3() {
        byte ludPav = 23;
        byte annSerg = 27;
        byte ekAndr = 30;
        short totalPaper = 480;
        System.out.println("На каждого ученика рассчитано "+ totalPaper/(ludPav+annSerg+ekAndr)+ " листов бумаги");

    }
    public static void task4(){
        byte machinePerformance = 16;
        byte timeMachinePerformance = 2;
        int performancePerMin = machinePerformance/timeMachinePerformance;
        byte twentyMin = 20;
        System.out.println("За " +twentyMin+ " минут машина произвела бутылок "+performancePerMin*twentyMin+ " штук ");
        short twentyFourHours = 1;
        int twentyFourHoursInMin = twentyFourHours*60*24;
        System.out.println("За " +twentyFourHours+ " сутки машина произвела бутылок "+performancePerMin*twentyFourHoursInMin+ " штук ");
        byte treeDays = 3;
        int threeDaysInMin = treeDays*60*24;
        System.out.println("За " +treeDays+ " дня машина произвела бутылок "+performancePerMin*threeDaysInMin+ " штук ");
        byte oneMonth = 1;
        int onMonthInMin = oneMonth*30*60*24;
        System.out.println("За " +oneMonth+ " месяц машина произвела бутылок "+performancePerMin*onMonthInMin+ " штук ");
    }
    public static void task5(){
        byte totalQuant = 120;
        byte oneClassBrown = 4;
        byte oneClassWhite = 2;
        int totalClasses = totalQuant/(oneClassWhite+oneClassBrown);
        int totalBrown = oneClassBrown*totalClasses;
        int totalWhite = oneClassWhite*totalClasses;
        System.out.println("В школе, где "+totalClasses+" классов, нужно "+totalWhite+" банок белой краски и "+ totalBrown+" банок коричневой краски");

    }

    public static void task6() {
        byte babanWeight = 80;
        int totalBananasWeight = babanWeight*5;
        byte milkWeight = 105;
        int totalMilkWeight = 200/100 * milkWeight;
        short totalIceCreamWeight = 2*100;
        byte eggWeight = 70;
        int totalEggsWeight = eggWeight*4;
        float totalWeight = totalBananasWeight + totalMilkWeight + totalEggsWeight + totalIceCreamWeight;
        System.out.println("Общий вес коктейля в граммах "+ totalWeight+ " в килограммах: "+ (totalWeight/1000));

    }
    public static void task7(){
        byte summaryWeightLoss = 7;
        float maxDayLoss = 500/1000f;
        float minDayLoss = 250/1000f;
        int fastWeightLoss = (int)Math.ceil(summaryWeightLoss/maxDayLoss);
        int slowWeightLoss = (int)Math.ceil(summaryWeightLoss/minDayLoss);
        int averageWeightLoss = (int)Math.ceil((fastWeightLoss+slowWeightLoss)/2);

        System.out.println("В случае самой быстрой потери веса, спортсмен похудеет за "+ fastWeightLoss+" дней, в случае " +
                "медленной потери веса спортсмен похудеет за " + slowWeightLoss+ " дней, в среднем похудение займет " +
                averageWeightLoss+ " дней");


    }

    public static void task8(){
        int mashasIncome = 67760;
        int denisIncome = 83690;
        int christinasIncome = 76230;
        int increase = 10;
        double multiplier = increase/(100*1.0);
        double newMashasIncome =mashasIncome*multiplier + mashasIncome;
        double newDenisIncome = denisIncome*multiplier + denisIncome;
        double newchristinasIncome = christinasIncome*multiplier + christinasIncome;

        System.out.println("Маша теперь получает " +newMashasIncome + " рублей, годовой доход вырос на " +
                (newMashasIncome*12-mashasIncome*12)+" рублей");
        System.out.println("Денис теперь получает " +newDenisIncome + " рублей, годовой доход вырос на " +
                (newDenisIncome*12-denisIncome*12)+" рублей");
        System.out.println("Кристина теперь получает " +newchristinasIncome + " рублей, годовой доход вырос на " +
                (newchristinasIncome*12-christinasIncome*12)+" рублей 0 копеек");

    }
}