public class Inherit_3 extends Abstract implements Interface_1, Interface_2 {
    protected Inherit_3(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(name + " Fly");
    }

    @Override
    public void sleep() {
        System.out.println(name + " Sleep");
    }


    @Override
    public void tolk() {
        System.out.println(name + " Tolk");
    }


    @Override
    public String getName() {
        return super.getName();
    }
}

