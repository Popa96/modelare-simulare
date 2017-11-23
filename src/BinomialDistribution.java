public class BinomialDistribution
{
    private Generator g;
    private int n;
    private float p;

    public BinomialDistribution(Generator g,int n,float p)
    {
        this.g=g;
        this.n=n;
        this.p=p;
    }
    public double Next()
    {
        int x=0;

        for(int i=0;i<=n-1;i++)
        {
            double u=g.Next();
            if(u<p)
            {
                x++;
            }
        }
        return (double) x/(n-1);
    }
}
