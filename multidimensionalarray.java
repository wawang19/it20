/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multidimensionalarray;

/**
 *
 * @author kentr
 */
public class MultidimensionalArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] years = {
            
            {2004,2005,2006},
            {2007,2008,2009},
            {2010,2011,2012}
        };
        
         for (int i = 0; i < years.length; i++) {
             for (int j = 0; j < years[i].length; j++){
                 System.out.println(years[i][j] + " ");
         
             System.out.println();
             }
               
         }
    
    }
}
