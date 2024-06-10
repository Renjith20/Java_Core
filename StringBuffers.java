public class StringBuffers {
    public static void main(String args[]){

        StringBuffer sb = new StringBuffer("Renjith");
        System.out.println(sb.capacity());
        System.out.println(sb.charAt(5));
        System.out.println(sb.append(" R P"));
        System.out.println("Length : " + sb.length());
        System.out.println(sb.insert(0, "Java "));
        
    }
}
