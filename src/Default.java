import java.util.Random;
public class Default implements Generator {
    //private int seed;

    @Override
    public double Next() {
        //Random rand=new Random();
       double  seed=Math.random();
        //int count=Counter(seed);
        return  seed;
    }
    public int Counter(int number)
    {
        int counter=0;
        while(number!=0)
        {
            number/=10;
            counter++;

        }
        return counter;
    }
}
