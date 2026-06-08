console.log("Function Callback");

const add = (a, b) => a + b;


const outputElement = document.getElementById("output");

outputElement.addEventListener('click', () => add(5, 6));

const multiply = (a, b) => a * b;

const btn1 = document.getElementById("btn1");



const subtract = (a, b) => a - b;

const calc = (a, b, operation) => {
    switch (operation) {
        case add:
            result = add(a, b);
            calc01.textContent = result;
        case subtract:

            result = subtract(a, b);
            calc02.textContent = result;
        case multiply:
            result = multiply(a, b);
            calc03.textContent = result;
        default:
            break;
    }
}

calc(10, 3, add);
calc(10, 3, multiply);
calc(10, 3, subtract);

