
public class Commission extends Hourly {
	private double totalSales;
	private double commissionRate;
	
	public Commission(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate, double eCommissionRate) 
	{
		super(eName, eAddress, ePhone, socSecNumber, rate);
		
		commissionRate = eCommissionRate;
	}
	
	public void addSales(double moreSales)
	{
		totalSales += moreSales;
	}
	
	@Override
	public double pay()
	{
	    double payment = super.pay() + (totalSales * commissionRate);

	    totalSales = 0;

	    return payment;
	}
	
	@Override
	public String toString()
	{
		String result = super.toString();

		result += "\nTotal sales: " + totalSales;

		return result;
	}
}

