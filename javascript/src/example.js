import * as trigReciprocal from "./trig-reciprocal.js";

const enterNumber = document.getElementById("enter-number");
const answer = document.getElementById("answer");

const cscButton = document.getElementById("csc");
const secButton = document.getElementById("sec");
const cotButton = document.getElementById("cot");

enterNumber.focus();

cscButton.addEventListener("click", () => {
	answer.textContent = trigReciprocal.csc(enterNumber.value);
});

secButton.addEventListener("click", () => {
	answer.textContent = trigReciprocal.sec(enterNumber.value);
});

cotButton.addEventListener("click", () => {
	answer.textContent = trigReciprocal.cot(enterNumber.value);
});