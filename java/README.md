# Trigonometric reciprocal identity methods in Java

Trigonometric reciprocal identity methods that return radians as doubles.

You can access the trigReciprocal class in the [src folder](src) or by [clicking here](src/TrigReciprocal.java).

> [!IMPORTANT]
> The trigReciprocal class must be inside your project before any of its methods can be used.

```Java
// One way of accessing the methods in the trigReciprocal class.
// This requires the class to be in the same folder as the file using this code.
TrigReciprocal trigReciprocal = new TrigReciprocal();
```

## trigReciprocal methods

### trigReciprocal.csc(double angleInRadians) | Returns a double

The reciprocal of sin.

**Returns:** The cosecant of angleInRadians in radians.

$csc(angle) ={{1} \over {sin(angle)}}$

```Java
trigReciprocal.csc(1.0); // Returns 1.1883951057781212 radians as a double.
```

```Java
trigReciprocal.csc(0.0); // Returns Double.NaN due to division by 0.
```

### trigReciprocal.sec(double angleInRadians) | Returns a double

The reciprocal of cos.

**Returns:** The secant of angleInRadians in radians.

$sec(angle) ={{1} \over {cos(angle)}}$

```Java
trigReciprocal.sec(1.0); // Returns 1.8508157176809255 radians as a double.
```

```Java
trigReciprocal.sec(0.0); // Returns 1 radian as a double.
```

### trigReciprocal.cot(double angleInRadians) | Returns a double

- The reciprocal of tan.
- **Returns:** The cotangent of angleInRadians in radians.

$cot(angle) ={{1} \over {tan(angle)}}$ or ${cos(angle) \over sin(angle)}$

```Java
trigReciprocal.cot(1.0); // Returns 0.6420926159343306 radians as a double.
```

```Java
trigReciprocal.cot(0.0); // Returns Double.NaN due to division by 0.
```
