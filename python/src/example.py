import trig_reciprocal

# This file is an example of using the trig_reciprocal methods.

print(f"csc(1) = {trig_reciprocal.csc(1.0)} radians")
print(f"sec(1) = {trig_reciprocal.sec(1.0)} radians")
print(f"cot(1) = {trig_reciprocal.cot(1.0)} radians")

print("--- 0 as the parameter ---")

print(f"sec(0) = {trig_reciprocal.sec(0.0)} radian")

try:
    trig_reciprocal.csc(0)
except ZeroDivisionError:
    print("csc(0) = undefined!")

try:
    trig_reciprocal.cot(0)
except ZeroDivisionError:
    print("cot(0) = undefined!")
