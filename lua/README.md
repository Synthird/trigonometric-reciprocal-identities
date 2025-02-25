# Trigonometric reciprocal identities in Lua

[![Lua logo](https://www.lua.org/images/lua-logo.gif)](https://lua.org)

Trigonometric reciprocal identity functions that return radians as numbers.

## Installation

1. Download the latest release of the ```trigreciprocal.lua``` module from the [releases page](https://github.com/Synthird/Trigonometric-reciprocal-identities/releases/latest)
2. Place the module inside your project

```Lua
-- One way of accessing the functions in the trigreciprocal module.
-- This requires the module to be in the same folder as the file using this code.
local trigreciprocal = require("trigreciprocal")
```

## Functions

### trigreciprocal.csc(angle_in_radians: number) | Returns a number

The reciprocal of sin.

**Returns:** The cosecant of angle_in_radians in radians.

$csc(angle) ={{1} \over {sin(angle)}}$

```Lua
trigreciprocal.csc(1.0) -- Returns 1.1883951057781212 radians as a number.
```

```Lua
trigreciprocal.csc(0.0) -- Raises an error of attempting to perform csc(0).
```

### trigreciprocal.sec(angle_in_radians: number) | Returns a number

The reciprocal of cos.

**Returns:** The secant of angle_in_radians in radians.

$sec(angle) ={{1} \over {cos(angle)}}$

```Lua
trigreciprocal.sec(1.0) -- Returns 1.8508157176809255 radians as a number.
```

```Lua
trigreciprocal.sec(0.0) -- Returns 1 radian as a number.
```

### trigreciprocal.cot(angle_in_radians: number) | Returns a number

The reciprocal of tan.

**Returns:** The cotangent of angle_in_radians in radians.

$cot(angle) ={{1} \over {tan(angle)}}$ or ${cos(angle) \over sin(angle)}$

```Lua
trigreciprocal.cot(1.0) -- Returns 0.6420926159343306 radians as a number.
```

```Lua
trigreciprocal.cot(0.0) -- Raises an error of attempting to perform cot(0).
```
