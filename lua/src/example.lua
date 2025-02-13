local trigreciprocal = require("trigreciprocal")

-- This file is an example of using the trigreciprocal module.

print(string.format("csc(1) = %s", trigreciprocal.csc(1)))
print(string.format("sec(1) = %s", trigreciprocal.sec(1)))
print(string.format("cot(1) = %s", trigreciprocal.cot(1)))

print("--- 0 as the parameter ---")

local cosecant_zero = pcall(trigreciprocal.csc, trigreciprocal, 0)
local cotangent_zero = pcall(trigreciprocal.cot, trigreciprocal, 0)

print(string.format("sec(0) = %s", trigreciprocal.sec(0)))

if type(cosecant_zero) ~= "number" then
	print("csc(0) = undefined!")
end

if type(cotangent_zero) ~= "number" then
	print("cot(0) = undefined!")
end
