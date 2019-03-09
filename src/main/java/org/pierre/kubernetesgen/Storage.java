package org.pierre.kubernetesgen;

public class Storage {
	double amount;
	UnitOfMeasure unitOfMeasure;
	public Storage(double amount, UnitOfMeasure unitOfMeasure) {
		super();
		this.amount = amount;
		this.unitOfMeasure = unitOfMeasure;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public UnitOfMeasure getUnitOfMeasure() {
		return unitOfMeasure;
	}
	public void setUnitOfMeasure(UnitOfMeasure unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}
	
	
}
