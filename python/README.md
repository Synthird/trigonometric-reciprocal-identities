# Trigonometric reciprocal identity functions in Python

Trigonometric reciprocal identity functions that return radians as floats.

## Installation

1. Download the latest release of the ```trig_reciprocal.py``` module from the [releases page](https://github.com/Synthird/trigonometric-reciprocal-identities/releases/tag/v1.0.1python)
2. Place the module inside your project

```Python
# One way to access the functions in the trig_reciprocal module.
# This requires the module to be in the same folder as the file using this code.
import trig_reciprocal
```

## Functions

### trig_reciprocal.csc(angle_in_radians: float) | Returns a float

The reciprocal of sin.

**Returns:** The cosecant of angle_in_radians in radians.

**Raises a ZeroDivisionError:** If angle_in_radians is 0.

$csc(angle) ={{1} \over {sin(angle)}}$

```Python
trig_reciprocal.csc(1.0) # Returns 1.1883951057781212 radians as a float.
```

```Python
trig_reciprocal.csc(0.0) # Raises a ZeroDivisionError since 1 / sin(0) = 1 / 0, which is undefined.
```

### trig_reciprocal.sec(angle_in_radians: float) | Returns a float

The reciprocal of cos.

**Returns:** The secant of angle_in_radians in radians.

$sec(angle) ={{1} \over {cos(angle)}}$

```Python
trig_reciprocal.sec(1.0) # Returns 1.8508157176809255 radians as a float.
```

```Python
trig_reciprocal.sec(0.0) # Returns 1 radian as a float since 1 / cos(0) = 1 / 1, which is 1.
```

### trig_reciprocal.cot(angle_in_radians: float) | Returns a float

The reciprocal of tan.

**Returns:** The cotangent of angle_in_radians in radians.

**Raises a ZeroDivisionError:** If angle_in_radians is 0.

$cot(angle) ={{1} \over {tan(angle)}}$ or ${cos(angle) \over sin(angle)}$

```Python
trig_reciprocal.cot(1.0) # Returns 0.6420926159343306 radians as a float.
```

```Python
trig_reciprocal.cot(0.0) # Raises a ZeroDivisionError since 1 / tan(0) = 1 / 0, which is undefined.
```
