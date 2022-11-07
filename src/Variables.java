public class Variables {
    public static void main(String[] args) {
        double dog = 8;
        System.out.println("dog = " +dog);
        double cat = 3.6;
        System.out.println("cat = " +cat);
        var paper = 763789;
        System.out.println("paper = " +paper);

        dog = dog +4;
        System.out.println("dog = " +dog);
        cat = cat +4;
        System.out.println("cat = " +cat);
        paper = paper +4;
        System.out.println("paper = " +paper);

        dog = dog -3.5;
        System.out.println("dog = " +dog);
        cat = cat -1.6;
        System.out.println("cat = " +cat);
        paper = paper -7639;
        System.out.println("paper = " +paper);

        var friend = 19;
        System.out.println("friend = " +friend);
        friend = friend +2;
        System.out.println("friend = " +friend);
        friend = friend /7;
        System.out.println("friend = " +friend);

        var frog = 3.5;
        frog = frog *10;
        System.out.println("frog = " +frog);
        frog = frog /3.5;
        System.out.println("frog = " +frog);
        frog = frog +4;
        System.out.println("frog = " +frog);

        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var boxersWeight = boxer1Weight + boxer2Weight;
        System.out.println("Общий вес боксеров " + boxersWeight);

        var differenceWeight = (boxer2Weight - boxer1Weight);
        System.out.println("Разница на " + differenceWeight +" кг!");


    }
}