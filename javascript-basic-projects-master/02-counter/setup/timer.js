let count=60;
const value=document.querySelector("#value");
const btns=document.querySelectorAll(".btn");
let a,b;
function setzero(){
    clearInterval(b);
     a=setInterval(function(){
        count--;
        value.textContent=count;
        (count>60)?value.style.color="green":value.style.color="red"
        if(count===0){
            stop();
        }
    },1000);

}
function stop(){
    clearInterval(a);
    b=setInterval(function(){
        count++;
        value.textContent=count;
        (count>1)?value.style.color="green":value.style.color="red"
        if(count===60){
            
            clearInterval(a);
            setzero();
        }
    },1000);

}
btns.forEach(function(btn){
    btn.addEventListener("click",function(e){
        const styles=e.currentTarget.textContent;
        console.log(styles)
        if(styles.includes("decrease")){
            count--;
            
        }
        if(styles.includes("increase")){
            count++;
            
        }
        if(styles.includes("START")){
            setzero();
            
        }
        if(styles.includes("STOP")){
            stop();
            
        }
        if(styles.includes("reset")){
            count=0;
            value.style.color="black"
        }
        (count>0)?value.style.color="green":value.style.color="red"
        value.textContent=count;
    }) 
})
