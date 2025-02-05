local trigreciprocal = {}

---@param numberinradians number
---@return number
function trigreciprocal.csc(numberinradians)
	if numberinradians ~= 0 then
		return 1 / math.sin(numberinradians)
	else
		error("Attempted to perform sin(0)!")
	end
end

---@param numberinradians number
---@return number
function trigreciprocal.sec(numberinradians)
	return 1 / math.cos(numberinradians)
end

---@param numberinradians number
---@return number
function trigreciprocal.cot(numberinradians)
	if numberinradians ~= 0 then
		return 1 / math.tan(numberinradians)
	else
		error("Attempted to perform cot(0)!")
	end
end

return trigreciprocal
