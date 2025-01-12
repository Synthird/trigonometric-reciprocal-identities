# Trigonometric reciprocal identity methods in python

Trigonometric reciprocal identity methods that return radians as floats.

The trig_reciprocal module must be in your project before it can be used. You can access it in the [src folder](src) or by [clicking here](src/trig_reciprocal.py).

```Python
import trig_reciprocal # One way of getting the trig_reciprocal module once it is inside your project.
```

## trig_reciprocal methods

### trig_reciprocal.csc(numberInRadians: float) | Returns a float in radians

Returns the cosecant of numberInRadians.

$csc(number) ={{1} \over {sin(number)}}$

```Python
trig_reciprocal.csc(1.0) # Returns 1.1883951057781212 radians as a float.
```

```Python
trig_reciprocal.csc(0.0) # Raises a ValueError due to division by 0.
```

### trig_reciprocal.sec(numberInRadians: float) | Returns a float in radians

Returns the secant of numberInRadians.

$sec(number) ={{1} \over {cos(number)}}$

```Python
trig_reciprocal.sec(1.0) # Returns 1.8508157176809255 radians as a float.
```

```Python
trig_reciprocal.sec(0.0) # Returns 1 radian as a float since 1 ÷ cos(1) is 1 ÷ 1, which is 1.
```

### trig_reciprocal.cot(numberInRadians: float) | Returns a float in radians

Returns the cotangent of numberInRadians.

$cot(number) ={{1} \over {tan(number)}}$ or ${cos(number) \over sin(number)}$

```Python
trig_reciprocal.cot(1.0) # Returns 0.6420926159343306 radians as a float.
```

```Python
trig_reciprocal.cot(0.0) # Raises a ValueError due to division by 0.
```
