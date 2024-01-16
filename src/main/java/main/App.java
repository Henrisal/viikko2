//Did together with Aapo Halme and GPT was used for talk.isempty()
package main;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {   
        Hedgehog newHedgehog = new Hedgehog();;
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        while(!exit) {
            
            System.out.println("1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma");
            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

            
            switch(i) {
                case 1:
                System.out.println("Mitä siili sanoo:");
                String talk = sc.nextLine();
                if(talk.isEmpty()){
                    newHedgehog.Empty();
                } else {
                    newHedgehog.Speak(talk);
                }
                break;

                case 2:
                System.out.println("Anna siilin nimi:");
                String name = sc.nextLine();
                System.out.println("Anna siilin ikä:");
                String agestring = sc.nextLine();
                int age = Integer.parseInt(agestring);

                newHedgehog = new Hedgehog(name, age);
                break;

                case 3:
                System.out.println("Kuinka monta kierrosta?");
                String roundstring = sc.nextLine();
                int round = Integer.parseInt(roundstring);
                newHedgehog.Run(round);
                break;
                
                case 0:
                System.out.println("Kiitos ohjelman käytöstä.");
                exit = true;
                break;
                default:
                System.out.println("Syöte oli väärä");
                break;

            }
        }
    }
    sc.close();
    }
}