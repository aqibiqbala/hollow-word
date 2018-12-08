
package complex;

import add.addition;

public class Complex {

    
    public static void main(String[] args) 
    {
        addition ad1 = new addition ( 34,44);
        addition ad2 = new addition (10,29);
        addition cal = new addition ();
        cal = cal.add(ad1,ad2);
        System.out.println("FIRST VALUES IS         :  "+ad1.value());
        System.out.println("SECOND VALUES IS    :  "+ad2.value());
        System.out.println("........................................ ");
        System.out.println("ADDITION IS                 :  "+cal.value());
        System.out.println(".......................................");
        System.out.println("REAL PART IS               : " +cal.realNumber);
        System.out.println("IMAGNAIRY PARTS IS : "    +cal.imageNumber);
        System.out.println("");

    }
    
}
