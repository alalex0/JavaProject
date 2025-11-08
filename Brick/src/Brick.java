public class Brick extends Hole {

    private int c;//ширина кирпича

    public Brick(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    public void TryPassBrick(Hole hole) {
        if (canPassThrough(hole)) {
            System.out.println("Кирпич пройдет");
        } else System.out.println("Кирпич не пройдет");
    }

    public boolean canPassThrough(Hole hole) {
        //комбинация 1
        if (hole.Check(super.getA(), super.getB())) {
            return true;
        }
        //комбинация 2
        if (hole.Check(super.getA(), this.c)) {
            return true;
        }
        //комбинация 3
        if (hole.Check(super.getB(), this.c)) {
            return true;
        }
        //комбинация 4
        if (hole.Check(super.getB(), super.getA())) {
            return true;
        }
        //комбинация 5
        if (hole.Check(this.c, super.getA())) {
            return true;
        }
        //комбинация 6
        if (hole.Check(this.c, super.getB())) {
            return true;
        }

        return false;
    }

    public String getBrick() {
        return "a= " + super.getA() + " b= " + super.getB() + " c= " + c;
    }

}
