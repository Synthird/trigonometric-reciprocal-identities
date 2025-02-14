local trigreciprocal = {}

---The reciprocal of sin.
---@param angleinradians number --An angle in radians.
---@return number --The cosecant of angleinradians in radians.
function trigreciprocal.csc(angleinradians)
	if angleinradians ~= 0 then
		return 1 / math.sin(angleinradians)
	else
		error("Attempted to perform sin(0), which is undefined!")
	end
end

---The reciprocal of cos.
---@param angleinradians number --An angle in radians.
---@return number --The secant of angleinradians in radians.
function trigreciprocal.sec(angleinradians)
	return 1 / math.cos(angleinradians)
end

---The reciprocal of tan.
---@param angleinradians number --An angle in radians.
---@return number --The cotangent of angleinradians in radians.
function trigreciprocal.cot(angleinradians)
	if angleinradians ~= 0 then
		return 1 / math.tan(angleinradians)
	else
		error("Attempted to perform cot(0), which is undefined!")
	end
end

return trigreciprocal
