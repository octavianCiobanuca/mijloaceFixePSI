package mijloaceFixe.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FisaInterventieMF extends Document{
	private Long id;
	private String denumireInterventie;
	private String responsabilInterventie;
	private Date dataInterventie;
	private List<String> produseServiciiInterventie = new ArrayList<String>();
	private Long idFactura;
	private int nrInventarMF;
	private String detaliiInterventie;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDenumireInterventie() {
		return denumireInterventie;
	}
	public void setDenumireInterventie(String denumireInterventie) {
		this.denumireInterventie = denumireInterventie;
	}
	public String getResponsabilInterventie() {
		return responsabilInterventie;
	}
	public void setResponsabilInterventie(String responsabilInterventie) {
		this.responsabilInterventie = responsabilInterventie;
	}
	public Date getDataInterventie() {
		return dataInterventie;
	}
	public void setDataInterventie(Date dataInterventie) {
		this.dataInterventie = dataInterventie;
	}
	public List<String> getProduseServiciiInterventie() {
		return produseServiciiInterventie;
	}
	public void setProduseServiciiInterventie(List<String> produseServiciiInterventie) {
		this.produseServiciiInterventie = produseServiciiInterventie;
	}
	public Long getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(Long idFactura) {
		this.idFactura = idFactura;
	}
	public int getNrInventarMF() {
		return nrInventarMF;
	}
	public void setNrInventarMF(int nrInventarMF) {
		this.nrInventarMF = nrInventarMF;
	}
	public String getDetaliiInterventie() {
		return detaliiInterventie;
	}
	public void setDetaliiInterventie(String detaliiInterventie) {
		this.detaliiInterventie = detaliiInterventie;
	}
	
}
