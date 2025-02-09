# Trigonometric reciprocal identity functions in Python

Trigonometric reciprocal identity functions that return radians as floats.

You can access the trig_reciprocal module in the [src folder](src) or by [clicking here](src/trig_reciprocal.py).

> [!IMPORTANT]
> The trig_reciprocal module must be inside your project before any of its functions can be used.

```Python
# One way of getting the trig_reciprocal module inside your project. This requires the module to be in the same folder as the file using this code.
import trig_reciprocal
```

## trig_reciprocal functions

### trig_reciprocal.csc(angleInRadians: float) | Returns a float in radians

Returns the cosecant of angleInRadians.

$csc(number) ={{1} \over {sin(number)}}$

```Python
trig_reciprocal.csc(1.0) # Returns 1.1883951057781212 radians as a float.
```

```Python
trig_reciprocal.csc(0.0) # Raises a ZeroDivisionError.
```

### trig_reciprocal.sec(angleInRadians: float) | Returns a float in radians

Returns the secant of angleInRadians.

$sec(number) ={{1} \over {cos(number)}}$

```Python
trig_reciprocal.sec(1.0) # Returns 1.8508157176809255 radians as a float.
```

```Python
trig_reciprocal.sec(0.0) # Returns 1 radian as a float since 1 ÷ cos(1) is 1 ÷ 1, which is 1.
```

### trig_reciprocal.cot(angleInRadians: float) | Returns a float in radians

Returns the cotangent of angleInRadians.

$cot(number) ={{1} \over {tan(number)}}$ or ${cos(number) \over sin(number)}$

```Python
trig_reciprocal.cot(1.0) # Returns 0.6420926159343306 radians as a float.
```

```Python
trig_reciprocal.cot(0.0) # Raises a ZeroDivisionError.
```
