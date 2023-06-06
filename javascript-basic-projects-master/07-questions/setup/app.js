//using selectors inside the element
// traversing the dom
const btns=document.querySelectorAll(".question");
const plusicon=document.querySelector(".plus-icon")
const minusicon=document.querySelector(".minus-icon")
btns.forEach(function(btn){
    btn.addEventListener('click',function(e){
        const question=e.currentTarget;
        console.log(question);
        question.classList.toggle("show-text");
    })
})

// plusicon.addEventListener('click',function(){
//     question.classList.toggle("show-text")
// })
// minusicon.addEventListener('click',function(){
//     question.classList.toggle("show-text")
// })