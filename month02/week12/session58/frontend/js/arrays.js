const colors = ['red', 'green', 'blue', 'orange',];

const [first, second] = colors;
console.log(first); // red
console.log(second); // green

const [,, third] = colors;
console.log(third); // blue

// rest operator

const [head, ...tail] = colors;
console.log(head); // red
console.log(tail); // ['green', 'blue', 'orange',]

//swap value of two variables
let a = 5;
let b =6;

// a = 6, b = 5
[a, b] = [b, a];

let a1 = 2, b1 = 3;
[a1, b1] = [b1, a1];
console.log(a1, b1);


const arr1 = [1, 2, 3];
const arr2 = [4, 5, 6];


combinedArray = [...arr1, ...arr2];
console.log(combinedArray);

