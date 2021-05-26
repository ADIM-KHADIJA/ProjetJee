package Entities;

public class Book {
	int idb;
	String Noml,Auteur,date_edition,category;
	public int getIdb() {
		return idb;
	}
	public void setIdb(int idb) {
		this.idb = idb;
	}
	public String getNoml() {
		return Noml;
	}
	public void setNoml(String noml) {
		Noml = noml;
	}
	public String getAuteur() {
		return Auteur;
	}
	public void setAuteur(String auteur) {
		Auteur = auteur;
	}
	public String getDate_edition() {
		return date_edition;
	}
	public void setDate_edition(String date_edition) {
		this.date_edition = date_edition;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Book [idb=" + idb + ", Noml=" + Noml + ", Auteur=" + Auteur + ", date_edition=" + date_edition
				+ ", category=" + category + "]";
	}
	
}
