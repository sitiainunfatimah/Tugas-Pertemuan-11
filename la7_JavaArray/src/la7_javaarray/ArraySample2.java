/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package la7_javaarray;

/**
 *
 * @author User2
 */
public class ArraySample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] ages = new int[100];
        
        for( int i=0; i<ages.length; i++ ){
            System.out.print( ages[i] );
        }
    }
}
