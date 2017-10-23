public class MiddleSquare implements Generator {

    private int seed;

    public MiddleSquare(int seed) {
        this.seed=seed;
    }

    @Override
    public double Next() {
        int number = (seed * seed);
        System.out.println(number);
        int counter = (int) Counter();
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
        seed=number;

        System.out.println(seed);

        return (double) seed/square;
    }


    public double Counter() {
        int counter=0;
        int temp=seed;
        while (temp != 0) {
            temp /= 10;
            counter++;
        }
        return counter;
    }

}