# Trigonometric reciprocal identities in Lua

[![Lua website](https://www.lua.org/images/lua-logo.gif)](https://lua.org)

Trigonometric reciprocal identity functions that return radians as numbers.

## Installation

1. Download the latest release of the ```trigreciprocal.lua``` module from the [releases page](https://github.com/Synthird/trigonometric-reciprocal-identities/releases/latest)
2. Place the module inside your project

```Lua
-- One way to access the functions in the trigreciprocal module.
-- This requires the module to be in the same folder as the file using this code.
local trigreciprocal = require("trigreciprocal")
```

## Functions

### trigreciprocal.csc(angle_in_radians: number) | Returns a number

The reciprocal of sin.

**Returns:** The cosecant of angle_in_radians in radians.

**Raises an error:** if angle_in_radians is 0.

$csc(angle) ={{1} \over {sin(angle)}}$

```Lua
trigreciprocal.csc(1) -- Returns 1.1883951057781212 radians.
```

```Lua
trigreciprocal.csc(0) -- Raises an error of attempting to perform csc(0) since 1 / sin(0) = 1 / 0, which is undefined.
```

### trigreciprocal.sec(angle_in_radians: number) | Returns a number

The reciprocal of cos.

**Returns:** The secant of angle_in_radians in radians.

$sec(angle) ={{1} \over {cos(angle)}}$

```Lua
trigreciprocal.sec(1) -- Returns 1.8508157176809255 radians.
```

```Lua
trigreciprocal.sec(0) -- Returns 1 radian as a since 1 / cos(0) = 1 / 1, which is 1.
```

### trigreciprocal.cot(angle_in_radians: number) | Returns a number

The reciprocal of tan.

**Returns:** The cotangent of angle_in_radians in radians.

**Raises an error:** if angle_in_radians is 0.

$cot(angle) ={{1} \over {tan(angle)}}$ or ${cos(angle) \over sin(angle)}$

```Lua
trigreciprocal.cot(1) -- Returns 0.6420926159343306 radians.
```

```Lua
trigreciprocal.cot(0) -- Raises an error of attempting to perform cot(0) since 1 / tan(0) = 1 / 0, which is undefined.
```
### trigreciprocal.acsc(angle_in_radians: number) | Returns a number

The inverse of csc.

**Returns:** The arccosecant of angleInRadians in radians.

**Raises an error:** if angle_in_radians is 0.

$arccsc(angle) = arcsin({1 \over angle})$

```Lua
trigReciprocal.acsc(1) -- Returns 1.5707963267948966 radians.
```

```Lua
trigReciprocal.acsc(0) -- Raises an error of attempting to perform arccsc(0) since arcsin(1 / 0) is undefined.
```

### trigreciprocal.asec(angle_in_radians: number) | Returns a number

The inverse of sec.

**Returns:** The arcsecant of angleInRadians in radians.

**Raises an error:** if angle_in_radians is 0.

$arcsec(angle) = arccos({1 \over angle})$

```Lua
trigReciprocal.asec(1) -- Returns 0 radians.
```

```Lua
trigReciprocal.asec(0) -- Raises an error of attempting to perform arcsec(0) since arccos(1 / 0) is undefined.
```

### trigreciprocal.acot(angle_in_radians: number) | Returns a number

The inverse of cot.

**Returns:** The arccotangent of angleInRadians in radians.

$arccot(angle) = arctan({1 \over angle})$

```Lua
trigreciprocal.acot(1) -- Returns 0.7853981633974483 radians.
```

```Lua
trigreciprocal.acot(0) -- Returns 1.5707963267948966 radians.
```
