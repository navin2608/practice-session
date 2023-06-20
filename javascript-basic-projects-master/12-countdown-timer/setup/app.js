const months = [
  "January",
  "February",
  "March",
  "April",
  "May",
  "June",
  "July",
  "August",
  "September",
  "October",
  "November",
  "December",
];
const weekdays = [
  "Sunday",
  "Monday",
  "Tuesday",
  "Wednesday",
  "Thursday",
  "Friday",
  "Saturday",
];
const giveaway=document.querySelector('.giveaway');
const items=document.querySelectorAll(".deadline-format h4")

const currentDate = new Date();

// Add 10 days to the current date
//let futureDate = new Date(currentDate);

let tempDate = new Date();
let tempYear = tempDate.getFullYear();
let tempMonth = tempDate.getMonth();
let tempDay = tempDate.getDate();
// months are ZERO index based;
let futureDate = new Date(tempYear, tempMonth, tempDay + 10, 0, 0, 0);
futureDate.setDate(currentDate.getDate() + 10);

// Output the updated date
giveaway.innerHTML='giveaway ends on '+futureDate.toString().split(' ').slice(0,4).toString().replaceAll(','," ")



function getremainingTime(){
const oneday=24*60*60*1000;
const onehour=60*60*1000;
const onemin=60*1000;
let days= Math.floor((futureDate.getTime()-new Date().getTime())/oneday);
let hours= Math.floor(((futureDate.getTime()-new Date().getTime())%oneday)/onehour)
let mins= Math.floor(((futureDate.getTime()-new Date().getTime())%  onehour)/onemin)
let sec= Math.floor(((futureDate.getTime()-new Date().getTime())%onemin)/1000)
//console.log(days, hours, mins, sec);

// items[0].innerHTML=days;
// items[1].innerHTML=hours;
// items[2].innerHTML=mins;
// items[3].innerHTML=sec;
let values=[days,hours,mins,sec]
items.forEach(function(item,index){
 item.innerHTML=values[index];
})
}
let a=setInterval(getremainingTime,1000);