package mijloaceFixe.entities;

import mijloaceFixe.metamodel.AbstractEntity;

public class Furnizori extends AbstractEntity{
	private Long id;
	private String codFurnizor;
	private String contBancar;
	private String numeFurnizor;
	private String adresa;
	private String nrTelefon;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodFurnizor() {
		return codFurnizor;
	}
	public void setCodFurnizor(String codFurnizor) {
		this.codFurnizor = codFurnizor;
	}
	public String getContBancar() {
		return contBancar;
	}
	public void setContBancar(String contBancar) {
		this.contBancar = contBancar;
	}
	public String getNumeFurnizor() {
		return numeFurnizor;
	}
	public void setNumeFurnizor(String numeFurnizor) {
		this.numeFurnizor = numeFurnizor;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public String getNrTelefon() {
		return nrTelefon;
	}
	public void setNrTelefon(String nrTelefon) {
		this.nrTelefon = nrTelefon;
	}
}
