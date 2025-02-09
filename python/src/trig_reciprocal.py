"""
Trigonometric reciprocal identity functions.
Such as cosecant, secant, and cotangent.

Functions:
- csc: The reciprocal of sin.
- sec: The reciprocal of cos.
- cot: The reciprocal of tan.
"""

import math


def csc(number_in_radians: float) -> float:
	"""
	:param number_in_radians: A number in radians.
	:type number_in_radians: float
	:return float: The cosecant of number_in_radians.
	"""
	return 1.0 / math.sin(number_in_radians)


def sec(number_in_radians: float) -> float:
	"""
	:param number_in_radians: A number in radians.
	:type number_in_radians: float
	:return float: The secant of number_in_radians.
	"""
	return 1.0 / math.cos(number_in_radians)


def cot(number_in_radians: float) -> float:
	"""
	:param number_in_radians: A number in radians.
	:type number_in_radians: float
	:return float: The cotangent of number_in_radians.
	"""
	return 1.0 / math.tan(number_in_radians)
