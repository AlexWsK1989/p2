//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Привет мир");
        System.out.println("Hello and welcome!");


        // System.out.println("i = " + 1);

        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog += 4;
        System.out.println(dog);
        cat += 4;
        System.out.println(cat);
        paper += 4;
        System.out.println(paper);
        dog -= 3.5;
        System.out.println(dog);
        cat -= 1.6;
        System.out.println(cat);
        paper -= 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var Totalweight = boxerWeight1 + boxerWeight2;
        System.out.println(Totalweight);
        var Weightdifference = boxerWeight1 - boxerWeight2;
        System.out.println(Weightdifference);
        var If = boxerWeight2 % boxerWeight1;
        System.out.println(If);

        var Totaltime = 640 / 8;
        System.out.println(Totaltime);
        var Everyemployee = 8;
        System.out.println(Everyemployee + "часов");
        var Totalemployees = 64;
        System.out.println(Totalemployees + "всего работников в компании");
        Totalemployees = 80 + 94;
        System.out.println(Totalemployees + "всего работников в компании");
        Totaltime = Totalemployees * Everyemployee;
        System.out.println(Totaltime + "всего часов работы может быть поделено между сотрудниками");

    }
}
