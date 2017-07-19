package till;

import offers.Offer;

import java.math.BigDecimal;
import java.util.List;

public interface Till {

	public BigDecimal getNetTotal();

	public BigDecimal getItemsTotal();

	public BigDecimal getSavingsTotal();

	public List<Offer> getOffersApplied();

}
