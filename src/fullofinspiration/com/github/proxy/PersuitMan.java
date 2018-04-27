package fullofinspiration.com.github.proxy;

public class PersuitMan implements AllMethod {
    public PersuitMan(Beauty beauty) {
        this.beauty = beauty;
    }

    Beauty beauty;

    @Override
    public void giveFlower() {
        System.out.println(beauty.getName() + "给你花");
    }

    @Override
    public void giveChocolate() {
        System.out.println(beauty.getName() + "给你巧克力");
    }
}
