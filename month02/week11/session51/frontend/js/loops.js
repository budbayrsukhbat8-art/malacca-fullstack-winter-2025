console.log("JS Array Datastructure");

/**
 * Java Array:
 * 
 * int[] a = {1,6,7};
 * 
 * Javascript Array:
 * 
 * const a = [1,6,7];
 * 
 * let b = ['Hi', true, 1.5];
 */

const a = [1, 6, 7];
console.log(a[0]);//1
console.log(a[2]); // 7

// js while loop
let i = 0;
while (i < 3) {
    console.log(a[i]);
    i++;
}

const myFavoriteFoods = [];

const foodFormElement = document.querySelector("#food-form");

foodFormElement.addEventListener('submit', (e) => {
    e.preventDefault();
    let input = e.target.elements[0].value;
    console.log(input);

    // add this input into my favourite foods array
    myFavoriteFoods.push(input);
    console.log(myFavoriteFoods);
    input = '';

    displayFoods(myFavoriteFoods);
})
const displayFoods = (foodList) => {
    let i = 0;
    let displayElements = '';
    while (i < foodList.length) {
        const liElement = `
         <li>${foodList[i]}</li>
         `;
        displayElements += liElement;
        i++;
    }
    const foodsDisplayElement = document.querySelector('#foods-display');
    foodsDisplayElement.innerHTML = displayElements;
}

