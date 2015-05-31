package org.xebia.bookstore.model;

import java.time.LocalDateTime;

import org.xebia.bookstore.exceptions.InvalidDiscountCouponException;

public class PercentageDiscountCoupon extends DiscountCoupon {

	private final int percentageDiscount;

	public PercentageDiscountCoupon(int percentageDiscount, LocalDateTime start, LocalDateTime end) {
		super(start, end);
		if (percentageDiscount < 0) {
			throw new InvalidDiscountCouponException("'discount' can not be negative.");
		}
		this.percentageDiscount = percentageDiscount;
	}

	public int getPercentageDiscount() {
		return percentageDiscount;
	}

	@Override
	public int calculateDiscountAmount(int checkoutAmount) {
		return (checkoutAmount * this.getPercentageDiscount()) / 100;
	}

}
