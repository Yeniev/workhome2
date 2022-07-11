public class Main {
    public static void main(String[] args) {
        // задание первое
        int cat = 9;
        byte fox = 6;
        short dog = 7;
        long car = 400l;
        double appleWeight = 5.5;
        float iceWeight = 1.5f;
        boolean catIsAdult = cat>2;
        char bar = 35;


        // задание второе
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightAllBoxers = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;
        System.out.println("Общий вес боксеров -" + weightAllBoxers);
        System.out.println("Разница в весе - " + weightDifference);

        //  задание третье

        int bananas = 5;
        int bananasWeight = 80;

        int milk = 200 / 100;
        int milkWeight = 105;

        int iceCream = 2;
        int iceCreamWeight = 100;

        int eggs = 4;
        int eggsWeight = 70;


        int total = (bananas * bananasWeight) + (milk * milkWeight) + (iceCream * iceCreamWeight) + (eggs * eggsWeight);
        int gramsInKg = 1000;
        double totalKgs = total / (gramsInKg * 1.0);
        System.out.println(totalKgs);


        //задание четвёртое

        int weight = 7;
        int gramInKg = 1000;
        int weightInGrams = weight * gramInKg;

        int minGramsPerDay = 250;
        int maxGramsPerDay = 500;

        int minDays = weightInGrams / maxGramsPerDay;
        int maxDays = weightInGrams / minGramsPerDay;

        double avgDays = (minDays + maxDays) / (2 * 1.0);


        System.out.println("Min: " + minDays);
        System.out.println("Max: " + maxDays);
        System.out.println("Avg: " + avgDays);

        //задание пятое

        int percent = 10;
        double multiplier = percent/ (100 * 1.0);

        int salaryMasha = 67_760;
        int salaryDenis = 83_690;
        int salaryKristina = 76_230;

        int mashaNewSalary = (int) (salaryMasha +(salaryMasha * multiplier) );
        int denisNewSalary = (int) (salaryDenis + (salaryDenis * multiplier));
        int kristinaNewSalary = (int) (salaryKristina + (salaryKristina * multiplier));

        int mashaDifference = (mashaNewSalary - salaryMasha) *12;
        int denisDifference = (denisNewSalary - salaryDenis) *12;
        int kristinaDifference = (kristinaNewSalary - salaryKristina) *12;

        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaDifference + " рублей");
        System.out.println("Динис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisDifference + " рублей");
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + kristinaDifference + " рублей");


    }
}