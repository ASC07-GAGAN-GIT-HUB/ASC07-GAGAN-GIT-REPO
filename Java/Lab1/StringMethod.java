public class StringMethod {
    public static void main(String[] args) {
        String s = "   Hello World  ";

        System.out.println("charAt(1): " + s.charAt(1));
        System.out.println("contains 'World': " + s.contains("World"));
        System.out.println("length: " + s.length());
        System.out.println("indexOf 'o': " + s.indexOf('o'));
        System.out.println("equals 'hello world': " + s.equals("hello world"));
        System.out.println("equalsIgnoreCase 'hello world': " + s.equalsIgnoreCase("hello world"));
        System.out.println("join: " + String.join("-", "Java", "is", "fun"));
        System.out.println("lastIndexOf 'l': " + s.lastIndexOf('l'));
        System.out.println("substring(2, 7): " + s.substring(2, 7));
        System.out.println("toLowerCase: " + s.toLowerCase());
        System.out.println("toUpperCase: " + s.toUpperCase());
        System.out.println("trim: '" + s.trim() + " ");
    }
}