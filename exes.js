let str = "Sadiq Basha Is From Chennai City";
let str1 = str.replaceAll(" ","$");
// let strn = str1.split("");
let nstr = "";
console.log(str1);
for (let i = 0; i < str1.length; i++) {
    if (i%2===0) {
        nstr += str1[i].toUpperCase();
    } else {
        nstr += str1[i].toLowerCase();
    }
}
let rstr = nstr.replaceAll("$"," ")
console.log(rstr);
