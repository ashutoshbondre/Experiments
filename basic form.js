function check()
{
  var e1=document.getElementById("email1");
  var e2=document.getElementById("email2");
  if( e1.value != e2.value)
    {
      alert("The two IDs dont match");
      return false;
    }
}
