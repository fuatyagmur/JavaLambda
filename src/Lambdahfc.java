import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambdahfc {

    public static void main(String[] args) {

        List<Integer> hfcorder = new ArrayList<>(Arrays.asList(27, 31, 95, 86, 19, 1, 2, 3, 4, 5, 6, 7, 1, 2));
        printboslukluYazdirma(hfcorder);
        System.out.println(" \n ***   ");
        printboslukluYazdirma1(hfcorder);
        System.out.println(" \n ***   ");
        printboslukluYazdirma2(hfcorder);
        System.out.println(" \n ***   ");
        printciftElemanYazdirma(hfcorder);
        printnewMethod(hfcorder);
        System.out.println(" \n ***   ");
        printnewMethod1(hfcorder);
        System.out.println(" \n ***   ");
        printnewotzdnKucuk(hfcorder);
        System.out.println(" \n ***   ");
        printnewotuzdnBuyuk(hfcorder);
        System.out.println(" \n ***   ");
        printnewotuzdnBuyukVeyaCift(hfcorder);
        System.out.println(" \n ***   ");
        printnewdeneme(hfcorder);



    }




    public static void printboslukluYazdirma(List<Integer> hfcorder) {


        hfcorder.stream().forEach(t -> System.out.println(t + " "));


    }

    public static void printboslukluYazdirma1(List<Integer> hfcorder) {

        hfcorder.stream().forEach(System.out::print);


    }

    public static void yazdir(int a) {
        System.out.print(a + " ");
    }

    public static void printboslukluYazdirma2(List<Integer> hfcorder) {

        hfcorder.stream().forEach(Lambdahfc::yazdir);
    }

    public static void printciftElemanYazdirma(List<Integer> hfcorder) {
        hfcorder.stream().filter(t -> t % 2 == 0).forEach(Lambdahfc::yazdir);
    }

    public static void printnewMethod(List<Integer> hfcorder) {
        hfcorder.stream().forEach(Lambdahfc::yazdir);

    }

    public static boolean ciftBul(int a) {
        return a % 2 == 0;
    }

    public static void printnewMethod1(List<Integer> hfcorder) {
        hfcorder.stream().filter(Lambdahfc::ciftBul).forEach(Lambdahfc::yazdir);


    }
    public static void printnewotzdnKucuk(List<Integer> hfcorder) {

            hfcorder.stream().filter(t->t%2==0 && t<34).forEach(Lambdahfc::yazdir);
    }
    public static void printnewotuzdnBuyuk(List<Integer> hfcorder) {
        hfcorder.stream().filter(t->t%2==1 && t>34).forEach(Lambdahfc::yazdir);
    }
    public static void printnewotuzdnBuyukVeyaCift(List<Integer> hfcorder) {
    }
    private static void printnewdeneme(List<Integer>hfcorder) {
        hfcorder.stream().filter(t->t%2!=0 || t<15).forEach(Lambdahfc::yazdir);
    }



}

