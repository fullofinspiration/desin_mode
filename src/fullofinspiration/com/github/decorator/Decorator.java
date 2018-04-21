package fullofinspiration.com.github.decorator;

/**
 * 装饰模式，Person并不知道这个装饰类的存在，相当于Decorator对这个类进行了一个包裹（加入了一个
 * Person类），同时又继承了Person类，这样就可以对该接口已有的实现类进行修饰（但是过程我也不是很清楚）
 * 然后一些新增的功能
 */
public abstract class Decorator extends Person {
    @Override
    public void wearring() {
        if (person != null)
            person.wearring();
    }

    Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}

class Man1 extends Decorator {
    String s = "穿西服";

    @Override
    public void wearring() {
        super.wearring();
        System.out.println(s);
    }
}

class Man2 extends Decorator {
    String s = "穿皮鞋";

    @Override
    public void wearring() {
        super.wearring();
        System.out.println(s);
    }
}
