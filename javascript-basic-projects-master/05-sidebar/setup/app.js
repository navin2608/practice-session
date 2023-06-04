const togglebtn=document.querySelector(".sidebar-toggle");
const closebtn=document.querySelector(".close-btn");
const sidebar=document.querySelector(".sidebar");
togglebtn.addEventListener('click',function(){
    console.log(sidebar.classList);
    sidebar.classList.toggle("show-sidebar");
});
closebtn.addEventListener('click',function(){
    console.log(sidebar.classList);
    sidebar.classList.toggle("show-sidebar");
});