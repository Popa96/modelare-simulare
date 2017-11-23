public class Evaluator
{
    private Generator g;
    private int nrPoints;
    public Evaluator(Generator g)
     {
        this.g=g;
        this.nrPoints=10000;

     }
    public double Eval()
     {
         int circleCounter=0;
         for(int i=0;i<=nrPoints;i++)
         {

             Point p=new Point(g.Next(),g.Next());
             if (p.IsInCircle())
             {
                 circleCounter++;
             }
         }

        return (double) (Math.PI - (double)circleCounter / 2500);
     }
    
}

