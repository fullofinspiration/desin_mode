package fullofinspiration.com.github.decorator;

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
