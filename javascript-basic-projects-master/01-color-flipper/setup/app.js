const colors = ["green", "red", "rgba(133,122,200)", "#f15025"];
const btn=document.getElementById('btn');
const color=document.querySelector(".color");
btn.addEventListener('click',function(){
    //get random number between 0-3 colors[1]
    const randomNumber=1;
    document.body.style.backgroundColor=colors[getRandomNumber()];
    color.textContent=colors[getRandomNumber()];
})

function getRandomNumber(){
    return Math.floor(Math.random()*colors.length);
}