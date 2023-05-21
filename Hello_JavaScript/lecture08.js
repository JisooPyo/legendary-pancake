// undefined와 null -> 값이 없음을 표현한다.
var uninitialized_var;
var obj = { 
               x:1, y:2
          };

console.log("uninitialized_var :",uninitialized_var);   // undefined
console.log("obj.x :",obj.x);     // 1
console.log("obj.y :",obj.y);     // 2
console.log("obj.z :",obj.z);     // undefined
console.log("typeof(obj.z) :",typeof(obj.z));       // undefined

var null_var = null;
console.log("null_var :",null_var);     // null
console.log("typeof(null_var) :",typeof(null_var));     // object