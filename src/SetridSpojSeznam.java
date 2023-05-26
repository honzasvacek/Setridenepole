import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SetridSpojSeznam {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int hodnota = 0;

            try {
                hodnota = sc.nextInt();
            } catch (InputMismatchException err) {
                System.out.println(err);
            }

            Prvek tail = new Prvek(hodnota, null); //první hodnota je zároveň i tail = konec

            Prvek head = tail; //uložím si první prvek = head

            while(hodnota != 0) {
                try {
                    hodnota = sc.nextInt();
                } catch (InputMismatchException err) {
                    System.out.println(err);
                }

                Prvek novy = new Prvek(hodnota, null);
                Prvek predchozi = head;

                for (Prvek p = head; p != null; p = p.dalsiPrvek) {
                    if(novy.hodnota >= p.hodnota) {
                        p.dalsiPrvek = novy;
                        if(predchozi != head) {
                            predchozi.dalsiPrvek = p;
                        }
                        break;
                    }
                    predchozi = p;
                    System.out.println(predchozi.hodnota);
                }

            }


            /*while(head != null) {
                System.out.println(head.hodnota);
                head = head.dalsiPrvek;
            }*/
        }

    }
