import java.util.*;


public class MiddleSquare implements Generator {

    private int seed;
    private int counter;
    HashSet<Integer> set = new HashSet<Integer>();

    public MiddleSquare(int seed) {
        this.seed=seed;
         counter = (int) Counter(seed);

    }

    @Override
    public double Next() {



        int number = (seed * seed);
        System.out.println(number);

        System.out.println(counter);
        int square = (int) (Math.pow(10, counter));
        int square1=(int) (Math.pow(10,counter/2));
        System.out.println(square);

        number= number/square1;
        number=number % square;
        System.out.println(number);
        if (number == seed) {
            number = number + 1;
        }
        if(Counter(number)<counter)
        {

             number = number + (int) Math.pow(10,counter-1);

        }

        seed=number;

        while(set.contains(seed))
          {
            seed=seed+1;
//            System.out.println("Hash is here");
           }
        set.add(seed);


        System.out.println(seed);

        return (double) seed/square;
    }


    public double Counter(int seed) {
        int counter=0;
        int temp=seed;
        while (temp != 0) {
            temp /= 10;
            counter++;
        }
        return counter;
    }

}