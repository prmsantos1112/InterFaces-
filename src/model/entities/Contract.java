package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

	private Integer numberContract;
	private Date dateContract;
	private Double totalValueContract;

	private List<Installment> installments = new ArrayList<>();

	public Contract(Integer numberContract, Date dateContract, Double totalValueContract) {
		this.numberContract = numberContract;
		this.dateContract = dateContract;
		this.totalValueContract = totalValueContract;
	}

	public Integer getNumberContract() {
		return numberContract;
	}

	public void setNumberContract(Integer numberContract) {
		this.numberContract = numberContract;
	}

	public Date getDateContract() {
		return dateContract;
	}

	public void setDateContract(Date dateContract) {
		this.dateContract = dateContract;
	}

	public Double getTotalValueContract() {
		return totalValueContract;
	}

	public void setTotalValueContract(Double totalValueContract) {
		this.totalValueContract = totalValueContract;
	}

	public List<Installment> getInstallments() {
		return installments;

	}

	public void addInstallment(Installment installment) {
		installments.add(installment);
	}

	public void removeInstallment(Installment installment) {
		installments.remove(installment);

	}

}
