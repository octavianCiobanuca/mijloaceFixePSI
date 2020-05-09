package mijloaceFixe.entities;

import mijloaceFixe.metamodel.AbstractEntity;

public class Localitate extends AbstractEntity{
	private Long id;
	private String numeLocalitate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumeLocalitate() {
		return numeLocalitate;
	}
	public void setNumeLocalitate(String numeLocalitate) {
		this.numeLocalitate = numeLocalitate;
	}
}
