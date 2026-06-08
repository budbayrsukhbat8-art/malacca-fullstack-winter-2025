const result = document.getElementById('result');


const myForm = document.querySelector('#my-form');
console.log(myForm);

const firstName = document.querySelector('#first-name');
const lastName = document.querySelector('#last-name');
const email = document.querySelector('#email');


myForm.addEventListener('submit', (e) =>{
    const myName = '${firstName.value}';
    consttextArea = document.querySelector(".text")
    console.log(e);
    e.preventDefault();
    result.innerHTML =`
    <div class="info">
    <h3>${firstName.value}</h3>
    <h4>${lastName.value}</h4>
    <p>${email.value}</p>
    </div>
    `;
    firstName.value = "";
    lastName.value = "";
    email.value = "";
})
const japaneseFood = document.querySelector('.japanese');
console.log(japaneseFood);
// TODO: энд кодоо бичнэ үү

const box = document.querySelector("#box");
const btn = document.querySelector("#ButtonRed");

btn.addEventListener("click", function() {
    box.classList.toggle("red-box");
    // TODO: classList.toggle ашиглан улаан/хөх солих
});



