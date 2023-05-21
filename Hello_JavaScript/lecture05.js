var height = prompt("키를 입력해 주세요");
// prompt는 사용자가 입력한 것을 문자열로 돌려주기 때문에 입력을 숫자로 해도 타입은 string이다.
console.log(height, typeof (height));
// parseInt, parseFloat를 통하여 문자열을 숫자 타입으로 바꾸기.

var height_int = parseInt(height);
console.log(height_int, typeof (height_int));  
// height = 168.8 -> height_int = 168
// 정수부분 추출해서 number로 바꿔준다.
// number

var height_float = parseFloat(height);
console.log(height_float, typeof (height_float));
// height = 168.8 -> height_float = 168.8
// 실수로 바꿔주는 것이기 때문에 그대로 온다.
// number

// 여기서 또 한 가지 알아둘 것!!
// height에 168.8입니다. 라고 해도
// height_int = 168
// height_float = 168.8

// height에 제 키는 163.5이었으면 좋겠습니다. 라고 적으면
// NaN을 보여준다. Not a Number 라는 뜻이다.
// parseInt, parseFloat의 경우 문자열의 시작부분부터 숫자로 인식할 수 있는 것을 인식하기 때문에 동작하지 않는 것.

// Nan은 정상적이지 않는 숫자
// Infinity는 표현할 수 없는 범위의 수. ex. 1/0
