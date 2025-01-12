# Trigonometric reciprocal identity methods in java

Trigonometric reciprocal identity methods that return radians as doubles.

The trigReciprocal class must be inside your project before it can be used. You can access it in the [src folder](src) or by [clicking here](src/TrigReciprocal.java).

```Java
TrigReciprocal trigReciprocal = new TrigReciprocal(); // One way of getting the trigReciprocal class once once it is inside your project.
```

## trigReciprocal methods

### trigReciprocal.csc(double numberInRadians) | Returns a double in radians

Returns the cosecant of numberInRadians.

$csc(number) ={{1} \over {sin(number)}}$

```Java
trigReciprocal.csc(1.0); // Returns 1.1883951057781212 radians as a double.
```

```Java
trigReciprocal.csc(0.0); // Returns Double.NaN due to division by 0.
```

### trigReciprocal.sec(double numberInRadians) | Returns a double in radians

Returns the secant of numberInRadians.

$sec(number) ={{1} \over {cos(number)}}$

```Java
trigReciprocal.sec(1.0); // Returns 1.8508157176809255 radians as a double.
```

```Java
trigReciprocal.sec(0.0); // Returns 1 radian as a double.
```

### trigReciprocal.cot(double numberInRadians) | Returns a double in radians

Returns the cotangent of numberInRadians.

$cot(number) ={{1} \over {tan(number)}}$ or ${cos(number) \over sin(number)}$

```Java
trigReciprocal.cot(1.0); // Returns 0.6420926159343306 radians as a double.
```

```Java
trigReciprocal.cot(0.0); // Returns Double.NaN due to division by 0.
```
