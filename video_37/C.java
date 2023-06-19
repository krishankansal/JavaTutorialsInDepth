public class C {
    public static void main(String[] args) {
        String s = "hello";
        char c = s.charAt(4);
        System.out.println(s);
        System.out.println("Char at index 4 = " + c);
        String s1 = " you!!!";
        String s2 = s.concat(s1).concat(s1);
        System.out.println(s2);
        System.out.println(s2.toUpperCase());
        String s3 = " admin ";
        System.out.println(s3.strip());
        String s4 = "krishan.kansal@gmail.com  ";
        System.out.println(s4.indexOf('@'));
        if(s4.indexOf('@') == -1){
            System.out.println("Invalid email");
        }
        System.out.println(s4.strip().length());
    }
    
}
