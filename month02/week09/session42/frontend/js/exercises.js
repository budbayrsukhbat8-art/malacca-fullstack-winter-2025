const inputOne = document.getElementById('number-one');
const inputTwo = document.getElementById('number-two');
const addButton = document.getElementById('add-number');
    const addTwoNumbers = (a, b) => {
    
    const resultElement = document.getElementById('result');
    resultElement.textContent = parseInt (a) + parseInt(b);
}
addButton.addEventListener('click',() =>{
    const inputOneValue = inputOne.value;
    const inputTwoValue = inputTwo.value;
    addTwoNumbers(inputOneValue, inputTwoValue);
});

