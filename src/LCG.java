
public class LCG implements Generator {
    int seed;
    int a;
    int m;
    int c;
    public LCG(int seed,int a,int c,int m){
        this.seed=seed;
        this.a=a;
        this.c=c;
        this.m=m;
    }
    @Override
    public double Next() {
        if (c == 0) {
            seed = seed / m;//congruentiala multiplicativa
        } else {
            seed = (a * seed + c) % m;//congruentiala mixta
        }

        return (double) seed / m;

    }
}
