export function csc(numberInRadians) {
	return numberInRadians == 0.0 ? NaN : 1.0 / Math.sin(numberInRadians);
}

export function sec(numberInRadians) {
	return 1.0 / Math.cos(numberInRadians);
}

export function cot(numberInRadians) {
	return numberInRadians == 0.0 ? NaN : 1.0 / Math.tan(numberInRadians);
}