# Trigonometric reciprocal identities in JavaScript

Trigonometric reciprocal identity methods that return radians as numbers.

You can access the trigReciprocal module in the [src folder](src) or by [clicking here](src/trig-reciprocal.js).

> [!IMPORTANT]
> The trigReciprocal module must be inside your project before any of its methods can be used.

```JavaScript
// One way of accessing the functions in the trig-reciprocal module.
// This requires the module to be in the same folder as the file using this code.
import * as trigReciprocal from "./trig-reciprocal.js";
```

## trigReciprocal methods

### trigReciprocal.csc(angleInRadians: number) | Returns a number

The reciprocal of sin.

**Returns:** The cosecant of angleInRadians in radians.

$csc(angle) ={{1} \over {sin(angle)}}$

```JavaScript
trigReciprocal.csc(1.0); // Returns 1.1883951057781212 radians as a number.
```

```JavaScript
trigReciprocal.csc(0.0); // Returns NaN due to division by 0.
```

### trigReciprocal.sec(angleInRadians: number) | Returns a number

The reciprocal of cos.

**Returns:** The secant of angleInRadians in radians.

$sec(angle) ={{1} \over {cos(angle)}}$

```JavaScript
trigReciprocal.sec(1.0); // Returns 1.8508157176809255 radians as a number.
```

```JavaScript
trigReciprocal.sec(0.0); // Returns 1 radian as a number.
```

### trigReciprocal.cot(angleInRadians: number) | Returns a number

The reciprocal of tan.

**Returns:** The cotangent of angleInRadians in radians.

$cot(angle) ={{1} \over {tan(angle)}}$ or ${cos(angle) \over sin(angle)}$

```JavaScript
trigReciprocal.cot(1.0); // Returns 0.6420926159343306 radians as a number.
```

```JavaScript
trigReciprocal.cot(0.0); // Returns NaN due to division by 0.
```
