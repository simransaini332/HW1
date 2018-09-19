package simran;
//import java.lang.Math ;
public class studentdata {
	String id="";
	int labexmarks=0;
	int ass[];
	int totalass=0;
	int midterm=0;
	int finalexam=0;
	int cred=0;
	int totalmarks=0;
	int percent=0;
	char grade=' ';
	studentdata()
	{
		
	}
	int getdata(String data)
	{
	 ass=new int[10];
	 id=data.substring(0,7);
	 labexmarks=Integer.valueOf(data.substring(9,11));
	 int a=12,b=14;
	 for(int i=0;i<10;i++)
	 {
	  ass[i]=Integer.valueOf(data.substring(a,b));
	  a+=3;
	  b+=3;
	 }
	 midterm=Integer.valueOf(data.substring(42,44));
	 finalexam=Integer.valueOf(data.substring(46,48)); 
	 cred=Integer.valueOf(data.substring(50));  
	 totalass=0;
	 for(int i=0;i<10;i++)
	 {
	  totalass=totalass+ass[i];	 
	 }
	 totalmarks=labexmarks+totalass+midterm+finalexam+cred; 
	 percent=((totalmarks*100)/420);
	 if(percent>=90)
		 grade='A';
	 else if(percent>=80)
	 grade='B';
	 else if(percent>=70)
		 grade='C';
	 else if(percent>=60)
		 grade='D';
	 else if(percent>=50)
		 grade='E';
	 else
		 grade='F';
	
	 return 0;
	}

}
