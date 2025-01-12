import math


def csc(number_in_radians: float) -> float:
	"""Returns the cosecant of numberInRadians."""
	return 1.0 / math.sin(number_in_radians)


def sec(number_in_radians: float) -> float:
	"""Returns the secant of numberInRadians."""
	return 1.0 / math.cos(number_in_radians)


def cot(number_in_radians: float) -> float:
	"""Returns the cotangent of numberInRadians."""
	return 1.0 / math.tan(number_in_radians)
