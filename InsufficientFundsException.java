
/**
 * @author Vlad Fincher
 * This class is an exception
 *  that is called when balance is < 0
 */
public class InsufficientFundsException extends Exception {

    private final double shortfall;
	
    public InsufficientFundsException(double shortfall) {
    super("Insufficient Funds!");
    this.shortfall = shortfall;
	
}
	
    public double getShortfallAmount() {
	    return shortfall;
		
	}
}