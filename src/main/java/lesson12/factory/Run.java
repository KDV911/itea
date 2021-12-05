package lesson12.factory;

import java.util.Random;

public class Run {

    public static void main(String[] args) {
        FactoryCookie factoryCookie = new FactoryCookie();

        Cookie cherryCookie = factoryCookie.getCookie(CookieType.CHERRY);
        Cookie chocoCookie = factoryCookie.getCookie(CookieType.CHOCO);
        Cookie peachCookie = factoryCookie.getCookie(CookieType.PEACH);


//        cherryCookie.eat();
//        chocoCookie.eat();
//        peachCookie.eat();

        eatRandomCookie(factoryCookie);


    }

    public static Cookie getRandomCookie(FactoryCookie factoryCookie)
    {
        Random random = new Random();
        CookieType type = CookieType.values()[random.nextInt(CookieType.values().length)];

        return  factoryCookie.getCookie(type);
    }

    public static void eatRandomCookie(FactoryCookie factoryCookie)
    {
        Cookie random = getRandomCookie(factoryCookie);
        random.eat();
    }
}
