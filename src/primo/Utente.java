package primo;
  
public class Utente {
	
	private int livello;
	private String mail;
	private String hmail;
	private int contatore;
	
	public void reset_contatore()
	{
		this.contatore = 0;
	} 
	
	public void aumenta_contatore()
	{
		this.contatore++;
	}

	public int getLivello() {
		return livello;
	}

	public void setLivello(int livello) {
		this.livello = livello;
	}

	public String getMail() {
		return mail;
	}
 
	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getContatore() {
		return contatore;
	}

	public void setContatore(int contatore) {
		this.contatore = contatore;
	}
	
	public Utente()
	{
		
	}

	public String getHmail() {
		return hmail;
	}

	public void setHmail(String hmail) {
		this.hmail = hmail;
	}
	
	
	
	

}
