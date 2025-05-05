# Trigonometric reciprocal identity functions in C

Trigonometric reciprocal identity functions that return radians as doubles.

## Installation

1. Download the latest release of the ```trig_reciprocal.c``` module from the [releases page](https://github.com/Synthird/trigonometric-reciprocal-identities/releases/latest)
2. Place the module inside your project

```C
// One way to access the functions in the trig_reciprocal module.
// This requires the module to be in the same folder as the file using this code.
#include "trig_reciprocal.c"
```

## Functions

### csc(double angleInRadians) | Returns a double

The reciprocal of sin.

**Returns:** The cosecant of angleInRadians in radians.

$csc(angle) ={{1} \over {sin(angle)}}$

```C
csc(1); // Returns 1.1883951057781212 radians.
```

```C
csc(0); // Returns nan since 1 / sin(0) = 1 / 0, which is undefined.
```

### sec(double angleInRadians) | Returns a double

The reciprocal of cos.

**Returns:** The secant of angleInRadians in radians.

$sec(angle) ={{1} \over {cos(angle)}}$

```C
sec(1); // Returns 1.8508157176809255 radians.
```

```C
sec(0); // Returns 1 radian as a since 1 / cos(0) = 1 / 1, which is 1.
```

### cot(double angleInRadians) | Returns a double

The reciprocal of tan.

**Returns:** The cotangent of angleInRadians in radians.

$cot(angle) ={{1} \over {tan(angle)}}$ or ${cos(angle) \over sin(angle)}$

```C
cot(1); // Returns 0.6420926159343306 radians.
```

```C
cot(0); // Returns nan since 1 / tan(0) = 1 / 0, which is undefined.
```

### acsc(double angleInRadians) | Returns a double

The inverse of csc.

**Returns:** The arccosecant of angleInRadians in radians.

$arccsc(angle) = arcsin({1 \over angle})$

```C
acsc(1); // Returns 1.5707963267948966 radians.
```

```C
acsc(0); // Returns nan since arcsin(1 / 0) is undefined.
```

### asec(double angleInRadians) | Returns a double

The inverse of sec.

**Returns:** The arcsecant of angleInRadians in radians.

$arcsec(angle) = arccos({1 \over angle})$

```C
asec(1); // Returns 0 radians.
```

```C
asec(0); // Returns nan since arccos(1 / 0) is undefined.
```

### acot(double angleInRadians) | Returns a double

The inverse of cot.

**Returns:** The arccotangent of angleInRadians in radians.

$arccot(angle) = arctan({1 \over angle})$

```C
acot(1); // Returns 0.7853981633974483 radians.
```

```C
acot(0); // Returns 1.5707963267948966 radians.
```
