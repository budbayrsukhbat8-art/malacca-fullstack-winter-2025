console.log('Javascript Promise');
 
const myPromise = new Promise((resolve, reject) => {
if (myState) {
resolve ("Success");
} else {
    reject ("Error");
}
});

console.log(myPromise);


myPromise
   .then((data)=> {
    console.log(data);
   }) 
   .catch((error) =>{
    console.log(error);
   });

 const myState = true;
 const myColor = new Promise ((resolve, reject) => {
    if (myState) {
        resolve ("Green");
    } else {
        reject ("Red");
    }
 });
 console.log(myColor);

 myColor
 .then((data) => {
    console.log(data);
 })
 .catch((error) => {
    console.log(error);
 });

 // Ex02
 const delayedReward = new Promise((resolve, reject) =>{
    setTimeout (() => {
        setTimeout(() => {
            resolve ('42');
        }, 2000);
    })
 })

  delayedReward.then((data) => console.log(data));

  //Ex03
const myNumber = 15;
  const guessNumber = new Promise((resolve, reject) =>{
    if(myNumber > 10) {
        resolve ("Success");
     } else {
        reject ('Number too small!');

        
    }
  });
  guessNumber
  .then((data) => console.log(data))
  .catch((error) => console.error(error));

  // Ex04
  console.log(Math.random());
  const flipCoin = new Promise((resolve, reject) => {
    const result = Math.random();
        if (Math.random() > 0.5) {
            resolve ('Head!');
        }  else {
            reject ('Tails');
        }
  });

