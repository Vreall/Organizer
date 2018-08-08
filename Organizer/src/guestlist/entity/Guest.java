package guestlist.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="guestlist")
public class Guest {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="imie")
	private String imie;
	
	@Column(name="nazwisko")
	private String nazwisko;
	
	@Column(name="przyjezdny")
	private String przyjezdny;
	
	@Column(name="status_obecnosci")
	private String statusObecnosci;
	
	@Column(name="potrzebny_nocleg")
	private String potrzebnyNocleg;
	
	@Column(name="dzieci")
	private String dzieci;
	
	public Guest() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getPrzyjezdny() {
		return przyjezdny;
	}

	public void setPrzyjezdny(String przyjezdny) {
		this.przyjezdny = przyjezdny;
	}

	public String getStatusObecnosci() {
		return statusObecnosci;
	}

	public void setStatusObecnosci(String statusObecnosci) {
		this.statusObecnosci = statusObecnosci;
	}

	public String getPotrzebnyNocleg() {
		return potrzebnyNocleg;
	}

	public void setPotrzebnyNocleg(String potrzebnyNocleg) {
		this.potrzebnyNocleg = potrzebnyNocleg;
	}

	public String getDzieci() {
		return dzieci;
	}

	public void setDzieci(String dzieci) {
		this.dzieci = dzieci;
	}

	@Override
	public String toString() {
		return "Guest [id=" + id + ", imie=" + imie + ", nazwisko=" + nazwisko + ", przyjezdny=" + przyjezdny
				+ ", statusObecnosci=" + statusObecnosci + ", potrzebnyNocleg=" + potrzebnyNocleg + ", dzieci=" + dzieci
				+ "]";
	}
	
	

	
	
}
