package fullofinspiration.com.github.proxy;

public class Client {
    public static void main(String[] args) {
        Beauty wangjie = new Beauty("王婕");
        AllMethod zzp = new PersuitMan(wangjie);
        AllMethod proxy = new Proxy(zzp);
        proxy.giveChocolate();
        proxy.giveFlower();
    }

}
