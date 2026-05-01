package q02_advanced.question01;

public class Coupon {

	public Coupon() {
	}

	public Coupon(int id, double discountRate, String descriptionString) {
		this.id = id;
		this.discountRate = discountRate;
		this.descriptionString = descriptionString;
	}

	@Override
	public String toString() {
		return "Coupon [id=" + id +
				", discountRate=" + discountRate +
				", description=" + descriptionString + "]";
	}

	private int id;
	private double discountRate;
	private String descriptionString;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getDescriptionString() {
		return descriptionString;
	}

	public void setDescriptionString(String descriptionString) {
		this.descriptionString = descriptionString;
	}

}
