package src;

import java.util.Currency;

public class Currencies {
    public static void main(String []args)
    {
        String code = "TRY";

        if (validateCurrency(code)) {
            Currency c = Currency.getInstance(code);

            System.out.println("Currency : " + c);
            System.out.println("Currency Code : " + c.getCurrencyCode()); // TRY

            System.out.println("Numeric Code : " + c.getNumericCode()); // 949

            System.out.println("Display Name : " + c.getDisplayName());
            System.out.println("Symbol : " + c.getSymbol()); // ₺

            System.out.println("Fraction digits : " + c.getDefaultFractionDigits());
        } else {
            System.out.println("Invalid currency code : " + code);
        }
    }

    private static boolean validateCurrency(String code)
    {
        try {
            Currency c = Currency.getInstance(code);
            String currencyCode = c.getCurrencyCode();

            return currencyCode.equals(code);
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}
