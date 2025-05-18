"""
Trigonometric reciprocal identity functions that return radians.

Version: 1.2.0
"""

import math


def csc(angle_in_radians: float) -> float:
	"""The reciprocal of sin.

	Parameters
	----------
	angle_in_radians : float
		An angle in radians.

	Returns
	-------
	float
		The cosecant of angle_in_radians in radians.

	Raises
	------
	ZeroDivisionError
		If angle_in_radians is 0.
	"""
	return 1.0 / math.sin(angle_in_radians)


def sec(angle_in_radians: float) -> float:
	"""The reciprocal of cos.

	Parameters
	----------
	angle_in_radians : float
		An angle in radians.

	Returns
	-------
	float
		The secant of angle_in_radians in radians.
	"""
	return 1.0 / math.cos(angle_in_radians)


def cot(angle_in_radians: float) -> float:
	"""The reciprocal of tan.

	Parameters
	----------
	angle_in_radians : float
		An angle in radians.

	Returns
	-------
	float
		The cotangent of angle_in_radians in radians.

	Raises
	------
	ZeroDivisionError
		If angle_in_radians is 0.
	"""
	return 1.0 / math.tan(angle_in_radians)


def acsc(angle_in_radians: float) -> float:
	"""The inverse of csc.

	Parameters
	----------
	angle_in_radians: float
		An angle in radians.

	Returns
	-------
	float
		The arccosecant of angle_in_radians in radians.
	
	Raises
	------
	ZeroDivisionError
		If angle_in_radians is 0.
	
	ValueError
		If angle_in_radians is above 0 and below 1.
	"""
	return math.asin(1.0 / angle_in_radians)


def asec(angle_in_radians: float) -> float:
	"""The inverse of sec.

	Parameters
	----------
	angle_in_radians: float
		An angle in radians.

	Returns
	-------
	float
		The arcsecant of angle_in_radians in radians.

	Raises
	------
	ZeroDivisionError
		If angle_in_radians is 0.

	ValueError
		If angle_in_radians is above 0 and below 1.
	"""
	return math.acos(1.0 / angle_in_radians)


def acot(angle_in_radians: float) -> float:
	"""The inverse of cot.

	Parameters
	----------
	angle_in_radians: float
		An angle in radians.

	Returns
	-------
	float
		The arccotangent of angle_in_radians in radians.
	"""
	return math.atan(1.0 / angle_in_radians) if angle_in_radians != 0 else 1.5707963267948966


def csch(angle_in_radians: float) -> float:
	"""The hyperbolic version of csc.

	Parameters
	----------
	angle_in_radians : float
		An angle in radians.

	Returns
	-------
	float
		The hyperbolic cosecant of angle_in_radians in radians.

	Raises
	------
	ZeroDivisionError
		If angle_in_radians is 0.
	"""
	return 1.0 / math.sinh(angle_in_radians)


def sech(angle_in_radians: float) -> float:
	"""The hyperbolic version of sec.

	Parameters
	----------
	angle_in_radians : float
		An angle in radians.

	Returns
	-------
	float
		The hyperbolic secant of angle_in_radians in radians.

	Raises
	------
	ZeroDivisionError
		If angle_in_radians is 0.
	"""
	return 1.0 / math.cosh(angle_in_radians)


def coth(angle_in_radians: float) -> float:
	"""The hyperbolic version of cot.

	Parameters
	----------
	angle_in_radians : float
		An angle in radians.

	Returns
	-------
	float
		The hyperbolic cotangent of angle_in_radians in radians.

	Raises
	------
	ZeroDivisionError
		If angle_in_radians is 0.
	"""
	return 1.0 / math.tanh(angle_in_radians)
