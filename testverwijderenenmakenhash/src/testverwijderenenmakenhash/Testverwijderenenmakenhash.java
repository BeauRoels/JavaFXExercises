/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testverwijderenenmakenhash;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Gamer
 */
public class Testverwijderenenmakenhash {

    private static HashMap<Integer, Integer> hmapStenen = new HashMap<Integer, Integer>();
    private static int steen;
    private static ArrayList<Integer> bijgehoudenStenen;
    private static int aantalVanStenen;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        genereerRandomSteen();
        vulDobbelstenen();
            Set setDobbel = hmapStenen.entrySet();//set initiliseren
            Iterator iteratorDobbel = setDobbel.iterator();//loper instellen
            while (iteratorDobbel.hasNext())//zolang er nog items zijn doorlopen
            {
                Map.Entry mentryDobbel = (Map.Entry) iteratorDobbel.next();//plaats
                System.out.print("Dobbesteen nummer: " + mentryDobbel.getKey() + "  -  Dobbelsteen Symbool: ");
                System.out.println(mentryDobbel.getValue());
            }
        
    }
    
   

   

    public static int genereerRandomSteen() {
        SecureRandom random = new SecureRandom();
        setSteen(random.nextInt(6) + 1);
        return getSteen();
    }

    public static void vulDobbelstenen() {
        
        
        
        
        getHmapStenen().put(1, genereerRandomSteen());
        getHmapStenen().put(2, genereerRandomSteen());
        getHmapStenen().put(3, genereerRandomSteen());
        getHmapStenen().put(4, genereerRandomSteen());
        getHmapStenen().put(5, genereerRandomSteen());
        getHmapStenen().put(6, genereerRandomSteen());
        getHmapStenen().put(7, genereerRandomSteen());
        getHmapStenen().put(8, genereerRandomSteen());
    }

    public static void KeuzeUitVorigeWorpVerwijderen(int keuzeDobbelSteen) {
        if (getHmapStenen().containsValue(keuzeDobbelSteen)) {
            for (int i = 1; i <= 8; i++) {
                
                if ( getHmapStenen().get(i)==keuzeDobbelSteen) {
                   getHmapStenen().remove(i);
                    setAantalVanStenen(getAantalVanStenen() + 1);
                }
            }
        }
    }

    /**
     * @return the hmapStenen
     */
    public static HashMap<Integer, Integer> getHmapStenen() {
        return hmapStenen;
    }

    /**
     * @param hmapStenen the hmapStenen to set
     */
    public static  void setHmapStenen(HashMap<Integer, Integer> hmapStenen) {
        Testverwijderenenmakenhash.hmapStenen = hmapStenen;
    }

    /**
     * @return the steen
     */
    public static int getSteen() {
        return steen;
    }

    /**
     * @param steen the steen to set
     */
    public static  void setSteen(int steen) {
        Testverwijderenenmakenhash.steen = steen;
    }

    /**
     * @return the bijgehoudenStenen
     */
    public static ArrayList<Integer> getBijgehoudenStenen() {
        return bijgehoudenStenen;
    }

    /**
     * @param bijgehoudenStenen the bijgehoudenStenen to set
     */
    public static void setBijgehoudenStenen(ArrayList<Integer> bijgehoudenStenen) {
        Testverwijderenenmakenhash.bijgehoudenStenen = bijgehoudenStenen;
    }

    /**
     * @return the aantalVanStenen
     */
    public static int getAantalVanStenen() {
        return aantalVanStenen;
    }

    /**
     * @param aantalVanStenen the aantalVanStenen to set
     */
    public static void setAantalVanStenen(int aantalVanStenen) {
        Testverwijderenenmakenhash.aantalVanStenen = aantalVanStenen;
    }
    
}
