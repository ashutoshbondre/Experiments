function message(msg)
{
  document.getElementById('text1').innerHTML=msg;
}

function DisplayDate()
{ 
  document.getElementById('p2').innerHTML=Date();
}

function MyOpen()
{
  x=document.getElementById("OpenClose");
  x.className="open";
}

function MyClose()
{
  x=document.getElementById("OpenClose");
  x.className="close";
}