package personlist;

import java.util.Scanner;

/**
 * This class +++ Insert class description here +++
 *
 * @author Suresh Sharma
 */
public class PersonList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    Person [] p = new Person[4];
    for(int i = 0; i<p.length; i++){
            System.out.println("insert person name: ");
            p[i].setP_name(input.nextLine());
            
}
    }

}
