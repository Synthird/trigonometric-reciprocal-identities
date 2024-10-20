# Trigonometric reciprocal identities
Trigonometric reciprocal identity methods that return doubles in radians.

```Java
TrigReciprocal trigReciprocal = new TrigReciprocal(); // One way of getting the trigReciprocal class
```

## trigReciprocal methods

### trigReciprocal.cosecant(double number) | Returns a double
Returns the cosecant of a double in radians

```Java
trigReciprocal.cosecant(1); // Returns 1.1883951057781212 radians as a double
```

```Java
trigReciprocal.cosecant(0); // Returns NaN since 1 ÷ sin(0) is equal to 1 ÷ 0, which is undefined
```

### trigReciprocal.secant(double number) | Returns a double
Returns the secant of a double in radians

```Java
trigReciprocal.secant(1); // Returns 1.8508157176809255 radians as a double
```

```Java
trigReciprocal.secant(0); // Returns 1 radian as a double since 1 ÷ cos(1) is equal to 1 ÷ 1, which is 1
```

### trigReciprocal.cotangent(double number) | Returns a double
Returns the cotangent of a double in radians

```Java
trigReciprocal.cotangent(1); // Returns 0.6420926159343306 radians as a double
```

```Java
trigReciprocal.cotangent(0); // Returns NaN since 1 ÷ tan(0) is equal to 1 ÷ 0, which is undefined
```

# License
This repository contains the MIT license. You must give credit if you are going to use its source code.
