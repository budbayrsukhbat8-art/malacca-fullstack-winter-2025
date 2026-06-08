console.log('Object Destructuring');

const product = {
    id: 1,
    name: "Smart Phone",
    price: 5000000,
    category: "Electonics",
    inStock: true,
};

console.log(product.id);
console.log(product.name);
console.log(product.category);

const productId = product.id;

const { id, name, price, category, inStock } = product;
console.log(id);

const user = {
    id: 1,
    name: "Khangaikhuu",
    age: 43,
};
const {id: userId, name: userName, age} = user;
console.log(userId);
console.log(userName);
