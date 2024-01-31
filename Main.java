import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] arrayi_doldur(int sayi) {
        Scanner scanner = new Scanner(System.in);
        int[] cikti = new int[sayi];

        for (int i = 0; i < sayi; i++){
            cikti[i] = scanner.nextInt();

        }
        return cikti;



    }
    public static void arrayi_bastir(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + (i+1) + ": " + array[i]);

        }


    }
    public static void array_sort(int [] array) { /* Arrays sınıfı defaultta mevcut. Bu sınıf içerisinde tanımlı
                                                      birçok farklı metod bulunmakta. Biz bu metodlardan sort olanı
                                                      çağıracağız ve array içerisindeki öğeleri sıralayacağız.*/
        Arrays.sort(array);  //Arrays sınıfını da tıpkı Scanner sınıfında yaptığımız gibi projeye tanıtmamız gerekiyor.
        System.out.println("********************");
        System.out.println("Array is being sorted..");
        System.out.println("********************");

        arrayi_bastir(array);



    }

    public static void main(String[] args) {
        //int[] a = arrayi_doldur(5);
        //arrayi_bastir(a);

        //array_sort(a);

        int[] a1 = {1,2,3,4,5,6}; //İçeriği aynı olan iki array referansı oluşturduk.
        int[] a2 = {1,2,3,4,5,6};

        /*if (a1 == a2) {
            System.out.println("Eşitler...");
        }
        else {
            System.out.println("Eşit değiller...");
        }

        /*Fakat çıktıda görmüş oldukki eşit değiller. Bunun sebebi ise, a1 ve a2 referansları bellekte farklı
            yerleri göstermekte. Fakat içeriğininin eşitliğini sorguladığımızda eşit olduklarını göreceğiz. Bunu da
            Arrays sınıfından equals metodu ile gerçekleştiriyoruz. ile */

        if(Arrays.equals(a1, a2)) { //Arraylerin içeriklerini kıyasladığımızda eşit olduklarını görmüş olduk.
            System.out.println("Eşitler...");
        }
        else {
            System.out.println("Eşit değiller...");
        }


    }

}
