import * as trigReciprocal from "./trig-reciprocal.js";

const enterNumber = document.getElementById("enter-number");
const answer = document.getElementById("answer");

const cscButton = document.getElementById("csc");
const secButton = document.getElementById("sec");
const cotButton = document.getElementById("cot");

cscButton.onclick = function () {
	answer.textContent = trigReciprocal.csc(enterNumber.value);
}

secButton.onclick = function () {
	answer.textContent = trigReciprocal.sec(enterNumber.value);
}

cotButton.onclick = function () {
	answer.textContent = trigReciprocal.cot(enterNumber.value);
}