package secondo;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
  

public class Input {
	
	/*InputStreamReader tastiera = new InputStreamReader(System.in);*/
	static Scanner tastiera = new Scanner(System.in);
	
	static public String inserimento()
	{
		String parola;
		parola = tastiera.next();
		
		return parola;
		/*return scannerizzato;*/
	}
	
	static private void verificaBot() throws NoSuchAlgorithmException
	{
		Captcha codice_controllo;
		codice_controllo = new Captcha();
	}
	
	public static String sha512(String passwordToHash){
		String generatedPassword = null;
		String salt = "test";	/*
		 				Qui sarà da inserire il salt
		  				*/
		    try {
		         MessageDigest md = MessageDigest.getInstance("SHA-512");
		         md.update(salt.getBytes(StandardCharsets.UTF_8));
		         byte[] bytes = md.digest(passwordToHash.getBytes(StandardCharsets.UTF_8));
		         StringBuilder sb = new StringBuilder();
		         for(int i=0; i< bytes.length ;i++){
		            sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
		         }
		         generatedPassword = sb.toString();
		        } 
		       catch (NoSuchAlgorithmException e){
		        e.printStackTrace();
		       }
		    return generatedPassword;
		}
	
	static String sha1(String input) throws NoSuchAlgorithmException {
        MessageDigest mDigest = MessageDigest.getInstance("SHA1");
        byte[] result = mDigest.digest(input.getBytes());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < result.length; i++) {
            sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
        }
         
        return sb.toString();
    }

}
