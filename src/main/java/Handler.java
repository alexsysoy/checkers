import java.util.ArrayList;
import java.util.List;

public class Handler {
    public static List<IntPair> getIntPairs(int DIMENSION, int y) {

        List<IntPair> roads = new ArrayList<>();
        List<IntPair> temp = new ArrayList<>();

        roads.add(new IntPair(1, y));

        for (int i = 1; i < DIMENSION; i++){
            for (IntPair pair: roads){
                if (pair.x > 0 ) {
                    if (pair.y + 1 > 0 && pair.y + 1 <= DIMENSION) temp.add(new IntPair(pair.x + 1, pair.y + 1));
                    if (pair.y - 1 > 0 && pair.y - 1 <= DIMENSION) temp.add(new IntPair(pair.x + 1, pair.y - 1));
                }
            }
            roads.clear();
            roads.addAll(temp);
            temp.clear();
        }
        return roads;
    }
}
