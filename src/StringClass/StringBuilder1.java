package StringClass;

public class StringBuilder1 {
	public static void main(String args[]) {
	StringBuilder sb = new StringBuilder("Nishant");
	System.out.println(sb);
	System.out.println(sb.charAt(0)); //Char at index 0
	sb.setCharAt(0,'P'); //Char at index 0
	System.out.println(sb);
	sb.insert(0,'D'); //Insert at 0 th index
	System.out.println(sb);
	sb.delete(2, 4); //Will deleted 2 and 3 and it don't include 4th
	System.out.println(sb);
	sb.append("nnn");//will append at last
	System.out.println(sb);
	System.out.println(sb.length());

	}
}