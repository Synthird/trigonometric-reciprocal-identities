import trig_reciprocal

# This file is an example of using the trig_reciprocal module.

number: float = 0


def exit_with_message(message: str) -> None:
	print(message)
	raise SystemExit


def print_heading(message: str) -> None:
	print(f"--- {message} ---")


try:
	number = float(input("Please enter a number: "))
except KeyboardInterrupt:
	exit_with_message("\nYou exited via keyboard!")
except ValueError:
	exit_with_message("Whoops! You didn't enter a number....")

try:
	print(f"csc({number}) = {trig_reciprocal.csc(number)} radian(s)")
except ZeroDivisionError:
	print("csc(0) = undefined!")

print(f"sec({number}) = {trig_reciprocal.sec(number)} radian(s)")

try:
	print(f"cot({number}) = {trig_reciprocal.cot(number)} radian(s)")
except ZeroDivisionError:
	print("cot(0) = undefined!")

print_heading("Inverse functions")

try:
	print(f"arccsc({number}) = {trig_reciprocal.acsc(number)} radian(s)")
except (ZeroDivisionError, ValueError):
	print(f"arccsc({number}) = undefined!")

try:
	print(f"arcsec({number}) = {trig_reciprocal.asec(number)} radian(s)")
except (ZeroDivisionError, ValueError):
	print(f"arcsec({number}) = undefined!")

print(f"arccot({number}) = {trig_reciprocal.acot(number)} radian(s)")

print_heading("Hyperbolic functions")

try:
	print(f"csch({number}) = {trig_reciprocal.csch(number)} radians(s)")
except ZeroDivisionError:
	print("csch(0) = undefined!")

print(f"sech({number}) = {trig_reciprocal.sech(number)} radians(s)")

try:
	print(f"coth({number}) = {trig_reciprocal.coth(number)} radians(s)")
except ZeroDivisionError:
	print("coth(0) = undefined!")

print_heading("Inverse hyperbolic functions")

try:
	print(f"arccsch({number}) = {trig_reciprocal.acsch(number)}")
except ZeroDivisionError:
	print("arccsch(0) = undefined!")

try:
	print(f"arcsech({number}) = {trig_reciprocal.asech(number)}")
except (ZeroDivisionError, ValueError):
	print(f"arcsech({number}) = undefined!")

try:
	print(f"arccoth({number}) = {trig_reciprocal.acoth(number)}")
except (ZeroDivisionError, ValueError):
	print(f"arccoth({number}) = undefined!")
