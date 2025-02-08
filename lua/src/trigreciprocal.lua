local trigreciprocal = {}

---Returns the cosecant of numberinradians.
---@param numberinradians number
---@return number
function trigreciprocal.csc(numberinradians)
	if numberinradians ~= 0 then
		return 1 / math.sin(numberinradians)
	else
		error("Attempted to perform sin(0), which is undefined!")
	end
end

---Returns the secant of numberinradians.
---@param numberinradians number
---@return number
function trigreciprocal.sec(numberinradians)
	return 1 / math.cos(numberinradians)
end

---Returns the cotangent of numberinradians.
---@param numberinradians number
---@return number
function trigreciprocal.cot(numberinradians)
	if numberinradians ~= 0 then
		return 1 / math.tan(numberinradians)
	else
		error("Attempted to perform cot(0), which is undefined!")
	end
end

return trigreciprocal
