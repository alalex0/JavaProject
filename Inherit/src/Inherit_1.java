public class Inherit_1 extends Abstract implements Interface_1 {
    protected Inherit_1(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(name + " Fly");
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
