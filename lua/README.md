# Trigonometric reciprocal identities in Lua

[![Lua logo](https://www.lua.org/images/lua-logo.gif)](https://lua.org)

Trigonometric reciprocal identity functions that return radians as numbers.

You can access the trigreciprocal module in the [src folder](src) or by [clicking here](src/trigreciprocal.lua).

> [!IMPORTANT]
> The trigreciprocal module must be inside your project before any of its functions can be used.

```Lua
-- One way of getting the trigreciprocal module inside your project. This requires the module to be in the same folder as the file using this code.
local trigreciprocal = require("trigreciprocal")
```

## trigreciprocal functions

### trigreciprocal.csc(angleinradians: number) | Returns a number in radians

- The reciprocal of sin.
- Returns the cosecant of angleinradians.

$csc(angle) ={{1} \over {sin(angle)}}$

```Lua
trigreciprocal.csc(1.0) -- Returns 1.1883951057781212 radians as a number.
```

```Lua
trigreciprocal.csc(0.0) -- Raises an error of attempting to perform csc(0).
```

### trigreciprocal.sec(angleinradians: number) | Returns a number in radians

- The reciprocal of cos.
- Returns the secant of angleinradians.

$sec(angle) ={{1} \over {cos(angle)}}$

```Lua
trigreciprocal.sec(1.0) -- Returns 1.8508157176809255 radians as a number.
```

```Lua
trigreciprocal.sec(0.0) -- Returns 1 radian as a number.
```

### trigreciprocal.cot(angleinradians: number) | Returns a number in radians

- The reciprocal of tan.
- Returns the cotangent of angleinradians.

$cot(angle) ={{1} \over {tan(angle)}}$ or ${cos(angle) \over sin(angle)}$

```Lua
trigreciprocal.cot(1.0) -- Returns 0.6420926159343306 radians as a number.
```

```Lua
trigreciprocal.cot(0.0) -- Raises an error of attempting to perform cot(0).
```
