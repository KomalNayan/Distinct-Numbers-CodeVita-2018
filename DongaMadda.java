import java.util.*;
public class DongaMadda{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String[] alpha = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		String s = sc.nextLine();
		int[] count = new int[26];
		count[alpha[s.charAt(0)-'0'-2].charAt(0)-'a'] = 1;
		for(int i=1;i<s.length();i++){
			count[alpha[s.charAt(i)-'0'-2].charAt(0)-'a'] = 1;
			if((s.charAt(i-1)-'0')%alpha[s.charAt(i)-'0'-2].length()-1>=0)
				count[alpha[s.charAt(i)-'0'-2].charAt(((s.charAt(i-1)-'0')%alpha[s.charAt(i)-'0'-2].length())-1)-'a'] = 1;
			else
				count[alpha[s.charAt(i)-'0'-2].charAt(alpha[s.charAt(i)-'0'-2].length()-1)-'a'] = 1;
		}
		int res = 0;
		for(int i=0;i<26;i++){
			if(count[i]==1){
				res++;
			}
		}
		System.out.println(res);
	}
}