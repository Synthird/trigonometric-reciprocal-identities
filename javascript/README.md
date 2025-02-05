# Trigonometric reciprocal identities in JavaScript

Trigonometric reciprocal identity methods that return radians as numbers.

You can access the trigReciprocal module in the [src folder](src) or by [clicking here](src/trig-reciprocal.js).

> [!IMPORTANT]
> The trigReciprocal module must be inside your project before any methods can be used.

```JavaScript
// One way of getting the trig-reciprocal module inside your project. This requires the module to be in the same folder as the file using this code.
import * as trigReciprocal from "./trig-reciprocal.js";
```

## trigReciprocal methods

### trigReciprocal.csc(numberInRadians: number) | Returns a number in radians

Returns the cosecant of numberInRadians.

$csc(number) ={{1} \over {sin(number)}}$

```JavaScript
trigReciprocal.csc(1.0); // Returns 1.1883951057781212 radians as a number.
```

```JavaScript
trigReciprocal.csc(0.0); // Returns NaN due to division by 0.
```

### trigReciprocal.sec(numberInRadians: number) | Returns a number in radians

Returns the secant of numberInRadians.

$sec(number) ={{1} \over {cos(number)}}$

```JavaScript
trigReciprocal.sec(1.0); // Returns 1.8508157176809255 radians as a number.
```

```JavaScript
trigReciprocal.sec(0.0); // Returns 1 radian as a number.
```

### trigReciprocal.cot(numberInRadians: number) | Returns a number in radians

Returns the cotangent of numberInRadians.

$cot(number) ={{1} \over {tan(number)}}$ or ${cos(number) \over sin(number)}$

```JavaScript
trigReciprocal.cot(1.0); // Returns 0.6420926159343306 radians as a number.
```

```JavaScript
trigReciprocal.cot(0.0); // Returns NaN due to division by 0.
```
