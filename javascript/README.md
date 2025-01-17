# Trigonometric reciprocal identities in javascript

Trigonometric reciprocal identity methods that return radians as floats.

You can access the trigReciprocal module in the [src folder](src) or by [clicking here](src/trig-reciprocal.js).

> [!IMPORTANT]
> The trig-reciprocal module must be inside your project before any methods can be used

```JavaScript
// One way of getting the trig-reciprocal module inside your project. This requires the module to be in the same folder as the file using this code.
import * as trigReciprocal  from "./trig-reciprocal.js";
```

## trig-reciprocal methods

### trigReciprocal.csc(float numberInRadians) | Returns a float in radians

Returns the cosecant of numberInRadians.

$csc(number) ={{1} \over {sin(number)}}$

```Java
trigReciprocal.csc(1.0); // Returns 1.1883951057781212 radians.
```

```Java
trigReciprocal.csc(0.0); // Returns NaN due to division by 0.
```

### trigReciprocal.sec(float numberInRadians) | Returns a float in radians

Returns the secant of numberInRadians.

$sec(number) ={{1} \over {cos(number)}}$

```Java
trigReciprocal.sec(1.0); // Returns 1.8508157176809255 radians as a float.
```

```Java
trigReciprocal.sec(0.0); // Returns 1 radian as a float.
```

### trigReciprocal.cot(float numberInRadians) | Returns a float in radians

Returns the cotangent of numberInRadians.

$cot(number) ={{1} \over {tan(number)}}$ or ${cos(number) \over sin(number)}$

```Java
trigReciprocal.cot(1.0); // Returns 0.6420926159343306 radians as a float.
```

```Java
trigReciprocal.cot(0.0); // Returns NaN due to division by 0.
```
