package mijloaceFixe.entities;

public class PVPunereFunctiune extends DocumentReceptie{
	private Long id;
	private String responsabilPunereFunctiune;
	private long valoareInregistrareMF;
	private String constatari;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getResponsabilPunereFunctiune() {
		return responsabilPunereFunctiune;
	}
	public void setResponsabilPunereFunctiune(String responsabilPunereFunctiune) {
		this.responsabilPunereFunctiune = responsabilPunereFunctiune;
	}
	public long getValoareInregistrareMF() {
		return valoareInregistrareMF;
	}
	public void setValoareInregistrareMF(long valoareInregistrareMF) {
		this.valoareInregistrareMF = valoareInregistrareMF;
	}
	public String getConstatari() {
		return constatari;
	}
	public void setConstatari(String constatari) {
		this.constatari = constatari;
	}
}
