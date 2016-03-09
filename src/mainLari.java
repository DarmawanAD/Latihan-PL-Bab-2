//Class     = lintasan, pelari
//Object    = pelari 123, lintasan
//Method    = v, showData, getK, getNama, seleksi
//Attribute = nama, nim, panjang, lebar, keliling, jarak, waktu
import java.util.Scanner;
public class mainLari {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);
        int jmlp, p, l, s, t, i, j, k, jmlp1 = 0;
        String nama, nim, temp, tulis[];
        System.out.println("##INPUT##");
        jmlp = in.nextInt();
        p = in.nextInt();
        l = in.nextInt();
        lintasan lintasan = new lintasan(p, l);
        pelari[] zzz = new pelari[jmlp];
        for (i = 0; i < jmlp; i++) {
            temp = in1.nextLine();
            tulis = temp.split(", ");
            zzz[i] = new pelari(tulis[1], tulis[0], Double.parseDouble(tulis[2]), Double.parseDouble(tulis[3]));
        }
        System.out.println("##OUTPUT##");
        for (j = 0; j < jmlp; j++) {
            zzz[j].showData(lintasan);
        }
        for (k = 1; k < jmlp; k++) {
            if (zzz[k].seleksi(zzz[k - 1])) {
                jmlp1 = k;
            }
        }
        System.out.println(zzz[jmlp1].getNama());
    }
}