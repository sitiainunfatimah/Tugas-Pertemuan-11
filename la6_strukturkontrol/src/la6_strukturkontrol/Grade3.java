/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package la6_strukturkontrol;

/**
 *
 * @author User2
 */
public class Grade3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String names[] = {"Beah", "Biance", "Lance", "Belle",
            "Nico", "Yza", "Gent", "Ethan"};
        
        String searchName = "Yza";
        boolean foundName = false;
        
        for( int i=0; i< names.length; i++ ){
        if( names[i].equals( searchName )){
            foundName = true;
            break;
            
        }
        }
        if( foundName ){
            System.out.println( searchName + " found!" );
        }
        else{
            System.out.println( searchName + " not found." );
        }
    }
}
