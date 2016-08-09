package lesson4;

public class Task3_Recursiya2 {

	public static void main(String[] args) {
		
//rec(0,10);
//rec(0,0);
		System.out.println(sum(1,3));

	}
public static void  rec(int count, int x) {
System.out.print(count+" ");
if(count==x){
	
	return;
}
	rec(count+1, x);
	System.out.print(count);
	
	
}

public static int sum(int start, int end){
	
	if (start==end){
	//	int x =start;
		return end;
	}
int recRes = sum(start+1,end);
int res = start+recRes;
return res;
}
}