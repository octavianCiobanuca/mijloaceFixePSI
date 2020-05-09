package mijloaceFixe.entities;

public class PVReceptie extends DocumentReceptie{
	private Long id;
	private String furnizor;
	private String responsabilAchizitie;
	private String constatari;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFurnizor() {
		return furnizor;
	}
	public void setFurnizor(String furnizor) {
		this.furnizor = furnizor;
	}
	public String getResponsabilAchizitie() {
		return responsabilAchizitie;
	}
	public void setResponsabilAchizitie(String responsabilAchizitie) {
		this.responsabilAchizitie = responsabilAchizitie;
	}
	public String getConstatari() {
		return constatari;
	}
	public void setConstatari(String constatari) {
		this.constatari = constatari;
	}
}
