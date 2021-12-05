package lesson12.factory;

public class FactoryCookie {

    public Cookie getCookie(CookieType type)
    {
        Cookie returnCookie;
        switch (type)
        {
            case CHOCO:
                returnCookie = new ChocoCookie();
                break;
            case CHERRY:
                returnCookie = new CherryCookie();
                break;
            case PEACH:
                returnCookie = new PeachCookie();
                break;

            default:
                throw new IllegalArgumentException("Wrong cookie type: " + type);
        }
        return  returnCookie;
    }

}
