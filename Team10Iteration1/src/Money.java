

class Money
{
	double value;
	
	public Money(){
		this.value = 0;
	}
	
	public Money(double value){
		this.value = value;
	}

	public Money times(int quantity) {
		this.value = value * quantity;
		return this;
	}

	public Money minus(Money total) {
		this.value = value - total.value;
		return this;
	}

	public Money add(Money subTotal) {
		this.value = value + subTotal.value;
		return this;
		
	}
}