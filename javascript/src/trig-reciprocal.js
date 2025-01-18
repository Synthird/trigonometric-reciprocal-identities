let potentialNaN = 0.0;

export function csc(numberInRadians) {
	potentialNaN = parseFloat(numberInRadians);
	return potentialNaN === 0.0 || isNaN(potentialNaN) ? NaN : 1.0 / Math.sin(numberInRadians);
}

export function sec(numberInRadians) {
	return 1.0 / Math.cos(numberInRadians);
}

export function cot(numberInRadians) {
	potentialNaN = parseFloat(numberInRadians);
	return potentialNaN === 0.0 || isNaN(potentialNaN) ? NaN : 1.0 / Math.tan(numberInRadians);
}