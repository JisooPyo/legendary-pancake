var empty_obj = {};
console.log(typeof(empty_obj));
// object : number, string, boolean의 단순 자료형보다 더 복잡한 자료를 표현할 때 사용

// 1과 2줄 사이 중간에 한 줄을 띄우니까 console창에 뜨지 않는다. 참고.

// 객체란? 속성(Property)의 집합. 중괄호를 사용해 정의 가능.
// ex. 사람의 속성 >> 이름, 나이, 키와 같은 정보

// property(속성) 정의하기
// { name1:value1, name2:value2, name3:value3, ... }
var man = { name:"홍길동", age:20, height:180 };
console.log(man)

// 객체의 속성에 접근하는 법
// 객체 이름 뒤에 점을 사용하고 속성 이름에 접근할 수 있다.
// 객체 이름 뒤에 대괄호 안에 속성 이름을 문자열로 접근할 수 있다.

// 객체의 속성의 값을 변경하는 법
// 객체 속성에 접근해서 변수에 값을 저장하듯이 사용.

console.log(man.name);
console.log(man["name"]);

man["name"]="고길동";
man.age=30;
man.height=160;
console.log(man);

