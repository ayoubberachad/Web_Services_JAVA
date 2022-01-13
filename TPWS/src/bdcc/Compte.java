package bdcc;
import  java.util.Date;
public class Compte {

	private int code ;
	private double solde ;
	private Date date_ceration;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Date getDate_ceration() {
		return date_ceration;
	}
	public void setDate_ceration(Date date_ceration) {
		this.date_ceration = date_ceration;
	}
	
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Compte(int code, double solde, Date date_ceration) {
		super();
		this.code = code;
		this.solde = solde;
		this.date_ceration = date_ceration;
	}
	
	
	
}
