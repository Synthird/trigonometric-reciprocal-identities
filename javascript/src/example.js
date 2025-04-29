import * as trigReciprocal from "./trig-reciprocal.js";

// This file is an example of using the trigReciprocal module.

const enterNumber = document.getElementById("enter-number");
const answer = document.getElementById("answer");

const cscButton = document.getElementById("csc");
const secButton = document.getElementById("sec");
const cotButton = document.getElementById("cot");

const acscButton = document.getElementById("acsc");
const asecButton = document.getElementById("asec");
const acotButton = document.getElementById("acot");

cscButton.addEventListener("click", () => {
	answer.textContent = trigReciprocal.csc(parseFloat(enterNumber.value));
});

secButton.addEventListener("click", () => {
	answer.textContent = trigReciprocal.sec(parseFloat(enterNumber.value));
});

cotButton.addEventListener("click", () => {
	answer.textContent = trigReciprocal.cot(parseFloat(enterNumber.value));
});

acscButton.addEventListener("click", () => {
	answer.textContent = trigReciprocal.acsc(parseFloat(enterNumber.value));
});

asecButton.addEventListener("click", () => {
	answer.textContent = trigReciprocal.asec(parseFloat(enterNumber.value));
});

acotButton.addEventListener("click", () => {
	answer.textContent = trigReciprocal.acot(parseFloat(enterNumber.value));
});
