// Element.getBoundingClientRect() method returns the size of an element and its position relative to the viewport.
// pageYOffset is a read - only window property that returns the number of pixels the document has been scrolled vertically.
// slice extracts a section of a string without modifying original string
//offsetTop - A Number, representing the top position of the element, in pixels

// ********** set date ************

// ********** close links ************

// ********** fixed navbar ************
const linksContainer=document.querySelector('.links-container');
const navbar=document.querySelector('#nav');
const toplink=document.querySelector(".top-link");
window.addEventListener('scroll',function(){
    const scrollHeight=window.pageYOffset;
    if(window.pageYOffset!==0){
        navbar.classList.add('fixed-nav');
    }
    else{
        navbar.classList.remove('fixed-nav');
    }
    if(scrollHeight>500)
    {
        toplink.classList.add('show-Link');
    }
    else{
        toplink.classList.remove('show-link');
    }
    console.log(window.pageYOffset);
})
// ********** smooth scroll ************
const scrollLinks=document.querySelectorAll(".scroll-link");

// select links
const date=document.getElementById('date');
date.innerHTML=new Date().getFullYear();
const navToggle=document.querySelector('.nav-toggle');

const links=document.querySelector('.links');

navToggle.addEventListener('click',function(){
    
    const containerHeight=linksContainer.getBoundingClientRect().height;
    const linksHeight=links.getBoundingClientRect().height;
    console.log(containerHeight);
    console.log(linksHeight);
    console.log(linksContainer.getBoundingClientRect())
 
    if(containerHeight===0){
        linksContainer.style.height=`${linksHeight}px`;
    }
    else{
        linksContainer.style.height=0;
    }
    // linksContainer.classList.toggle('show-links');
})

scrollLinks.forEach(function(link){
    link.addEventListener('click',function(e){
        // e.preventDefault();
        const id=e.currentTarget.getAttribute('href').slice(1);
        console.log(id);
        const element=document.getElementById(id);
        let position=element.offsetTop;
        window.scrollTo({
            left:0,
            top:position,
        });
        linksContainer.style.height=0;
    })
    
})