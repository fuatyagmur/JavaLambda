import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambdahfc2 {
    public static void main(String[] args) {

        List<Integer>hfc=new ArrayList<>(Arrays.asList(3,2,1,5,-3,2,6,8,-6,4,4,3,9,0,7));
        ciftKarePrint(hfc);
        System.out.println("\n   ***   ");
        tekKarePrint(hfc);
        System.out.println("\n   ***   ");
        tekKarePrint1(hfc);
        System.out.println("\n   ***   ");
        ciftKarePrint1(hfc);
        System.out.println("\n   ***   ");
        tekKupBirFazlaPrint(hfc);
        System.out.println("\n   ***   ");
        tekKupBirFazlaPrint1(hfc);
        System.out.println("\n   ***   ");
        ciftKareKok(hfc);
        System.out.println("\n   ***   ");
        maxEleman(hfc);
        System.out.println("\n   ***   ");
        ciftKareEnBuyuk(hfc);
        System.out.println("\n   ***   ");
        tekKareEnBuyuk(hfc);
        System.out.println("\n   ***   ");
        tumElToplam(hfc);
        System.out.println("\n   ***   ");
        ciftElCarpim(hfc);
        System.out.println("\n   ***   ");



    }

    public static void ciftKarePrint(List<Integer>hfc){
        hfc.stream().filter(Lambdahfc::ciftBul ).map(t->t*t).forEach(Lambdahfc::yazdir);
    }

    public static void tekKarePrint(List<Integer>hfc){
        hfc.stream().filter(t -> t % 2!=0).map(t->t*t).forEach(Lambdahfc::yazdir);
    }

    public static boolean tekBul(int a){
        return a%2!=0;
    }

    public static void  tekKarePrint1(List<Integer>hfc){
        hfc.stream().filter(Lambdahfc2::tekBul).map(t ->t*t).forEach(Lambdahfc::yazdir);
    }

    public static int kareBul(int a){
        return a*a;
    }

    public static void ciftKarePrint1(List<Integer>hfc){
        hfc.stream().filter(Lambdahfc::ciftBul).map(Lambdahfc2::kareBul).forEach(Lambdahfc::yazdir);
    }

    public static int kupBirfazlasi(int a){
        return (a*a*a)+1;
    }

    public static void yazdirr(int a){
        System.out.println(a+ " ");

    }

    public static void tekKupBirFazlaPrint(List<Integer>hfc){
        hfc.stream().filter(Lambdahfc2::tekBul).map(Lambdahfc2::kupBirfazlasi).forEach(Lambdahfc::yazdir);

    }

    public static void tekKupBirFazlaPrint1(List<Integer>hfc){
        hfc.stream().filter(t -> t%2==1).map(t ->(t*t*t)+1).forEach(System.out::print);
    }

    public static void ciftKareKok(List<Integer>hfc){
        hfc.stream().filter(Lambdahfc::ciftBul).map(Math::sqrt).forEach(t -> System.out.print(t+" "));

    }

    public static void maxEleman(List<Integer>hfc){
        Optional<Integer> maxSayi = hfc.stream().reduce(Math::max);
        System.out.println(maxSayi);
        System.out.println("Halukca"+ hfc.stream().reduce(Math::max));
    }

    public static void ciftKareEnBuyuk(List<Integer>hfc){
        Optional<Integer> ciftKare = hfc.stream().filter(Lambdahfc::ciftBul).map(Lambdahfc2::kareBul).reduce(Math::max);
        System.out.println(ciftKare);
        System.out.println("halukca:"+  hfc.stream().filter(Lambdahfc::ciftBul).map(Lambdahfc2::kareBul).reduce(Math::max) );
        System.out.println(hfc.stream().filter(Lambdahfc::ciftBul).map(Lambdahfc2::kareBul).reduce(Math::max));

    }
    public static void tekKareEnBuyuk(List<Integer>hfc){
        System.out.println(hfc.stream().filter(Lambdahfc2::tekBul).map(Lambdahfc2::kareBul).reduce(Math::max));
        System.out.println("Bu daha hizli ve specific bir class Integerdan dolayi: "+
                hfc.stream().
                filter(Lambdahfc2::tekBul).
                map(Lambdahfc2::kareBul).
                reduce(Integer::max));

    }
    public static void tumElToplam(List<Integer>hfc){
        System.out.println(hfc.stream().reduce(Integer::sum)); //method referans
        Optional<Integer> toplam = hfc.stream().reduce(Integer::sum); //method referans
        System.out.println(toplam);
        int toplam2=hfc.stream().reduce(0,(a,b)->a+b);   // lambda expression
        System.out.println(toplam2);

    }
    public static void ciftElCarpim(List<Integer>hfc){
        System.out.println(hfc.stream().filter(Lambdahfc::ciftBul).reduce(1, (a, b) -> a * b));
        Integer ciftElCarpma = hfc.stream().filter(Lambdahfc::ciftBul).reduce(1, (a, b) -> a * b);
        System.out.println(ciftElCarpma);
        System.out.println(hfc.stream().filter(Lambdahfc::ciftBul).reduce(Math::multiplyExact));  //method ref

    }




}
