import * as trigReciprocal from "./trig-reciprocal.js";

// This file is an example of using the trigReciprocal module.

const enterNumber = document.getElementById("enter-number");
const answer = document.getElementById("answer");

document.getElementById("csc").addEventListener("click", () => {
	answer.textContent = trigReciprocal.csc(parseFloat(enterNumber.value));
});

document.getElementById("sec").addEventListener("click", () => {
	answer.textContent = trigReciprocal.sec(parseFloat(enterNumber.value));
});

document.getElementById("cot").addEventListener("click", () => {
	answer.textContent = trigReciprocal.cot(parseFloat(enterNumber.value));
});

// Inverse buttons

document.getElementById("acsc").addEventListener("click", () => {
	answer.textContent = trigReciprocal.acsc(parseFloat(enterNumber.value));
});

document.getElementById("asec").addEventListener("click", () => {
	answer.textContent = trigReciprocal.asec(parseFloat(enterNumber.value));
});

document.getElementById("acot").addEventListener("click", () => {
	answer.textContent = trigReciprocal.acot(parseFloat(enterNumber.value));
});

// Hyperbolic buttons

document.getElementById("csch").addEventListener("click", () => {
	answer.textContent = trigReciprocal.csch(parseFloat(enterNumber.value));
});

document.getElementById("sech").addEventListener("click", () => {
	answer.textContent = trigReciprocal.sech(parseFloat(enterNumber.value));
});

document.getElementById("coth").addEventListener("click", () => {
	answer.textContent = trigReciprocal.coth(parseFloat(enterNumber.value));
});
