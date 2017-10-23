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
        int seed;
        int a,c,m;
        System.out.println("Introduceti valoarea seed-ului");
        Scanner in = new Scanner(System.in);
        seed = in.nextInt();
        int option;

        System.out.println("1.Middle Square ");
        System.out.println("2.LCG");
        System.out.println("3.Default");


        System.out.println("Your option is");
        option=in.nextInt();

        switch(option){
            case 1 :MiddleSquare mid = new MiddleSquare(seed);
                for (int i = 0; i < 9; i++) {
                    double next = mid.Next();
                    System.out.println("MiddleSquare afiseaza" + next);
                }
                break;
            case 2 :System.out.println("Introduceti valoarea lui a=");
                a=in.nextInt();
                System.out.println("Introduceti valoarea lui c=");
                c=in.nextInt();
                System.out.println("Introduceti valoarea lui m=");
                m=in.nextInt();
                LCG lcg = new LCG(seed,a,c,m);
                for (int i = 0; i < 9; i++) {
                    double nextlcg = lcg.Next();
                    System.out.println("LCG afiseaza" + nextlcg);
                }
                break;
            case 3 :
                Default def =new Default();

                for (int i = 0; i < 9; i++) {
                   double val= def.Next();
                    System.out.println("Default afiseaza" + val);
                }
                break;
            default:System.out.println("your option is invalid") ;
                break;
        }

    }

}