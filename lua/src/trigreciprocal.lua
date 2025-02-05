local trigreciprocal = {}

---Cosecant
---@param numberinradians number
---@return number
function trigreciprocal.csc(numberinradians)
	if numberinradians ~= 0 then
		return 1 / math.sin(numberinradians)
	else
		error("Attempted to perform sin(0)!")
	end
end

---Secant
---@param numberinradians number
---@return number
function trigreciprocal.sec(numberinradians)
	return 1 / math.cos(numberinradians)
end

---Cotanget
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
