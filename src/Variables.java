public class Variables {
    public static void main(String[] args) {

        // Task 4
        System.out.println("Task 4");
        double dog = 8;
        System.out.println(dog);
        double cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog +4;
        System.out.println(dog);
        cat = cat +4;
        System.out.println(cat);
        paper = paper +4;
        System.out.println(paper);

        dog = dog -3.5;
        System.out.println(dog);
        cat = cat -1.6;
        System.out.println(cat);
        paper = paper -7639;
        System.out.println(paper);

        // Task 6
        System.out.println("Task 6");
        var friend = 19;
        System.out.println(friend);
        friend = friend +2;
        System.out.println(friend);
        friend = friend /7;
        System.out.println(friend);

        var frog = 3.5;
        frog = frog *10;
        System.out.println(frog);
        frog = frog /3.5;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);

        // Task 8
        System.out.println("Task 8");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        System.out.println("Общий вес боксеров: " + (boxer2Weight + boxer1Weight));
        System.out.println("Разница весов 2х боксеров: (1 способ)" + (boxer2Weight - boxer1Weight));
        System.out.println("Разница весов 2х боксеров: (2 способ)" + (boxer2Weight % boxer1Weight));


        var workhoursCapacity = 640;
        var stuff1hours = 8;
        var stuffsCounter = workhoursCapacity / stuff1hours;
        System.out.println("Всего работников в компании " + stuffsCounter +" - человек");

        stuffsCounter = stuffsCounter +94;
        workhoursCapacity = stuffsCounter * stuff1hours;
        System.out.println("Если в компании работает " + stuffsCounter + " человек, то всего " + workhoursCapacity + " часов работы может быть поделено между сотрудниками");




    }
}