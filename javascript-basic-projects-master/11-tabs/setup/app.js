// const btns=document.querySelectorAll('.tab-btn');
const about=document.querySelector('.about');
const articles=document.querySelectorAll(".content");
const btncontainer=document.querySelectorAll('.btn-container');
btncontainer.forEach(function(btns){
btns.addEventListener('click',function(e){
    let tabbtns=document.getElementsByClassName("tab-btn")
for (var i = 0; i < tabbtns.length; i++) {
  tabbtns[i].classList.remove("active");
}
    e.target.classList.add('active');
    articles.forEach(function(article){
        if(article.id===e.target.dataset.id){
            article.classList.add('active');        }
        else{
            article.classList.remove('active');        }
        })})})