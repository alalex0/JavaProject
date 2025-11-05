public abstract class Abstract {
    protected String name;

    protected Abstract(String name)
    {
        this.name=name;
    }

    abstract public void fly();

    public String getName() {
        return name;
    }
}
