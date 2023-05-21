// 텍스트가 보여지는 기능
// 1. 몇 번째 사진에 마우스가 올라갔는지 확인(if문)
// 2. 해당 사진을 찾아 hideText class를 지워주고, showText는 삽입해줌
function showText(number) {
    if (number === 1) {
        document.querySelector("#desc1").classList.remove("hideText");
        document.querySelector("#desc1").classList.add("showText");
    } else if (number === 2) {
        document.querySelector("#desc2").classList.remove("hideText");
        document.querySelector("#desc2").classList.add("showText");
    } else {
        document.querySelector("#desc3").classList.remove("hideText");
        document.querySelector("#desc3").classList.add("showText");
    }
}

// 텍스트가 감춰지는 기능
// 1. 몇 번째 사진에서 마우스가 벗어났는지 확인(if문)
// 2. 해당 사진을 찾아 shotText class를 지워주고, hideText는 삽입해줌
function hideText(number) {
    if (number === 1) {
        document.querySelector("#desc1").classList.remove("showText");
        document.querySelector("#desc1").classList.add("hideText");
    } else if (number === 2) {
        document.querySelector("#desc2").classList.remove("showText");
        document.querySelector("#desc2").classList.add("hideText");
    } else {
        document.querySelector("#desc3").classList.remove("showText");
        document.querySelector("#desc3").classList.add("hideText");
    }
}

// 클릭 기능
// 1. 선택된 사진의 숫자를 가진 텍스트를 alert 형태로 출력해줌
function alertText(number) {
    alert(`${number}번째 추억이에요! 눌러주셔서 감사합니다 :)`);
}