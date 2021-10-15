package Pratik12;
import java.util.Scanner;
public class BolunenSayilarinOrtalamasi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int k,average=0;
        System.out.print("Sayı Giriniz:");
        k =input.nextInt();

        for (int i=0; i<=k; i++){
            if (i%3==0 && i%4==0){
                average += i;}}

            System.out.println("Toplam: " + average);


}}
