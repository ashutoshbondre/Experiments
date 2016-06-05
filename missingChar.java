public String missingChar(String str, int n) 
{
  StringBuilder sb= new StringBuilder();
 
 char [] c = str.toCharArray();
  
int length = c.length;
  
if(n!=0)
 
 {
    
	for(int i =0;i<n;i++)
  
	{
    sb.append(c[i]);
  
	}
 
 }
  

for(int i=n+1;i<=length-1;i++)
  
{
    sb.append(c[i]);
  }
 
 return sb.toString();

}

