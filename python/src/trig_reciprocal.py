"""
Trigonometric reciprocal identity functions.
Such as cosecant, secant, and cotangent.

Functions:
- csc: The reciprocal of sin.
- sec: The reciprocal of cos.
- cot: The reciprocal of tan.
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
