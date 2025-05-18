import trig_reciprocal

# This file is an example of using the trig_reciprocal module.

number: float = 0


def exit_with_message(message: str) -> None:
	print(message)
	raise SystemExit


def print_heading() -> None:
	print("------------")

try:
	number = float(input("Please enter a number: "))
except KeyboardInterrupt:
	exit_with_message("\nYou exited via keyboard!")
except ValueError:
	exit_with_message("Whoops! You didn't enter a number....")

# csc

try:
	print(f"csc({number}) = {trig_reciprocal.csc(number)} radian(s)")
except ZeroDivisionError:
	print("csc(0) = undefined!")

# sec

print(f"sec({number}) = {trig_reciprocal.sec(number)} radian(s)")

# cot

try:
	print(f"cot({number}) = {trig_reciprocal.cot(number)} radian(s)")
except ZeroDivisionError:
	print("cot(0) = undefined!")

print_heading()

# arccsc

try:
	print(f"arccsc({number}) = {trig_reciprocal.acsc(number)} radian(s)")
except (ZeroDivisionError, ValueError):
	print("arccsc(0) = undefined!")

# arcsec

try:
	print(f"arcsec({number}) = {trig_reciprocal.asec(number)} radian(s)")
except (ZeroDivisionError, ValueError):
	print("arcsec(0) = undefined!")

# arccot

print(f"arccot({number}) = {trig_reciprocal.acot(number)} radian(s)")

print_heading()

# csch

try:
	print(f"csch({number}) = {trig_reciprocal.csch(number)} radians(s)")
except ZeroDivisionError:
	print("csch(0) = undefined!")

# sech

print(f"sech({number}) = {trig_reciprocal.sech(number)} radians(s)")

# coth

try:
	print(f"coth({number}) = {trig_reciprocal.coth(number)} radians(s)")
except ZeroDivisionError:
	print("coth(0) = undefined!")
