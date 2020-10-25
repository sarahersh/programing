import java.util.*;


public class sara{

public static void main(String[]args){

Scanner s=new Scanner(System.in);
System.out.println("tekray zhmaray 7arfakat dyari bka ");
int a=s.nextInt();
           char []f=new char[a];
       for(int i=0;i<a;i++){


	System.out.println("pet"+f[i]);
	f[i]=s.next().charAt(0);


}
   String naw="";
    for(int i=0;i<a;i++){
	     naw+=f[i];
}
       System.out.println("naw:"+naw);
}
}

