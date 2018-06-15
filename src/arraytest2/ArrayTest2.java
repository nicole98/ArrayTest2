/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraytest2;
import java.util.*;
/**
 *
 * @author nitao5001
 */
public class ArrayTest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <String> niceChild = new ArrayList();
        
        Collections.addAll(niceChild, "Lisa", "Maggie", "Todd", "Rod", "Milhouse","Tom", "Jerry", "Bob", "billy", "Suzie", "Brittany", "Alyssa", "Brandy", "Andrew", "Tim", "Sam", "Sarah", "alex", "Molly", "Adam");
        System.out.println("Reverse Order\n**************\n");
        System.out.println(niceChild);

        for (int i = niceChild.size()-1; i >=0 ; i--)  {
              System.out.println(i + ": " + niceChild.get(i));
        }
        
        System.out.println("\n\nSorted Order\n************\n");
        Collections.sort(niceChild,String.CASE_INSENSITIVE_ORDER );

        System.out.println(niceChild);
        for (int j = 0; j < niceChild.size(); j++)  {
              System.out.println(j + ": " + niceChild.get(j));
        }
    }
    
    
}
