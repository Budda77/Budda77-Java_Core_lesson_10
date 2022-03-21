package ua.lviv.lgs;

public class StringBuilder {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Start");
		
		System.out.println(sb.append(" lesson").append(" number ").append("five"));
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.indexOf("number", 0));
		System.out.println(sb.lastIndexOf("e"));
		System.out.println(sb.delete(6, 13));
		System.out.println(sb.deleteCharAt(0));
		System.out.println(sb.insert(0, "Flow s"));
		System.out.println(sb.reverse());

	}

}
