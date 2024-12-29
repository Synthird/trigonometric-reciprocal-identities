# Trigonometric reciprocal identities

Trigonometric reciprocal identity methods that return radians as floats.

The trig_reciprocal module can be accessed in the [src folder](src) or by [clicking here](src/trig_reciprocal.py).

```Python
import trig_reciprocal # One way of getting the trig_reciprocal module.
```

<!-- markdownlint-disable MD024 -->

## trig_reciprocal methods

### trig_reciprocal.csc(numberInRadians: float) | Returns a float in radians

Returns the cosecant of a double in radians.

$csc(number) ={{1} \over {sin(number)}}$

#### Examples

```Python
trig_reciprocal.csc(1.0); # Returns 1.1883951057781212 radians as a float.
```

```Python
trig_reciprocal.csc(0.0); # Raises a value error due to division by 0.
```

### trig_reciprocal.sec(numberInRadians: float) | Returns a double in radians

Returns the secant of a double in radians.

$sec(number) ={{1} \over {cos(number)}}$

#### Examples

```Python
trig_reciprocal.sec(1.0); # Returns 1.8508157176809255 radians as a float.
```

```Python
trig_reciprocal.sec(0.0); # Returns 1 radian as a float since 1 ÷ cos(1) is 1 ÷ 1, which is 1.
```

### trig_reciprocal.cot(numberInRadians: float) | Returns a float in radians

Returns the cotangent of a double in radians.

$cot(number) ={{1} \over {tan(number)}}$ or ${cos(number) \over sin(number)}$

#### Examples

```Python
trig_reciprocal.cot(1.0); # Returns 0.6420926159343306 radians as a double.
```

```Python
trig_reciprocal.cot(0.0); # Raises a value error due to division by 0.
```
