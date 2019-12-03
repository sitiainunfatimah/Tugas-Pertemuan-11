/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User2
 */
public class kondisiOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String status = "";
        int grade = 80;
        
        //mendapatkan status pelajar
        status = (grade >= 60)?"Passed":"Fail";
        
        //print status
        System.out.println( status );
    }
}
