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
trigReciprocal.csc(1); // Returns 1.1883951057781212 radians.
```

```JavaScript
trigReciprocal.csc(0); // Returns NaN since 1 / sin(0) = 1 / 0, which is undefined.
```

### trigReciprocal.sec(angleInRadians: number) | Returns a number

The reciprocal of cos.

**Returns:** The secant of angleInRadians in radians.

$sec(angle) ={{1} \over {cos(angle)}}$

```JavaScript
trigReciprocal.sec(1); // Returns 1.8508157176809255 radians.
```

```JavaScript
trigReciprocal.sec(0); // Returns 1 radian as a since 1 / cos(0) = 1 / 1, which is 1.
```

### trigReciprocal.cot(angleInRadians: number) | Returns a number

The reciprocal of tan.

**Returns:** The cotangent of angleInRadians in radians.

$cot(angle) ={{1} \over {tan(angle)}}$ or ${cos(angle) \over sin(angle)}$

```JavaScript
trigReciprocal.cot(1); // Returns 0.6420926159343306 radians.
```

```JavaScript
trigReciprocal.cot(0); // Returns NaN since 1 / tan(0) = 1 / 0, which is undefined.
```

### trigReciprocal.acsc(angleInRadians: number) | Returns a number

The inverse of csc.

**Returns:** The arccosecant of angleInRadians in radians.

$arccsc(angle) = arcsin({1 \over angle})$

```JavaScript
trigReciprocal.acsc(1); // Returns 1.5707963267948966 radians.
```

```JavaScript
trigReciprocal.acsc(0); // Returns NaN since arcsin(1 / 0) is undefined.
```

### trigReciprocal.asec(angleInRadians: number) | Returns a number

The inverse of sec.

**Returns:** The arcsecant of angleInRadians in radians.

$arcsec(angle) = arccos({1 \over angle})$

```JavaScript
trigReciprocal.asec(1); // Returns 0 radians.
```

```JavaScript
trigReciprocal.asec(0); // Returns NaN since arccos(1 / 0) is undefined.
```

### trigReciprocal.acot(angleInRadians: number) | Returns a number

The inverse of cot.

**Returns:** The arccotangent of angleInRadians in radians.

$arccot(angle) = arctan({1 \over angle})$

```JavaScript
trigReciprocal.acot(1); // Returns 0.7853981633974483 radians.
```

```JavaScript
trigReciprocal.acot(0); // Returns 1.5707963267948966 radians.
```

### trigReciprocal.csch(angle_in_radians: number) | Returns a number

The hyperbolic version of csc.

**Returns:** The hyperbolic cosecant of angle_in_radians in radians.

```JavaScript
trigReciprocal.csch(1); // Returns 0.8509181282393216 radians
```

```JavaScript
trigReciprocal.csch(0); // Returns NaN.
```

### trigReciprocal.sech(angle_in_radians: number) | Returns a number

The hyperbolic version of sec.

**Returns:** The hyperbolic secant of angle_in_radians in radians.

```JavaScript
trigReciprocal.sech(1); // Returns 0.6480542736638855 radians.
```

```JavaScript
trigReciprocal.sech(0); // Returns 1 radian.
```

### trigReciprocal.coth(angle_in_radians: number) | Returns a number

The hyperbolic version of cot.

**Returns:** The hyperbolic cotangent of angle_in_radians in radians.

```JavaScript
trigReciprocal.coth(1); // Returns 1.3130352854993315 radians.
```

```JavaScript
trigReciprocal.coth(0); // Returns NaN.
```

### trigReciprocal.acsch(angle_in_radians: number) | Returns a number

The inverse of csch.

```JavaScript
trigReciprocal.acsch(1); // Returns 0.8813735870195429 radians
```

```JavaScript
trigReciprocal.acsch(0); // Returns NaN.
```

### trigReciprocal.asech(angle_in_radians: number) | Returns a number

The inverse of sech.

**Returns:** The hyperbolic secant of angle_in_radians in radians.

```JavaScript
trigReciprocal.asech(1); // Returns 0 radians.
```

```JavaScript
trigReciprocal.asech(0); // Returns NaN.
```

### trigReciprocal.acoth(angle_in_radians: number) | Returns a number

The inverse of coth.

**Returns:** The hyperbolic cotangent of angle_in_radians in radians.

```JavaScript
trigReciprocal.acoth(1); // Returns NaN.
```

```JavaScript
trigReciprocal.acoth(2); // Returns 0.5493061443340548 radians.
```

```JavaScript
trigReciprocal.acoth(0); // Returns NaN.
```
