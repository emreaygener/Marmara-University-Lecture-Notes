public class Week7 {
    public static void main(String[] args) {
        Kus ucabilir = new Kus(30);
        IUcabilir kus = new Kus(30);
        System.out.println(kus.compareTo((int)ucabilir.Hiz));
        if (ucabilir instanceof IUcabilir) {
            ucabilir.uc();
        }
    }

}

interface IUcabilir extends Comparable<Integer> {
    void uc();
}

abstract class UcanHayvan implements IUcabilir {
}

class Kus extends UcanHayvan {
    public Kus() {
    }
    public Kus(int hiz) {
        this.Hiz = hiz;
    }
    public int Hiz;
    public void uc() {
        System.out.println("Kus uçuyor");
    }

    @Override
    public int compareTo(Integer hiz) {
            if(this.Hiz > hiz){
                return 1;
            }
            else if(this.Hiz == hiz){
                return 0;
            }
            return -1;
    }
}