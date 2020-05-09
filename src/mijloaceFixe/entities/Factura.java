package mijloaceFixe.entities;

import java.util.ArrayList;
import java.util.List;

public class Factura extends DocumentReceptie{
	private Long id;
	private String numeFurnizor;
	private String sediuFurnizor;
	private List<String> produseServicii = new ArrayList<String>();
	private long valoareCuTVA;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumeFurnizor() {
		return numeFurnizor;
	}
	public void setNumeFurnizor(String numeFurnizor) {
		this.numeFurnizor = numeFurnizor;
	}
	public String getSediuFurnizor() {
		return sediuFurnizor;
	}
	public void setSediuFurnizor(String sediuFurnizor) {
		this.sediuFurnizor = sediuFurnizor;
	}
	public List<String> getProduseServicii() {
		return produseServicii;
	}
	public void setProduseServicii(List<String> produseServicii) {
		this.produseServicii = produseServicii;
	}
	public long getValoareCuTVA() {
		return valoareCuTVA;
	}
	public void setValoareCuTVA(long valoareCuTVA) {
		this.valoareCuTVA = valoareCuTVA;
	}
}
