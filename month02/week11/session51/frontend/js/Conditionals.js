console.log('JS Conditionals');
const a1 = true;
const b1 = false;

console.log('AND logical operator');


/** 
 * Syntax : &&
 * true && true => true
 * false && true => false
 * true && false => false
 * false && false => false
 */
// Examples
console.log(true && true); // true
console.log(a1 && b1); // false 

console.log('OR logical operator');

/**
 * Syntax : ||
 * 
 * true || true => true
 * false || true => true
 * true || false => true
 * false || false => false
 */
// Examples
console.log(true || false); // true
console.log(a1 || b1); // true

console.log('NOT logical operator');
/**
 * Syntax: !
 * 
 * !true => false
 * !true => true
 */
console.log(!true); // false
console.log(!false); // true

// Combined Exercises
const a2 = true;
const b2 = false;
const c2 = true;
const d2 = true;
const e2 = false;

const result2 = ((a2 && b2) || c2 && (d2 && !e2)); // 

// Check user's election eligibility
// user age must be over 18
// user must be. mobgolian citizen.
// show on election-display element,
// wheter user can give election or not

const formElement = document.querySelector("#election");
const electionDisplayElement = document.querySelector("#election-display");

formElement.addEventListener('submit', function (e) {
    e.preventDefault();
    const ageInput = document.querySelector('#age');
    console.log(ageInput); // debug
    const citizenInput = document.querySelector("#citizenship");
    if (parseInt(ageInput.value) >= 18 && citizenInput.value === 'mongolian') {
        electionDisplayElement.textContent = 'Eligible';
    } else {
        electionDisplayElement.textContent = 'Not Eligible';
    }
});
const seasons = document.querySelector("#seasons");
const seasonDisplayElement =document.querySelector("#season-display");
seasons.addEventListener("change", function (e) {
    console.log(e.target.value);
    const choice = e.target.value;

    switch (choice) {
        case "summer":
            seasonDisplayElement.style.backgroundColor = "red";
            seasonDisplayElement.style.color = "white";
            seasonDisplayElement.textContent = "summer";
            break;
        case "winter":
            seasonDisplayElement.style.backgroundColor = "grey";
            seasonDisplayElement.style.color = "white";
            seasonDisplayElement.textContent = "winter";
            break;
        case "spring":
            seasonDisplayElement.style.backgroundColor = "brown";
            seasonDisplayElement.style.color = "white";
            seasonDisplayElement.textContent = "spring";
            break;
        case "autumn":
            seasonDisplayElement.style.backgroundColor = "orange";
            seasonDisplayElement.style.color = "white";
            seasonDisplayElement.textContent = "autumn";
            break;
        default:
            seasonDisplayElement.textContent = "Undefined season.";

    }
});