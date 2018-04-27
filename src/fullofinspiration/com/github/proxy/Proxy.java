package fullofinspiration.com.github.proxy;

public class Proxy implements AllMethod{
    @Override
    public void giveFlower() {
        allMethod.giveFlower();
    }

    @Override
    public void giveChocolate() {
        allMethod.giveChocolate();
    }

    private AllMethod allMethod;

    public Proxy(AllMethod allMethod) {
        this.allMethod = allMethod;
    }
}
