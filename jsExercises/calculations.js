// Freelance works 8 hours per day
export function dayRate(hourlyRate) {
    return hourlyRate * 8;
}

// Budget is split into 8-hour workdays
export function daysInBudget(budget, hourlyRate) {
    // Round down; can't have decimal days
    return Math.floor(budget / dayRate(hourlyRate));
}

// Each month has 22 billable days
// Discount applied for every full month. Passed as num -> floating point
// Price must be rounded up
export function priceWithMonthlyDiscount(
	hourlyRate,
	numBillableDays,
	monthlyDiscountRate,
) {
	let dailyRate = dayRate(hourlyRate);

	// Remainder of days are billed at day rate
	let remainingDays = numBillableDays % 22;
	let numDiscountedDays = numBillableDays - remainingDays;

	// Must apply discount as fraction
	let billableDaysFee =
		numDiscountedDays * dailyRate * (1 - monthlyDiscountRate);

	let remainingDaysFee = remainingDays * dailyRate;

    // Must be rounded up
	let totalFees = Math.ceil(billableDaysFee + remainingDaysFee);

	return totalFees;
}

console.log(priceWithMonthlyDiscount(89, 230, 0.42))