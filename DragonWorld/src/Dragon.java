public class Dragon {

    private String name;
    private String tooth;


    public Dragon(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getTooth() {
        return this.tooth;
    }

    public void fire(Dragon dragon) {

        System.out.println(dragon.getName() + " ударил " + this.name);
    }


}
