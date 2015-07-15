/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hashfunction;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import static sun.security.krb5.Confounder.bytes;

/**
 *
 * @author ibrahim
 */
public class HashFunction {

    /**
     * @param args the command line arguments
     * @throws java.security.NoSuchAlgorithmException
     */
    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        // TODO code application logic here
        SHA2 sha = new SHA2("SHA-256");
        
        byte[] b = new byte[1];
        b[0]=0x0000;        
        
        
        b = sha.digest(b);
        
 
        //System.out.println("Text : " + example);
	System.out.print(Byte.toString(b[0]));
	System.out.print( Byte.toString(b[1]));
	System.out.print( Byte.toString(b[2]));
	System.out.print( Byte.toString(b[3]));
	System.out.print( Byte.toString(b[4]));
	System.out.print(Byte.toString(b[5]));
	System.out.println(Byte.toString(b[6]));
        	
        System.out.println(sha.getDigestSize());

        //System.out.println("hash [Byte Format] : " + bytes.toString());
         
    }
    
}
