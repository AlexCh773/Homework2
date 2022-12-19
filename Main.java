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

    public static void task1() {
        System.out.println("task1");
        var dog = 8.0;
        var cat = 3.6;
        var papper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(papper);
    }

    public static void task2() {
        System.out.println();
        System.out.println("task2");
        var dog = 8.0;
        var cat = 3.6;
        var papper = 763789;
        dog -= 3.5;
        cat -= 1.6;
        papper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(papper);
    }

    public static void task3() {
        System.out.println();
        System.out.println("task3");
        var dog = 8.0;
        var cat = 3.6;
        var papper = 763789;
        dog -= 3.5;
        cat -= 1.6;
        papper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(papper);
    }
    public static void task4() {
        System.out.println();
        System.out.println("task4");
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
    }

    public static void task5() {
        System.out.println();
        System.out.println("task5");
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
    }

    public static void task6() {
        System.out.println();
        System.out.println("task6");
        var firstFighterWeight = 78.2;
        var secondFighterWeight = 82.7;
        var fightersWeightSum = firstFighterWeight + secondFighterWeight;
        System.out.println("суммарный вес боксеров: " + fightersWeightSum + " кг");
        var fightersWeightDifference = secondFighterWeight - firstFighterWeight;
        System.out.println("разница в весе боксеров: " + fightersWeightDifference + " кг");
    }

    public static void task7() {
        System.out.println();
        System.out.println("task7");
        var firstFighterWeight = 78.2;
        var secondFighterWeight = 82.7;
        var fightersWeightDifference1 = secondFighterWeight - firstFighterWeight;
        System.out.println("разница в весе боксеров(1): " + fightersWeightDifference1 + " кг");
        var fightersWeightDifference2 = secondFighterWeight % firstFighterWeight;
        System.out.println("разница в весе боксеров(2): " + fightersWeightDifference2 + " кг");
    }

    public static void task8() {
        System.out.println();
        System.out.println("task8");
        var timeSum = 640;
        var timePerWorker = 8;
        var workerCount = timeSum / timePerWorker;
        System.out.println("Всего работников в компании —  " + workerCount + " человек");

        workerCount += 94;
        timeSum = workerCount * timePerWorker;
        System.out.println("Если в компании работает " + workerCount + " человека, то всего " + timeSum + " часа работы может быть поделено между сотрудниками");
    }
}
