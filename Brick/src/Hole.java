public class Hole {
    private int a;//длина кирпича/длина отверстия
    private int b;//высота кирпича/высота отверстия

    public Hole(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String getHole() {
        return "a= " + a + " b= " + b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public boolean Check(int l, int h) {
        System.out.println("l=" + l + "h=" + h);
        System.out.println("a=" + a + "b=" + b);
        return (a >= l && b >= h) || (b >= l && a >= h);
    }

}
