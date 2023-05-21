/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tadeapps.Dao;

/**
 *
 * @author ranaufal
 */
import java.util.Random;   

public class DKodeAcak {
    Random random = new Random();

    public String ProsesAcak(){
        String finalkarakter = "";
        int jumlahhuruf = 20;
        
        for(int i=0; i<jumlahhuruf;i++){
            int acakan = random.nextInt(30);
            if(acakan % 2 == 1){
                char digit =  DKodeAcak.buatKarakterDigitAcak();
                finalkarakter = finalkarakter+digit;
            }else{
                char karakter =  DKodeAcak.buatKarakterHurufBesarAcak();
                finalkarakter = finalkarakter+karakter;

            }
        }
        return finalkarakter;
    }
    
    public static char buatKarakterAcak(char karakter1,char karakter2){
        return (char) (karakter1 + Math.random() * (karakter2 - karakter1 + 1));
    }
    
    public static char buatKarakterHurufBesarAcak(){
        return buatKarakterAcak('A','Z');
    }
    public static char buatKarakterDigitAcak(){
        return buatKarakterAcak('0','9');
    }

}