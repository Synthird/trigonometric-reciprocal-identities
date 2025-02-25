# Trigonometric reciprocal identity methods in Java

Trigonometric reciprocal identity methods that return radians as doubles.

## Installation

1. Download the latest release of the ```TrigReciprocal.java``` class from the [releases page](https://github.com/Synthird/Trigonometric-reciprocal-identities/releases/latest)
2. Place the class inside your project

```Java
// One way of accessing the methods in the trigReciprocal class.
// This requires the class to be in the same folder as the file using this code.
TrigReciprocal trigReciprocal = new TrigReciprocal();
```

## Methods

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
