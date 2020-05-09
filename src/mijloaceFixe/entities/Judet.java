package mijloaceFixe.entities;

import mijloaceFixe.metamodel.AbstractEntity;

public class Judet extends AbstractEntity{
	private Long id;
	private String codJudet;
	private String numeJudet;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodJudet() {
		return codJudet;
	}
	public void setCodJudet(String codJudet) {
		this.codJudet = codJudet;
	}
	public String getNumeJudet() {
		return numeJudet;
	}
	public void setNumeJudet(String numeJudet) {
		this.numeJudet = numeJudet;
	}
}
