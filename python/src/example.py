import trig_reciprocal

# This file is an example of using the trig_reciprocal module.

number: float = 0


def exit_with_message(message: str) -> None:
	print(message)
	raise SystemExit


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

# arccsc

try:
	print(f"arccsc({number}) = {trig_reciprocal.acsc(number)}")
except ZeroDivisionError:
	print("arccsc(0) = undefined!")

# arcsec

try:
	print(f"arcsec({number}) = {trig_reciprocal.asec(number)}")
except ZeroDivisionError:
	print("arcsec(0) = undefined!")

# arccot

print(f"arccot({number}) = {trig_reciprocal.acot(number)}")
