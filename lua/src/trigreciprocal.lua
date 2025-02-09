local trigreciprocal = {}

---Returns the cosecant of angleinradians.
---@param angleinradians number
---@return number
function trigreciprocal.csc(angleinradians)
	if angleinradians ~= 0 then
		return 1 / math.sin(angleinradians)
	else
		error("Attempted to perform sin(0), which is undefined!")
	end
end

---Returns the secant of angleinradians.
---@param angleinradians number
---@return number
function trigreciprocal.sec(angleinradians)
	return 1 / math.cos(angleinradians)
end

---Returns the cotangent of angleinradians.
---@param angleinradians number
---@return number
function trigreciprocal.cot(angleinradians)
	if angleinradians ~= 0 then
		return 1 / math.tan(angleinradians)
	else
		error("Attempted to perform cot(0), which is undefined!")
	end
end

return trigreciprocal
