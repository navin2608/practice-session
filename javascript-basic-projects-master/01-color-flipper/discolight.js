let colorcombos=[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, "A", "B", "C", "D", "E", "F"];
let hexColor="#";
function getdiscolightcolors(){
    hexColor="#";
    for(let i=0;i<6;i++){
            hexColor+=colorcombos[Math.floor(Math.random()*colorcombos.length)]
            
    }
    document.body.style.backgroundColor=hexColor;
}
setInterval(getdiscolightcolors,100)
