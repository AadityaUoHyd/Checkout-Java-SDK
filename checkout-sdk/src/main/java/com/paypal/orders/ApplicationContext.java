// This class was generated on Tue, 04 Sep 2018 12:15:14 PDT by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// ApplicationContext.java
// @version 0.1.0-dev+904328-dirty
// @type object
// @data H4sIAAAAAAAC/8RXX28bRRB/51OMjhci+XxpUoLqt6rlAQFtFAovobIme+O7Vde7y8xu3Cviu6Pd811yPgOVMOHJuvm385v//r1413kqVsVL741WGLSz8MrZQB9DsSh+QdZ4Z+gNbpNQsSi+p+7h4zWJYu2TUrEqXkUJbqs/kUBoCTx2xEAfPbEmqwjqyNo2mYfes7tHA56dIhHYOB6UtmQD7HRo4Rq7azTLYlG8ZMau9/R8UdwQ1m+t6YrVBo1QIvwWNVM9Eq7ZeeKgSYrV7YhRQnJgDuuO0dZrmz4eA5yQp1DftQQG78hAaDGAuydmXe+B30XRNoFKqqBtJvZYAJVy0QZwE6roQP8Wpo3G/LH4R6wKrSKzjmwmWCfkOdafb36AXUtM2WuVE00MWoCp1kwqUA24CcRTgd6sPE7tE+E0aGttm7XHZprVA8Yca+g8gdvAXhCSIAQH0rrdkbzl0n0A3JL64OKToXQKzQG+gTRHdmvQNjHDweb9V20IXlZVFZwzstQUNkvHTdWGranulH/+zZdCKqmXF2djg44mtIVdq1WbQpPf1J/66iBmxyWTwVQUveeyAImqBRTYkgg2JAvQIjH9oq1BYtOQ5CrKT8oSci6wSUW2xZog+pSV9MLtdz+9havLF+XFgzvK1fQAabfbLY1Ty8bdVxLQ1si1VFpc1qp866uksDZawtK3/myRDbscLTT5hfLZ1y8unkMfxGnEkvlodTKRQ6bFZeFsNNmUZYriWY9tcLm8fHZ1BWh8i+UF5DnA3d7xqnZKKm0DNZyHcNW3VcUkodrLlklWqrMTF9f1fub+SKF19bzI9o273g78h2KbseZFN7ZGCsWWWLVowzjnPdOGOK0H+e/nfNpItO6fTFYOkBzw5lAG78tRbMQhLvIJMHxm2+fVuhYyefDOcExYf52RcpAaUfRpHIbcmKyTraf3n4ctl1RwH8geLbaBM0eW+odT/yqjyYayIUucx1DWeaLsMIXIdrZiJ+TTrdj+lKL/Y8dKq73Pu3Ts4gni4/w59EHu0TRY/RrPzy9VNPmX+i+j+6/XWrzBroc8KmNdc7q6gpsEaNnrVoPy1NS3NuGRaUiDA9U6JwRoR7NHLra/tXxDKWwqHNjesNtCaqtmvIX3Dzw6j/dpLA/P5CfKaxTidb+HJ/mc0g+Of2c3uolMAgh9JCSws00fjfSXQtu4j1H1mAWOjyhcYwdv3O6Y/HBjwca43Ynm0hd/AgAA//8=
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * Customizes the payer experience during the approval process for the payment with PayPal.
 */
@Model
public class ApplicationContext {

    // Required default constructor
    public ApplicationContext() {}

	/**
	* The label that overrides the business name in the PayPal account on the PayPal site.
	*/
	@SerializedName("brand_name")
	private String brandName;

	public String brandName() { return brandName; }
	
	public ApplicationContext brandName(String brandName) {
	    this.brandName = brandName;
	    return this;
	}

	/**
	* The URL where the customer is redirected after the customer cancels the payment.
	*/
	@SerializedName("cancel_url")
	private String cancelUrl;

	public String cancelUrl() { return cancelUrl; }
	
	public ApplicationContext cancelUrl(String cancelUrl) {
	    this.cancelUrl = cancelUrl;
	    return this;
	}

	/**
	* The type of landing page to show on the PayPal site for customer checkout.
	*/
	@SerializedName("landing_page")
	private String landingPage;

	public String landingPage() { return landingPage; }
	
	public ApplicationContext landingPage(String landingPage) {
	    this.landingPage = landingPage;
	    return this;
	}

	/**
	* The [language tag](https://tools.ietf.org/html/bcp47#section-2) for the language in which to localize the error-related strings, such as messages, issues, and suggested actions. The tag is made up of the [ISO 639-2 language code](https://www.loc.gov/standards/iso639-2/php/code_list.php), the optional [ISO-15924 script tag](https://www.unicode.org/iso15924/codelists.html), and the [ISO-3166 alpha-2 country code](/docs/integration/direct/rest/country-codes/).
	*/
	@SerializedName("locale")
	private String locale;

	public String locale() { return locale; }
	
	public ApplicationContext locale(String locale) {
	    this.locale = locale;
	    return this;
	}

	/**
	* The customer and merchant payment preferences.
	*/
	@SerializedName("payment_method")
	private PaymentMethod paymentMethod;

	public PaymentMethod paymentMethod() { return paymentMethod; }
	
	public ApplicationContext paymentMethod(PaymentMethod paymentMethod) {
	    this.paymentMethod = paymentMethod;
	    return this;
	}

	/**
	* The internal client-generated token.
	*/
	@SerializedName("payment_token")
	private String paymentToken;

	public String paymentToken() { return paymentToken; }
	
	public ApplicationContext paymentToken(String paymentToken) {
	    this.paymentToken = paymentToken;
	    return this;
	}

	/**
	* The URL where the customer is redirected after the customer approves the payment.
	*/
	@SerializedName("return_url")
	private String returnUrl;

	public String returnUrl() { return returnUrl; }
	
	public ApplicationContext returnUrl(String returnUrl) {
	    this.returnUrl = returnUrl;
	    return this;
	}

	/**
	* The shipping preference:<ul><li>Displays the shipping address to the customer.</li><li>Enables the customer to choose an address on the PayPal site.</li><li>Restricts the customer from changing the address during the payment-approval process.
	*/
	@SerializedName("shipping_preference")
	private String shippingPreference;

	public String shippingPreference() { return shippingPreference; }
	
	public ApplicationContext shippingPreference(String shippingPreference) {
	    this.shippingPreference = shippingPreference;
	    return this;
	}

	/**
	* Configures a <strong>Continue</strong> or <strong>Pay Now</strong> checkout flow.
	*/
	@SerializedName("user_action")
	private String userAction;

	public String userAction() { return userAction; }
	
	public ApplicationContext userAction(String userAction) {
	    this.userAction = userAction;
	    return this;
	}
}
