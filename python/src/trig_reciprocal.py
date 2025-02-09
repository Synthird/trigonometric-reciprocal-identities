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
	"""
	:param angle_in_radians: A number in radians.
	:type angle_in_radians: float
	:return float: The cosecant of angle_in_radians.
	"""
	return 1.0 / math.sin(angle_in_radians)


def sec(angle_in_radians: float) -> float:
	"""
	:param angle_in_radians: A number in radians.
	:type angle_in_radians: float
	:return float: The secant of angle_in_radians.
	"""
	return 1.0 / math.cos(angle_in_radians)


def cot(angle_in_radians: float) -> float:
	"""
	:param angle_in_radians: A number in radians.
	:type angle_in_radians: float
	:return float: The cotangent of angle_in_radians.
	"""
	return 1.0 / math.tan(angle_in_radians)
