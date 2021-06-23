import java.util.Scanner;

public class VucutKitleIndHesap {

    public static void main(String[] args) {


        float boy , kilo;

        Scanner scan = new Scanner(System.in);

        System.out.println("Boyunuzu giriniz(metre cinsinde) : ");

        boy = scan.nextFloat();

        System.out.println("Kilonuzu giriniz : ");

        kilo = scan.nextFloat();

        float ind =  kilo/(boy*boy);

        System.out.println("Vücut Kitle Index : " +ind);



    }
}
