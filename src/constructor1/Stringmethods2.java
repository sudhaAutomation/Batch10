package constructor1;

public class Stringmethods2 {

	public static void main(String[] args) {
		String name="Swhizz";//only scp
		String nm=new String("test");//test will be stored in teh heap memory as well as scp
		System.out.println(name.length());//6
		System.out.println(name.charAt(4));//z
		System.out.println(name.charAt(0));//S
		System.out.println(name.charAt(3));//i
		System.out.println(name.indexOf('i'));//3
		System.out.println(name.indexOf(name));//0
		
		String str="good moring madhapur good evening 1  ";
		String str2="good moring madhapur good evening";
		System.out.println(str.indexOf('m', 6));
		System.out.println(str.indexOf('g', 15));//imp:what is the default value for the indesxOf(); 
System.out.println(str.indexOf('g',0));//0...first occurence of g
System.out.println(str.indexOf('g',1));//10..2nd ccurence of g
System.out.println(str.indexOf('g', str.indexOf('g',0)+1));//10..2nd ccurence of g
System.out.println(str.indexOf('g', str.indexOf('g', str.indexOf('g',0)+1)+1));//10..3rd ccurence of g
String date="01/01/2022";
System.out.println(date.replace("/", "-"));
System.out.println(str.toUpperCase());
String str1="GOOD MORING MADHAPUR GOOD EVENING";
System.out.println(str1.toLowerCase());
System.out.println(str.equals(str1));//false
System.out.println(str.equalsIgnoreCase(str1));//true
System.out.println(str.substring(4));
System.out.println(str.compareTo(str2));//0
System.out.println(str.contains("good m"));//true
System.out.println(str.trim());

String s[]=str.split(" ");
System.out.println(s.length);
for (int i = 0; i < s.length; i++) {
	System.out.println(s[i]);
}
int k =100;
int j=200;
System.out.println(k+j);//300
System.out.println(str+k+j);//good moring madhapur good evening 1 100200 
System.out.println(k+j+str);//300good moring madhapur good evening 1 
	}

}
