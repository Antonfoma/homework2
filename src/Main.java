public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double dog = 8.0;
        System.out.println(dog);
        double cat = 3.6;
        System.out.println(cat);
        double paper = 763789.0;
        System.out.println(paper);
        dog += 4.0;
        System.out.println(dog);
        cat += 4.0;
        System.out.println(cat);
        paper += 4.0;
        System.out.println(paper);
        dog -= 3.5;
        System.out.println(dog);
        --cat;
        System.out.println(cat);
        paper -= 7639.0;
        System.out.println(paper);
        double friends = 19.0;
        System.out.println(friends);
        friends *= 2.0;
        System.out.println(friends);
        friends /= 7.0;
        System.out.println(friends);
        double frog = 3.5;
        System.out.println(frog);
        frog *= 10.0;
        System.out.println(frog);
        frog = frog / 3.5 + 4.0;
        System.out.println(frog);
        double boxer1Weight = 78.2;
        double boxer2Weight = 82.7;
        double boxersWeight = boxer1Weight + boxer2Weight;
        System.out.println(boxersWeight);
        double differenceWeight = boxer1Weight - boxer2Weight;
        System.out.println(differenceWeight);
        differenceWeight = boxer2Weight - boxer1Weight;
        System.out.println(differenceWeight);
        differenceWeight = boxer2Weight % boxer1Weight;
        System.out.println(differenceWeight);
        int allHours = 640;
        int personalHours = 8;
        int allPersonal = allHours / personalHours;
        System.out.println("всего работников в компании" + allPersonal + "человек!");
        int addPersonal = allPersonal + 94;
        System.out.println(addPersonal);
        int allHours2 = allHours / addPersonal;
        System.out.println("если в компании работает" + addPersonal + "человек , то всего " + allHours2 + "часа работы можеть быть поделино между сотрудниками");

    }
}