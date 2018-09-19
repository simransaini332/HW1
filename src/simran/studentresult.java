package simran;
import java.io.*;
import java.util.Scanner;
import java.io.FileWriter;
public class studentresult {
	public static void main(String[] args) throws IOException
	{
		int c=0;
		File file= new File("C:\\Users\\hp\\Desktop\\HW1-data.txt");
		Scanner sc=new Scanner(file);
		while(sc.hasNextLine())
		{c++;
	     sc.nextLine();		
		}
		System.out.println("\ntotal number of lines="+(c));
		sc.close();
		File file1= new File("C:\\Users\\hp\\Desktop\\HW1-data.txt");
		Scanner sc1=new Scanner(file1);
		studentdata student[]=new studentdata[c];
		for( int i=0; i<student.length; i++) {
			student[i]=new studentdata();
			}
		for(int i=0;i<student.length;i++)
		{String data="";
		 data=sc1.nextLine();
		 student[i].getdata(data);
		}
		FileWriter fw = new FileWriter("C:\\Users\\hp\\Desktop\\data.txt");
		fw.write("stdnt id Ex           Assignments          Tot   Mi   Fin   Cl  Pts   Pct  Gr  \n");
		for(int i=0;i<c;i++)
		{
		fw.write(System.getProperty( "line.separator" ));
		fw.write(student[i].id);
		fw.write("  ");
		fw.write(String.valueOf(student[i].labexmarks));
		fw.write(" ");
		for(int j=0;j<10;j++)
		{   if(student[i].ass[j]<10)
			fw.write(" ");
			fw.write(String.valueOf(student[i].ass[j]));
			fw.write(" ");
		}
		fw.write("  ");
		fw.write(String.valueOf(student[i].totalass));
		fw.write("   ");
		fw.write(String.valueOf(student[i].midterm));
		fw.write("   ");
		fw.write(String.valueOf(student[i].finalexam));
		fw.write("   ");
		fw.write(String.valueOf(student[i].cred));
		fw.write("   ");
		fw.write(String.valueOf(student[i].totalmarks));
		fw.write("   ");
		fw.write(String.valueOf(student[i].percent));
		fw.write("   ");
		fw.write(String.valueOf(student[i].grade));
		}
		int avgpercent=0,maxpt=0;
		for(int i=0;i<student.length;i++)
		{if(student[i].totalmarks>maxpt)
			maxpt=student[i].totalmarks;
		avgpercent+=student[i].percent;	
		}
		avgpercent=(avgpercent/c);
		fw.write(System.getProperty( "line.separator" ));
		fw.write("average percent=");
		fw.write(String.valueOf(avgpercent));
		int numberA=0,numberB=0,numberC=0,numberD=0,numberE=0,numberF=0;
		for(int i=0;i<c;i++)
		{
		 if(student[i].grade=='A')
			 numberA++;
		 if(student[i].grade=='B')
			 numberB++;
		 if(student[i].grade=='C')
			 numberC++;
		 if(student[i].grade=='D')
			 numberD++;
		 if(student[i].grade=='E')
			 numberE++;
		 if(student[i].grade=='F')
			 numberF++;
		}
		fw.write(System.getProperty( "line.separator" ));
		fw.write("number of A=");
		fw.write(String.valueOf(numberA));
		fw.write(System.getProperty( "line.separator" ));
		fw.write("number of B=");
		fw.write(String.valueOf(numberB));
		fw.write(System.getProperty( "line.separator" ));
		fw.write("number of C=");
		fw.write(String.valueOf(numberC));
		fw.write(System.getProperty( "line.separator" ));
		fw.write("number of D=");
		fw.write(String.valueOf(numberD));
		fw.write(System.getProperty( "line.separator" ));
		fw.write("number of E=");
		fw.write(String.valueOf(numberE));
		fw.write(System.getProperty( "line.separator" ));
		fw.write("number of F=");
		fw.write(String.valueOf(numberF));
		fw.write(System.getProperty( "line.separator" ));
		fw.write("Maximum marks scored=");
		fw.write(String.valueOf(maxpt));
	fw.close();
	sc1.close();
		
	}

}
