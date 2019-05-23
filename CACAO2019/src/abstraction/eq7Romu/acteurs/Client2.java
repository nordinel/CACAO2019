package abstraction.eq7Romu.acteurs;

import java.util.ArrayList;
import java.util.List;

import abstraction.eq7Romu.produits.Chocolat;
import abstraction.fourni.Journal;

public abstract class Client2 {
	
	private int numero ;
	private int noteprix ;
	private int notequalite ;
	private int notefidelite ;
	private int temporalite ;
	private Journal journal ;
	
	public Client2(int numero, int noteprix, int notequalite, int notequantite, int notefidelite) {
		this.journal = new Journal("Journal" + this.getNom()) ;
		this.numero = numero ;
		this.noteprix = noteprix ;
		this.notequalite = notequalite ;
		this.notefidelite = notefidelite ;
	}
	
	public String getNom() {
		return "CL"+this.numero ;
	}
	
	public void initialiser() {	
	}
	
	public double getNotequalite(Chocolat c) {
		return c.NoteQualite();
	}
	
	public List<String> getListeChocolat() {
		return null;
	}
	
	public double getNoteprix() {
		return 0 ;
	}
}
