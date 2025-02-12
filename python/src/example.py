import trig_reciprocal

# This file is an example of using the trig_reciprocal module.

try:
	number: float = float(input("Please enter a number: "))

	print(f"sec({number}) = {trig_reciprocal.sec(number)} radian(s)")
	print(f"csc({number}) = {trig_reciprocal.csc(number)} radian(s)")
	print(f"cot({number}) = {trig_reciprocal.cot(number)} radian(s)")
except ZeroDivisionError:
	print("csc(0) and cot(0) are undefined!")
except ValueError:
	print("You didn't enter a number....")
except KeyboardInterrupt:
	print("\nYou exited via keyboard!")
