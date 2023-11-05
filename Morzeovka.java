/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cz.itnetwork.morzeovka;
import java.util.Scanner;
/**
 *
 * @author Martin
 */
public class Morzeovka {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadejte zprávu pro zakódování:");
        String puvodniZprava = scanner.nextLine().toLowerCase();
        String zasifrovanaZprava = "";
        
        String abeceda = "abcdefghijklmnopqrstuvwxyz";
        String[] morseovyZnaky = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
            "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-",
            "...-", ".--", "-..-", "-.--", "--.."};
        
        for (int i = 0; i < puvodniZprava.length(); i++) {
            int pozice = abeceda.indexOf(puvodniZprava.charAt(i));
            if (pozice >= 0) {
                zasifrovanaZprava += morseovyZnaky[pozice] + " ";
        }
    }
        System.out.println("Zakódovaná zpráva:" + zasifrovanaZprava);
    }
}
