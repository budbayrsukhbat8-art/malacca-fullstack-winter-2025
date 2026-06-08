console.log('Callback function, arrow function');

// one, two, three elements need to be 
// caught up with className on DOM

const elementOne = document.getElementsByClassName('one')[0];
console.log(elementOne); // 

const elementTwo = document.getElementsByClassName('two')[0];
console.log(elementTwo);

const elementThree = document.getElementsByClassName('three')[0];
console.log(elementThree);

// function declaration
function add(a, b) {
    return a + b;
}

// elementOne-дээр 5, 6 хоёр утгыг add function ашиглаад
// харуулдаг болгох. elementTwo - 8, 1. elementThree - (-1, 6)
elementOne.textContent = add(5, 6);

elementTwo.textContent = add(8, 1);

elementThree.textContent = add(-1, 6);

// function expression
const multiply = function (a, b) {
    return a * b;
}

// arrow function
const divide = (a, b) => {
    return a / b;
}

// function call
console.log(multiply(5, 6)); // 30

console.log(divide(5, 6)); // `

const double = (x) => {
    return 2 * x;
}
console.log(double(4)); // 8
//Create an arrow function, which return "Hello" string.
// no parameter
const greeting = () => {
    return "Hello";
}

// square function - implicit arrow function
const square = (x) => x * x;
console.log(square(5)); // 25
// create a implicit arrow function with name sum of two numbers
const sum = (x, y) => x + y;
console.log(sum(10, 15)); // 25

//
const colors = ['red', 'green', 'blue'];

const addToList = (text) => {
    const li = document.createElement("li");
    li.textContent = text;
    document.querySelector('#list').appendChild(li);

}
const button = document.querySelector("#btn1");

const buttonDisplayElement = document.querySelector("#button-display");
button.addEventListener("button 01", function (e) {
    console.log(e.target.value);
    const choice = e.target.value;

    switch (choice) {
        case "text":
            buttonDisplayElement.style.buttonColor ="red";
            buttonDisplayElement.style.color = "red";
            buttonDisplayElement.textContent = "text";
            break;
        case "text":
            buttonDisplayElement.style.color = "green";
            buttonDisplayElement.textContent = "text";
            break;
        case "text":
            buttonDisplayElement.style.color = "blue";
            buttonDisplayElement.textContent = "text";
            break;
            default:
                buttonDisplayElement.textContent = "undefined text"
    }

})
