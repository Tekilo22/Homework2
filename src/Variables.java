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


    }
}