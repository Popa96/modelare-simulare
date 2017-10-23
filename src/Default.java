import java.util.Random;
public class Default implements Generator {
    //private int seed;

    @Override
    public double Next() {

        double  seed=Math.random();


        return seed;
    }

}
