import java.util.HashSet;
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


            default:System.out.println("your option is invalid") ;
                break;
        }

    }

}