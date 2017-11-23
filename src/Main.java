import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Main {
/**
 *
 * @author Marius
 */


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,c,m;
        System.out.println("Introduceti valoarea seed-ului");
        Scanner in = new Scanner(System.in);

        int option;

        System.out.println("1.Middle Square ");
        System.out.println("2.LCG");
        System.out.println("3.Default");
        System.out.println("4.Evaluate");
        System.out.println("5.Distribution binomial");
        System.out.println("6.Distribution poisson");


        System.out.println("Your option is");
        option=in.nextInt();

        switch(option){
            case 1 :
                int seed = in.nextInt();
                MiddleSquare mid = new MiddleSquare(seed);
                for (int i = 0; i < 90; i++) {
                    double next = mid.Next();
                    System.out.println("MiddleSquare afiseaza" + next);
                }
                break;
            case 2 :
                System.out.println("Introduceti valoarea lui a pentru seed-ul LCG");
                int seed2=in.nextInt();
                System.out.println("Introduceti valoarea lui a=");
                a=in.nextInt();
                System.out.println("Introduceti valoarea lui c=");
                c=in.nextInt();
                System.out.println("Introduceti valoarea lui m=");
                m=in.nextInt();
                LCG lcg = new LCG(seed2,a,c,m);
                for (int i = 0; i < 90; i++) {
                    double nextlcg = lcg.Next();
                    System.out.println("LCG afiseaza" + nextlcg);
                }

                break;
            case 3 :
                Default def =new Default();

                for (int i = 0; i < 90; i++) {
                   double val= def.Next();
                    System.out.println("Default afiseaza" + val);
                }

                break;
            case 4:
                 System.out.println("Introduceti valoarea pentru seed-ul middle");
                 int seed3=in.nextInt();
                 MiddleSquare midd = new MiddleSquare(seed3);
                 Evaluator eval=new Evaluator(midd);
                 double ela2=eval.Eval();


                System.out.println("Introduceti valoarea lui a=");
                a=in.nextInt();
                System.out.println("Introduceti valoarea lui c=");
                c=in.nextInt();
                System.out.println("Introduceti valoarea lui m=");
                m=in.nextInt();

                System.out.println("Introduceti valoarea seed-ului pentru LCG");
                int seed4 = in.nextInt();
                LCG lcgg = new LCG(seed4,a,c,m);
                Evaluator eval1=new Evaluator(lcgg);
                double eval3=eval1.Eval();

                Default defa =new Default();
                Evaluator eval2=new Evaluator(defa);
                double evall=eval2.Eval();

                System.out.println("Evaluarea Middle Square"+ela2);
                System.out.println("Evaluarea LCG"+eval3);
                System.out.println("Evaluarea Default"+evall);

            break;
            case 5:

             //   int i;
                int interval1=0,interval2=0,interval3=0,interval4=0,interval5=0,interval6=0,interval7=0,interval8=0,interval9=0,interval10=0;
                System.out.println("Introduceti valoarea pentru seed-ul middle");
                int seed5=in.nextInt();

                MiddleSquare midde = new MiddleSquare(seed5);
                Default random1=new Default();
                BinomialDistribution bin = new BinomialDistribution(random1, 100, (float) 0.6);



                for(int i=0;i<100;i++) {
                      double nr= bin.Next();


                   if(nr>=0&&nr<0.1)
                   {
                       interval1++;
                   }
                   else if(nr>=0.1&&nr<0.2)
                   {
                       interval2++;
                   }
                   else if(nr>=0.2&&nr<0.3)
                   {
                       interval3++;
                   }
                   else if(nr>=0.3&&nr<0.4)
                   {
                       interval4++;
                   }
                   else if(nr>=0.4&&nr<0.5)
                   {
                       interval5++;
                   }
                   else if(nr>=0.5&&nr<0.6)
                   {
                       interval6++;
                   }
                   else if(nr>=0.6&&nr<0.7)
                   {
                       interval7++;
                   }
                   else if(nr>=0.7&&nr<0.8)
                   {
                       interval8++;
                   }
                   else if(nr>=0.8&&nr<0.9)
                   {
                       interval9++;
                   }
                   else if(nr>=0.9&&nr<1)
                   {
                       interval10++;
                   }
                }
                System.out.println("Numere in intervalu' 0 - 0.1 sunt "+interval1);
                System.out.println("Numere in intervalu' 0.1 - 0.2 sunt "+interval2);
                System.out.println("Numere in intervalu' 0.2 - 0.3 sunt "+interval3);
                System.out.println("Numere in intervalu' 0.3 - 0.4 sunt "+interval4);
                System.out.println("Numere in intervalu' 0.4 - 0.5 sunt "+interval5);
                System.out.println("Numere in intervalu' 0.5 - 0.6 sunt "+interval6);
                System.out.println("Numere in intervalu' 0.6 - 0.7 sunt "+interval7);
                System.out.println("Numere in intervalu' 0.7 - 0.8 sunt "+interval8);
                System.out.println("Numere in intervalu' 0.8 - 0.9 sunt "+interval9);
                System.out.println("Numere in intervalu' 0.9 - 1 sunt "+interval10);
                break;
            case 6:
                int interval11=0,interval22=0,interval33=0,interval44=0,interval55=0,interval66=0,interval77=0,interval88=0,interval99=0,interval100=0;
                System.out.println("Introduceti valoarea pentru seed-ul middle");
                int seed6=in.nextInt();
                MiddleSquare middle = new MiddleSquare(seed6);
                Default random=new Default();


               PoissonDistribution poissonDistribution = new PoissonDistribution(random, 100, 85);

                for(int i=0;i<100;i++) {
                    double nr= poissonDistribution.Next();


                    if(nr>=0&&nr<0.1)
                    {
                        interval11++;
                    }
                    else if(nr>=0.1&&nr<0.2)
                    {
                        interval22++;
                    }
                    else if(nr>=0.2&&nr<0.3)
                    {
                        interval33++;
                    }
                    else if(nr>=0.3&&nr<0.4)
                    {
                        interval44++;
                    }
                    else if(nr>=0.4&&nr<0.5)
                    {
                        interval55++;
                    }
                    else if(nr>=0.5&&nr<0.6)
                    {
                        interval66++;
                    }
                    else if(nr>=0.6&&nr<0.7)
                    {
                        interval77++;
                    }
                    else if(nr>=0.7&&nr<0.8)
                    {
                        interval88++;
                    }
                    else if(nr>=0.8&&nr<0.9)
                    {
                        interval99++;
                    }
                    else if(nr>=0.9&&nr<1)
                    {
                        interval100++;
                    }
                }
                System.out.println("Numere in intervalu' 0 - 0.1 sunt "+interval11);
                System.out.println("Numere in intervalu' 0.1 - 0.2 sunt "+interval22);
                System.out.println("Numere in intervalu' 0.2 - 0.3 sunt "+interval33);
                System.out.println("Numere in intervalu' 0.3 - 0.4 sunt "+interval44);
                System.out.println("Numere in intervalu' 0.4 - 0.5 sunt "+interval55);
                System.out.println("Numere in intervalu' 0.5 - 0.6 sunt "+interval66);
                System.out.println("Numere in intervalu' 0.6 - 0.7 sunt "+interval77);
                System.out.println("Numere in intervalu' 0.7 - 0.8 sunt "+interval88);
                System.out.println("Numere in intervalu' 0.8 - 0.9 sunt "+interval99);
                System.out.println("Numere in intervalu' 0.9 - 1 sunt "+interval100);
                break;
            default:System.out.println("your option is invalid") ;
                break;

        }

    }

}