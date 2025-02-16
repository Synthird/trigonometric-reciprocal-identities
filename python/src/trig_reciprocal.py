"""
Trigonometric reciprocal identity functions.
Such as cosecant, secant, and cotangent.

Functions:
- csc: The reciprocal of sin.
- sec: The reciprocal of cos.
- cot: The reciprocal of tan.

:Version: 1.0.0
:Authors: Synthird
"""

import math


def csc(angle_in_radians: float) -> float:
	"""
	The reciprocal of sin.
	
	:param angle_in_radians: An angle in radians.
	:type angle_in_radians: float
	:return float: The cosecant of angle_in_radians in radians.
	"""
	return 1.0 / math.sin(angle_in_radians)


def sec(angle_in_radians: float) -> float:
	"""
	The reciprocal of cos.

	:param angle_in_radians: An angle in radians.
	:type angle_in_radians: float
	:return float: The secant of angle_in_radians in radians.
	"""
	return 1.0 / math.cos(angle_in_radians)


def cot(angle_in_radians: float) -> float:
	"""
	The reciprocal of tan.

	:param angle_in_radians: An angle in radians.
	:type angle_in_radians: float
	:return float: The cotangent of angle_in_radians in radians.
	"""
	return 1.0 / math.tan(angle_in_radians)
