/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package la6_strukturkontrol;

/**
 *
 * @author User2
 */
public class Grade2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int grade = 92;
        
        switch(grade){
        case 100:
                System.out.println( "Excellent!" );
                break;
        case 90:
                System.out.println("Good job!");
        case 80:
                System.out.println("Study harder!");
                break;
        default:
                System.out.println("Sorry, you failed.");
        }
    }
}
