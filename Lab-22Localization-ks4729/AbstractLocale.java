/**
 * DO NOT MODIFY THIS FILE.
 * The abstract class for a locale. Your class must implement all abstract
 * methods.
 */

import java.util.Calendar;
import java.util.TimeZone;


public abstract class AbstractLocale {
  private String location;
  private String language;


  public AbstractLocale(String location, String language) {
    this.location = location;
    this.language = language;
  }


  public final String getLocation() {
    return location;
  }


  public final String getLanguage() {
    return language;
  }


  /**
   * Gets the time (in your chosen location's time zone) given the hour and
   * minutes (in Central Standard Time).
   * NOTE: The current implementation just returns the time in CST. Your
   * subclass must override this!
   * @return a formatted string, e.g. "3:08", in your chosen time zone.
   */
  public String getLocalTime(int hour, int min) {
    return String.format("%d:%02d", hour, min);
  }


  /**
   * Gets a greeting for the current locale.
   * @return "hello" in your chosen language.
   */
  public abstract String getGreeting();


  /**
   * @return your chosen location's currency symbol, e.g. "$".
   */
  public abstract String getCurrencySymbol();


  /**
   * Converts the given US dollar amount into your chosen location's currency
   * value. HINT: You'll need to look up the exchange rate.
   * @return the monetary value in your chosen currency.
   */
  public abstract double getCurrencyValue(double dollarAmount);


  /**
   * NOTE: This method is final so you don't override it in your locale
   * implementation.
   * @return an example string showing off your implemented Locale.
   */
  public final String toString() {
    Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("CST"));
    return String.format(
        "%s, here in %s we speak %s. " +
        "It is currently %s. " +
        "$20.00 is equal to %s%.2f.",
        getGreeting(), getLocation(), getLanguage(),
        getLocalTime(cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE)),
        getCurrencySymbol(), getCurrencyValue(20.00));
  }
}
