public class DiscountService {

    public String getDiscount(int amount) {

        String discountPercentage = "";//precondition, Given

        //main code to implement class, When
        if (amount > 5000 && amount < 10000) {
            discountPercentage = "10%";
        } else if (amount > 10000) {
            discountPercentage = "15%";
        }else {
            discountPercentage="No Discount";
        }

          //return/output result, Then
        return (String) discountPercentage;
    }
}
