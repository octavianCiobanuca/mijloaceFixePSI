package mijloaceFixe.entities;

import java.util.Date;

import mijloaceFixe.metamodel.AbstractEntity;

public class DocumentReceptie extends AbstractEntity{
	private Long id;
	private int nrDoc;
	private Date data;
	private String tipDoc;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getNrDoc() {
		return nrDoc;
	}
	public void setNrDoc(int nrDoc) {
		this.nrDoc = nrDoc;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getTipDoc() {
		return tipDoc;
	}
	public void setTipDoc(String tipDoc) {
		this.tipDoc = tipDoc;
	}
}
