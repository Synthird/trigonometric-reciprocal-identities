# Trigonometric reciprocal identities in Lua

[![Lua logo](https://www.lua.org/images/lua-logo.gif)](https://lua.org)

Trigonometric reciprocal identity methods that return radians as numbers.

You can access the trigreciprocal module in the [src folder](src) or by [clicking here](src/trigreciprocal.lua).

> [!IMPORTANT]
> The trigreciprocal module must be inside your project before any methods can be used.

```Lua
-- One way of getting the trig-reciprocal module inside your project. This requires the module to be in the same folder as the file using this code.
local trigreciprocal = require("trigreciprocal")
```

## trigreciprocal methods

### trigreciprocal.csc(numberinradians: number) | Returns a number in radians

Returns the cosecant of numberinradians.

$csc(number) ={{1} \over {sin(number)}}$

```Lua
trigreciprocal.csc(1.0); -- Returns 1.1883951057781212 radians as a number.
```

```Lua
trigreciprocal.csc(0.0); -- Raises an error of attempting to perform csc(0)
```

### trigreciprocal.sec(numberinradians: number) | Returns a number in radians

Returns the secant of numberinradians.

$sec(number) ={{1} \over {cos(number)}}$

```Lua
trigreciprocal.sec(1.0); -- Returns 1.8508157176809255 radians as a number.
```

```Lua
trigreciprocal.sec(0.0); -- Returns 1 radian as a number.
```

### trigreciprocal.cot(numberinradians: number) | Returns a number in radians

Returns the cotangent of numberinradians.

$cot(number) ={{1} \over {tan(number)}}$ or ${cos(number) \over sin(number)}$

```Lua
trigreciprocal.cot(1.0); -- Returns 0.6420926159343306 radians as a number.
```

```Lua
trigreciprocal.cot(0.0); -- Raises an error of attempting to perform cot(0)
```
