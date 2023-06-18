public class C {
    public static void main(String[] args) {
        // String str = "JavaLanguage";
        // char c = str.charAt(4);
        // System.out.println(c);
        // System.out.println(str.charAt(4));
        // String fName = "Krishan";
        // String lName = "Kansal";
        // String fullName = fName.concat(" ").concat(lName);
        // // System.out.println(fullName);
        // System.out.println(fullName.toUpperCase());
        // System.out.println(fullName.toLowerCase());
        // String str1 = " admin ";
        // System.out.println(str1);
        // System.out.println(str1.length());
        // String str2 = str1.strip();
        // System.out.println(str2);
        // System.out.println(str2.length());

        // String str3 = " Admin ";
        // System.out.println(str3.strip().toLowerCase());

        String str4 = "krishan.kansal@gmail.com";
        int x = str4.indexOf('@');
        System.out.println(x);
        if (str4.indexOf('@') == -1) {
            System.out.println("Invalid email");
        }
    }
}
