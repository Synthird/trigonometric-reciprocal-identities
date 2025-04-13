---Trigonometric reciprocal identity functions that return radians.
---Such as cosecant, secant, and cotangent.
---
---**Functions:**
--- csc: The reciprocal of sin.
--- sec: The reciprocal of cos.
--- cot: The reciprocal of tan.
---
---@module "trigreciprocal"
---@author Synthird
---@version 1.0.0
local trigreciprocal = {}

---The reciprocal of sin.
---@param angle_in_radians number --An angle in radians.
---@return number --The cosecant of angle_in_radians in radians.
function trigreciprocal.csc(angle_in_radians)
	if angle_in_radians ~= 0 then
		return 1 / math.sin(angle_in_radians)
	else
		error("Attempted to perform sin(0), which is undefined!")
	end
end

---The reciprocal of cos.
---@param angle_in_radians number --An angle in radians.
---@return number --The secant of angle_in_radians in radians.
function trigreciprocal.sec(angle_in_radians)
	return 1 / math.cos(angle_in_radians)
end

---The reciprocal of tan.
---@param angle_in_radians number --An angle in radians.
---@return number --The cotangent of angle_in_radians in radians.
function trigreciprocal.cot(angle_in_radians)
	if angle_in_radians ~= 0 then
		return 1 / math.tan(angle_in_radians)
	else
		error("Attempted to perform cot(0), which is undefined!")
	end
end

return trigreciprocal
