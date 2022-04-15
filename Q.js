// let array = [1,2,3,4,5,6,7];  

// array.reverse();              
// console.log(array);          



let n = 123;
let r;
let rev=0;


while (n > 0) {
  r = n % 10;
  rev = rev * 10 + r;
  n = parseInt(n / 10)
}
console.log(rev);