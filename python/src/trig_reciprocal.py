"""
Trigonometric reciprocal identity functions that return radians.

Functions:
- csc: The reciprocal of sin.
- sec: The reciprocal of cos.
- cot: The reciprocal of tan.
- acsc: The inverse of csc.
- asec: The inverse of sec.
- acot: The inverse of cot.

Version: 1.1.5
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
