package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Profesor implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7155878792983376480L;
	private String ime;
	private String prezime;
	private Date datumRodjenja;
	private String adresaStanovanja;
	private String telefon;
	private String email;
	private String adresaKancelarije;
	private String brLicne;
	private Titula titula;
	private Zvanje zvanje;
	private ArrayList<Predmet> predmeti;
	
	public Profesor() {
		this.ime = "";
		this.prezime = "";
		this.datumRodjenja = new Date();
		this.adresaStanovanja = "";
		this.telefon = "";
		this.email = "";
		this.adresaKancelarije = "";
		this.brLicne = "";
		this.titula = Titula.PROF;
		this.zvanje = Zvanje.DOCENT;
		this.predmeti = new ArrayList<Predmet>();
	}
	
	public Profesor(String ime, String prezime, Date datumRodjenja, String adresaStanovanja, String telefon,
			String email, String adresaKancelarije, String brLicne, Titula titula, Zvanje zvanje,
			ArrayList<Predmet> predmeti) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.datumRodjenja = datumRodjenja;
		this.adresaStanovanja = adresaStanovanja;
		this.telefon = telefon;
		this.email = email;
		this.adresaKancelarije = adresaKancelarije;
		this.brLicne = brLicne;
		this.titula = titula;
		this.zvanje = zvanje;
		this.predmeti = predmeti;
	}
	public Profesor(Profesor p) {
		super();
		this.ime = p.ime;
		this.prezime = p.prezime;
		this.datumRodjenja = p.datumRodjenja;
		this.adresaStanovanja = p.adresaStanovanja;
		this.telefon = p.telefon;
		this.email = p.email;
		this.adresaKancelarije = p.adresaKancelarije;
		this.brLicne = p.brLicne;
		this.titula = p.titula;
		this.zvanje = p.zvanje;
		this.predmeti = p.predmeti;
	}
	public String getIme() {
		return ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public Date getDatumRodjenja() {
		return datumRodjenja;
	}
	public String getAdresaStanovanja() {
		return adresaStanovanja;
	}
	public String getTelefon() {
		return telefon;
	}
	public String getEmail() {
		return email;
	}
	public String getAdresaKancelarije() {
		return adresaKancelarije;
	}
	public String getBrLicne() {
		return brLicne;
	}
	public Titula getTitula() {
		return titula;
	}
	public Zvanje getZvanje() {
		return zvanje;
	}
	public ArrayList<Predmet> getPredmeti() {
		return predmeti;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public void setDatumRodjenja(Date datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}
	public void setAdresaStanovanja(String adresaStanovanja) {
		this.adresaStanovanja = adresaStanovanja;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAdresaKancelarije(String adresaKancelarije) {
		this.adresaKancelarije = adresaKancelarije;
	}
	public void setBrLicne(String brLicne) {
		this.brLicne = brLicne;
	}
	public void setTitula(Titula titula) {
		this.titula = titula;
	}
	public void setZvanje(Zvanje zvanje) {
		this.zvanje = zvanje;
	}
	public void setPredmeti(ArrayList<Predmet> predmeti) {
		this.predmeti = predmeti;
	}
	@Override
	public String toString() {
		return "Profesor [ime=" + ime + ", prezime=" + prezime + ", datumRodjenja=" + datumRodjenja
				+ ", adresaStanovanja=" + adresaStanovanja + ", telefon=" + telefon + ", email=" + email
				+ ", adresaKancelarije=" + adresaKancelarije + ", brLicne=" + brLicne + ", titula=" + titula
				+ ", zvanje=" + zvanje + ", predmeti=" + predmeti + "]";
	}
	
	public void izbrisiPredmet(String sifra) {
		for(Predmet p : predmeti) {
			if(p.getSifra().equals(sifra)) {
				predmeti.remove(p);
				break;
			}
		}
	}
}
