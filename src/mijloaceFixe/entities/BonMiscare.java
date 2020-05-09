package mijloaceFixe.entities;

import java.util.Date;

public class BonMiscare extends Document{
	private Long id;
	private String denumireFormular;
	private int nrInventar;
	private Date dataEliberare;
	private long valoareInventarMF;
	private String subunitatePrimitoare;
	private String subunitatePredatiare;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDenumireFormular() {
		return denumireFormular;
	}
	public void setDenumireFormular(String denumireFormular) {
		this.denumireFormular = denumireFormular;
	}
	public int getNrInventar() {
		return nrInventar;
	}
	public void setNrInventar(int nrInventar) {
		this.nrInventar = nrInventar;
	}
	public Date getDataEliberare() {
		return dataEliberare;
	}
	public void setDataEliberare(Date dataEliberare) {
		this.dataEliberare = dataEliberare;
	}
	public long getValoareInventarMF() {
		return valoareInventarMF;
	}
	public void setValoareInventarMF(long valoareInventarMF) {
		this.valoareInventarMF = valoareInventarMF;
	}
	public String getSubunitatePrimitoare() {
		return subunitatePrimitoare;
	}
	public void setSubunitatePrimitoare(String subunitatePrimitoare) {
		this.subunitatePrimitoare = subunitatePrimitoare;
	}
	public String getSubunitatePredatiare() {
		return subunitatePredatiare;
	}
	public void setSubunitatePredatiare(String subunitatePredatiare) {
		this.subunitatePredatiare = subunitatePredatiare;
	}
}
