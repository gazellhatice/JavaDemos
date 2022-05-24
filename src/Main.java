// Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e
// tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int k = 0 , number;
        double sum = 0;


        System.out.println("Sayı Giriniz: ");
        number = inp.nextInt();


        for (int i=0 ; i<=number ; i++){
            if(i % 3 == 0 & i % 4 == 0 ){
                sum +=i;
                k++;
                System.out.println("Girdiğiniz sayıya kadar hem 3 hem 4'e tam bölünen sayıların ortalaması: " + sum / k);
            }
        }

    }
}
