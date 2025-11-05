public class Inherit_2 extends Abstract implements Interface_2 {

    protected Inherit_2(String name) {
        super(name);
    }

    @Override
    public void sleep() {
        System.out.println(name + " Sleep");
    }


    @Override
    public void fly() {
        System.out.println(name + " Fly");
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
