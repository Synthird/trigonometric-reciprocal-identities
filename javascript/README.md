# Trigonometric reciprocal identities in JavaScript

Trigonometric reciprocal identity methods that return radians as numbers.

## Installation

1. Download the latest release of the ```trig-reciprocal.js``` module from the [releases page](https://github.com/Synthird/trigonometric-reciprocal-identities/releases/latest)
2. Place the module inside your project

```JavaScript
// One way to access the methods in the trigReciprocal module.
// This requires the module to be in the same folder as the file using this code.
import * as trigReciprocal from "./trig-reciprocal.js";
```

## Methods

### trigReciprocal.csc(angleInRadians: number) | Returns a number

The reciprocal of sin.

**Returns:** The cosecant of angleInRadians in radians.

$csc(angle) ={{1} \over {sin(angle)}}$

```JavaScript
trigReciprocal.csc(1); // Returns 1.1883951057781212 radians as a number.
```

```JavaScript
trigReciprocal.csc(0); // Returns NaN since 1 / sin(0) = 1 / 0, which is undefined.
```

### trigReciprocal.sec(angleInRadians: number) | Returns a number

The reciprocal of cos.

**Returns:** The secant of angleInRadians in radians.

$sec(angle) ={{1} \over {cos(angle)}}$

```JavaScript
trigReciprocal.sec(1); // Returns 1.8508157176809255 radians as a number.
```

```JavaScript
trigReciprocal.sec(0); // Returns 1 radian as a number since 1 / cos(0) = 1 / 1, which is 1.
```

### trigReciprocal.cot(angleInRadians: number) | Returns a number

The reciprocal of tan.

**Returns:** The cotangent of angleInRadians in radians.

$cot(angle) ={{1} \over {tan(angle)}}$ or ${cos(angle) \over sin(angle)}$

```JavaScript
trigReciprocal.cot(1); // Returns 0.6420926159343306 radians as a number.
```

```JavaScript
trigReciprocal.cot(0); // Returns NaN since 1 / tan(0) = 1 / 0, which is undefined.
```

### trigReciprocal.acsc(double angleInRadians) | Returns a double

The inverse of csc.

**Returns:** The arccosecant of angleInRadians in radians.

$arccsc(angle) = arcsin({1 \over angle})$

```JavaScript
trigReciprocal.acsc(1); // Returns 1.5707963267948966 radians.
```

```JavaScript
trigReciprocal.acsc(0); // Returns NaN since arcsin(1 / 0) is undefined.
```

### trigReciprocal.asec(double angleInRadians) | Returns a double

The inverse of sec.

**Returns:** The arcsecant of angleInRadians in radians.

$arcsec(angle) = arccos({1 \over angle})$

```JavaScript
trigReciprocal.asec(1); // Returns 0 radians.
```

```JavaScript
trigReciprocal.asec(0); // Returns NaN since arccos(1 / 0) is undefined.
```

### trigReciprocal.acot(double angleInRadians) | Returns a double

The inverse of cot.

**Returns:** The arccotangent of angleInRadians in radians.

$arccot(angle) = arctan({1 \over angle})$

```JavaScript
trigReciprocal.acot(1); // Returns 0.7853981633974483 radians.
```

```JavaScript
trigReciprocal.acot(0); // Returns 1.5707963267948966 radians.
```
