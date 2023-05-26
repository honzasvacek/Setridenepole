public class Prvek {
    int hodnota;
    Prvek dalsiPrvek; //odkaz na další prvek

    public Prvek(int hodnota, Prvek dalsiPrvek) {
        this.hodnota = hodnota;
        this.dalsiPrvek = dalsiPrvek;
    }
}