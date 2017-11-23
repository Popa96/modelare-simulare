public class PoissonDistribution
{
    private Generator g;
    private float lambda;
    private int n;
    private double l;

    public PoissonDistribution(Generator g,int n,float lambda)
    {
        this.g=g;
        this.lambda=lambda;
        this.n=n;
        this.l= 1/Math.pow(Math.E,this.lambda);
    }
    public double Next()
    {
        int k=0;
        double p=1;
        do
        {
            k=k+1;
            double u=g.Next();
            p = (p * u);

        }while((p > l) && (k < n));


        return (double) (k-1)/n;
    }

}
