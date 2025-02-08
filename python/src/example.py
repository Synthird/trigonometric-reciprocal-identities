import trig_reciprocal

# This file is an example of using the trig_reciprocal methods.

number: float = 0.0

try:
	number = float(input("Please enter a number: "))

	print(f"csc(1) = {trig_reciprocal.csc(number)} radians")
	print(f"sec(1) = {trig_reciprocal.sec(number)} radians")
	print(f"cot(1) = {trig_reciprocal.cot(number)} radians")
except ZeroDivisionError:
	print("csc(0) and cot(0) are undefined!")
except ValueError:
	print("You didn't enter a number....")
except KeyboardInterrupt:
	print("\nYou exited via keyboard!")
