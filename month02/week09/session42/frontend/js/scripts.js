// javascript functions
// document 
console.log('javascript functions')
let showMe = 10;
document.getElementById('show-me').textContent = 10;
var pElement = document.getElementById('show-me');
console.log(pElement);
pElement.textContent = showMe;

pElement.style.textAlign = 'center';

pElement.style.fontSize = '50px';
pElement.style.color = 'black';
pElement.style.backgroundColor = 'brown'
const buttonElement = document.getElementById('click-me');

buttonElement.addEventListener('click', function () {
    alert('Button clicked');
});


// function declaration
// no return value
function addTwo(a, b) {
    console.log(a + b);
}

// function call
addTwo(5, 6);
addTwo(10, -5);

function returnTwoNumbers(a, b) {
    return a + b;
}
console.log(returnTwoNumbers(5, 6)); // 11

// Exercises
//1//
function addThreeNumbers(a, b, c){
    return a + b + c

}
console.log(10, 20, 25);
console.log(-10, 20, 25);
console.log(returnTwoNumbers(2, 6, 8));
//exercise2//
function addTwo(a, b){
    alert(a +b);
}
addTwo(7, 5);
addTwo(10, 15);
//exercises3//
function printHello(){
    console.log('Hello world');
    alert('Hello World');
}
printHello();

//function expression
const myFunction = function(){
console.log('this is my function expression');
}
myFunction();
//function expression
// arrow function
const myArrowFunction = ()=> {
    console.log('This is my arrow function expression');
}
myArrowFunction();


//Exercise1//
const addFour = function (a, b, c, d){
console.log(a+ b+ c+ d)
}
//Exercise2//
const multiplyTwo = (a, b) => {
    console.log(a* b);

};
multiplyTwo(5, 6);
    

