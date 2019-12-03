/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package la6_strukturkontrol;

/**
 *
 * @author User2
 */
public class Grade6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OuterLoop:
        for( int j=0; j<5; j++ ){
            System.out.println("Inside for(j) loop"); //message1
            if( j == 2 )    continue OuterLoop;
        }
        
        System.out.println("Inside for(i) loop"); //message2
    }
}
