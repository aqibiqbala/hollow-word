
package add;
public class addition
{
    
    public float realNumber;
    public float imageNumber;
    public addition()
    {
        
    }
    public addition(float realNumber ,float imageNumber)
    {
        this.realNumber = realNumber;
        this. imageNumber = imageNumber;
    }
    
    public String value()
    {
        return realNumber +" + "+imageNumber+"i";
    }
    public addition add (addition ad1, addition ad2)
    {
        addition ad3 = new addition ();
        
        ad3.realNumber = ad1.realNumber+ad2.realNumber;
        ad3.imageNumber = ad1.imageNumber+ad2.imageNumber;
        return ad3;
        
    }
    
}
