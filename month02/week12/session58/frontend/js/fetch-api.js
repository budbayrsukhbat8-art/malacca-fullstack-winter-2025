console.log('JS Fetch API');

const mainElement = document.getElementById('main');


const request = fetch("https://dummyjson.com/products");
console.log(request);
const response = request.then((data) => data.json());
console.log(response);
response.then((data)=> {
    console.log(data);
    const { products } = data;
    console.log(products);
    products.forEach((product) => {
        const productTitle = document.createElement('h2');
        productTitle.textContent = product.title;
        mainElement.appendChild(productTitle);
        const productimage = document.createElement('div');
        productimage.innerHTML = `<img class= img src="${product.images[0]}" alt=""> </img>`
        mainElement.appendChild(productimage);
        
        productimage.style.width = '150px'
        productimage.style.height = 'auto'
        mainElement.appendChild(productimage);

    })
})