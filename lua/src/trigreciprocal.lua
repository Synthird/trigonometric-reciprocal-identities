---Trigonometric reciprocal identity functions that return radians.
---
---@module "trigreciprocal"
---@author Synthird
---@license MIT
---@version 1.2.0
local trigreciprocal = {}

---The reciprocal of sin.
---@param angle_in_radians number --An angle in radians.
---@return number --The cosecant of angle_in_radians in radians.
function trigreciprocal.csc(angle_in_radians)
	if angle_in_radians ~= 0 then
		return 1.0 / math.sin(angle_in_radians)
	else
		error("Attempted to perform sin(0), which is undefined!")
	end
end

---The reciprocal of cos.
---@param angle_in_radians number --An angle in radians.
---@return number --The secant of angle_in_radians in radians.
function trigreciprocal.sec(angle_in_radians)
	return 1.0 / math.cos(angle_in_radians)
end

---The reciprocal of tan.
---@param angle_in_radians number --An angle in radians.
---@return number --The cotangent of angle_in_radians in radians.
function trigreciprocal.cot(angle_in_radians)
	if angle_in_radians ~= 0 then
		return 1.0 / math.tan(angle_in_radians)
	else
		error("Attempted to perform cot(0), which is undefined!")
	end
end

---The inverse of csc.
---@param angle_in_radians number --An angle in radians.
---@return number --The arccosecant of angle_in_radians in radians.
function trigreciprocal.acsc(angle_in_radians)
	if angle_in_radians ~= 0 then
		return math.asin(1.0 / angle_in_radians)
	else
		error("Attempted to perform arccsc(0), which is undefined!")
	end
end

---The inverse of sec.
---@param angle_in_radians number --An angle in radians.
---@return number --The arcsecant of angle_in_radians in radians.
function trigreciprocal.asec(angle_in_radians)
	if angle_in_radians ~= 0 then
		return math.acos(1.0 / angle_in_radians)
	else
		error("Attempted to perform arcsec(0), which is undefined!")
	end
end

---The inverse of cot.
---@param angle_in_radians number --An angle in radians.
---@return number --The arccotangent of angle_in_radians in radians.
function trigreciprocal.acot(angle_in_radians)
	return math.atan(1.0 / angle_in_radians)
end

---The hyperbolic version of csc.
---@param angle_in_radians number --An angle in radians.
---@return number --The hyperbolic cosecant of angleInRadians in radians.
function trigreciprocal.csch(angle_in_radians)
	if angle_in_radians ~= 0 then
		return 1.0 / ((math.exp(angle_in_radians) - math.exp(-angle_in_radians)) / 2.0)
	else
		error("Attempted to perform csch(0), which is undefined!")
	end
end

---The hyperbolic version of sec.
---@param angle_in_radians number --An angle in radians.
---@return number --The hyperbolic secant of angleInRadians in radians.
function trigreciprocal.sech(angle_in_radians)
	return 1.0 / ((math.exp(angle_in_radians) + math.exp(-angle_in_radians)) / 2.0)
end

---The hyperbolic version of cot.
---@param angle_in_radians number --An angle in radians.
---@return number --The hyperbolic cotangent of angleInRadians in radians.
function trigreciprocal.coth(angle_in_radians)
	if angle_in_radians ~= 0 then
		return ((math.exp(angle_in_radians) + math.exp(-angle_in_radians)) / (math.exp(angle_in_radians) - math.exp(-angle_in_radians)))
	else
		error("Attempted to perform coth(0), which is undefined!")
	end
end

---The inverse of csch.
---@param angle_in_radians number --An angle in radians.
---@return number --The hyperbolic arccosecant of angleInRadians in radians.
function trigreciprocal.acsch(angle_in_radians)
	if angle_in_radians ~= 0 then
		return math.log((1.0 / angle_in_radians) + (math.sqrt(1.0 + (angle_in_radians * angle_in_radians)) / math.abs(angle_in_radians)))
	else
		error("Attempted to perform arccsch(0), which is undefined!")
	end
end

---The inverse of sech.
---@param angle_in_radians number --An angle in radians.
---@return number --The hyperbolic arcsecant of angleInRadians in radians.
function trigreciprocal.asech(angle_in_radians)
	if angle_in_radians <= 0 or angle_in_radians > 1 then
		error("Attempted to perform arcsech on a number that is between 0 and 1, which is undefined!")
	else
		return math.log((1.0 + math.sqrt(1.0 - (angle_in_radians * angle_in_radians))) / angle_in_radians)
	end
end

---The inverse of coth.
---@param angle_in_radians number --An angle in radians.
---@return number --The hyperbolic arccotangent of angleInRadians in radians.
function trigreciprocal.acoth(angle_in_radians)
	if angle_in_radians < -1 or angle_in_radians > 1 then
		return 0.5 * math.log((angle_in_radians + 1.0) / (angle_in_radians - 1.0))
	else
		error("Attempted to perform arccoth on a number that is less than -1 or greater than 1, which is undefined!")
	end
end

return trigreciprocal
