// ****** SELECT ITEMS **********
const alert=document.querySelector('.alert');
const form=document.querySelector('.grocery-form');
const grocery=document.getElementById('grocery');
const submitBtn=document.querySelector('.submit-btn');
const container=document.querySelector('.grocery-container');
const list=document.querySelector(".grocery-list");
const clearBtn=document.querySelector('.clear-btn');
// edit option
let editElement;
let editFlag=false;
let editId="";
// ****** EVENT LISTENERS **********
form.addEventListener('submit',addItem)
// ****** FUNCTIONS **********
function addItem(e){
    e.preventDefault();
    const value=(grocery.value);
    const id=new Date().getTime().toString();
    if(value!=="" && editFlag===false){

    }
    else if(value!=="" && editFlag===true){
        
    }
    else{
        alert.textContent='empty value';
        alert.classList.add('alert-${action}');
    }
    function displayAlert(text,action){
        alert.textContent=text;
        alert.classList.add(`alert-${action}`);
    }
}
// ****** LOCAL STORAGE **********

// ****** SETUP ITEMS **********
