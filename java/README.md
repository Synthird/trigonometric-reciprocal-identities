# Trigonometric reciprocal identity methods in Java

Trigonometric reciprocal identity methods that return radians as doubles.

## Installation

1. Download the latest release of the ```TrigReciprocal.java``` class from the [releases page](https://github.com/Synthird/trigonometric-reciprocal-identities/releases/latest)
2. Place the class inside your project

## Methods

### TrigReciprocal.csc(double angleInRadians) | Returns a double

The reciprocal of sin.

**Returns:** The cosecant of angleInRadians in radians.

$csc(angle) ={{1} \over {sin(angle)}}$

```Java
TrigReciprocal.csc(1); // Returns 1.1883951057781212 radians.
```

```Java
TrigReciprocal.csc(0); // Returns Double.NaN since 1 / sin(0) = 1 / 0, which is undefined.
```

### TrigReciprocal.sec(double angleInRadians) | Returns a double

The reciprocal of cos.

**Returns:** The secant of angleInRadians in radians.

$sec(angle) ={{1} \over {cos(angle)}}$

```Java
TrigReciprocal.sec(1); // Returns 1.8508157176809255 radians.
```

```Java
TrigReciprocal.sec(0); // Returns 1 radian as a since 1 / cos(0) = 1 / 1, which is 1.
```

### TrigReciprocal.cot(double angleInRadians) | Returns a double

The reciprocal of tan.

**Returns:** The cotangent of angleInRadians in radians.

$cot(angle) ={{1} \over {tan(angle)}}$ or ${cos(angle) \over sin(angle)}$

```Java
TrigReciprocal.cot(1); // Returns 0.6420926159343306 radians.
```

```Java
TrigReciprocal.cot(0); // Returns Double.NaN since 1 / tan(0) = 1 / 0, which is undefined.
```

### TrigReciprocal.acsc(double angleInRadians) | Returns a double

The inverse of csc.

**Returns:** The arccosecant of angleInRadians in radians.

$arccsc(angle) = arcsin({1 \over angle})$

```Java
TrigReciprocal.acsc(1); // Returns 1.5707963267948966 radians.
```

```Java
TrigReciprocal.acsc(0); // Returns Double.NaN since arcsin(1 / 0) is undefined.
```

### TrigReciprocal.asec(double angleInRadians) | Returns a double

The inverse of sec.

**Returns:** The arcsecant of angleInRadians in radians.

$arcsec(angle) = arccos({1 \over angle})$

```Java
TrigReciprocal.asec(1); // Returns 0 radians.
```

```Java
TrigReciprocal.asec(0); // Returns Double.NaN since arccos(1 / 0) is undefined.
```

### TrigReciprocal.acot(double angleInRadians) | Returns a double

The inverse of cot.

**Returns:** The arccotangent of angleInRadians in radians.

$arccot(angle) = arctan({1 \over angle})$

```Java
TrigReciprocal.acot(1); // Returns 0.7853981633974483 radians.
```

```Java
TrigReciprocal.acot(0); // Returns 1.5707963267948966 radians.
```

### TrigReciprocal.csch(angleInRadians: double) | Returns a double

The hyperbolic version of csc.

**Returns:** The hyperbolic cosecant of angleInRadians in radians.

```Java
TrigReciprocal.csch(1); # Returns 0.8509181282393216 radians
```

```Java
TrigReciprocal.csch(0); // Returns Double.NaN.
```

### TrigReciprocal.sech(angleInRadians: double) | Returns a double

The hyperbolic version of sec.

**Returns:** The hyperbolic secant of angleInRadians in radians.

```Java
TrigReciprocal.sech(1); // Returns 0.6480542736638855 radians.
```

```Java
TrigReciprocal.sech(0); // Returns 1 radian.
```

### TrigReciprocal.coth(angleInRadians: double) | Returns a double

The hyperbolic version of cot.

**Returns:** The hyperbolic cotangent of angleInRadians in radians.

```Java
TrigReciprocal.coth(1); // Returns 1.3130352854993315 radians.
```

```Java
TrigReciprocal.coth(0); // Returns Double.NaN.
```

### TrigReciprocal.acsch(angleInRadians: double) | Returns a double

The inverse of csch.

**Returns:** The hyperbolic arccosecant of angleInRadians in radians.

```Java
TrigReciprocal.acsch(1); // Returns 0.8813735870195429 radians
```

```Java
TrigReciprocal.acsch(0); // Returns Double.NaN.
```

### TrigReciprocal.asech(angleInRadians: double) | Returns a double

The inverse of sech.

**Returns:** The hyperbolic secant of angleInRadians in radians.

```Java
TrigReciprocal.asech(1); // Returns 0 radians.
```

```Java
TrigReciprocal.asech(0); // Returns Double.NaN.
```

### TrigReciprocal.acoth(angleInRadians: double) | Returns a double

The inverse of coth.

**Returns:** The hyperbolic cotangent of angleInRadians in radians.

```Java
TrigReciprocal.acoth(1); // Returns Double.NaN.
```

```Java
TrigReciprocal.acoth(2); // Returns 0.5493061443340549 radians.
```

```Java
TrigReciprocal.acoth(0); // Returns Double.NaN.
```
