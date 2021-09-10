public class IntPair {
    int x;
    int y;

    IntPair(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Клетка {" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}