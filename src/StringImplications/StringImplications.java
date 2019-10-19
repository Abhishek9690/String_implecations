package StringImplications;

public class StringImplications {
        void fun(){
            String s1="abhishek";
            System.out.println("original string");
            System.out.println(s1);
            String s2=s1.toUpperCase();         //upperCase method
            System.out.println("converts into uppercase");
            System.out.println(s2);
            System.out.println("converts into lowercase");
            String s3=s1.toLowerCase();             //lowercase
            System.out.println(s3);
            System.out.println(s1.length());            //length
            String s4=s1.trim();                        //trim
            System.out.println(s4);
            String s5=s1.replace('a','A');              //replace
            System.out.println(s5);
            boolean a=s1.equals(s2);
            System.out.println(a);
            boolean b=s1.equalsIgnoreCase(s2);
            System.out.println(b);
            System.out.println(s1.compareTo(s3));
            System.out.println(s1.compareToIgnoreCase(s2));
            System.out.println(s1.concat(s2));
            System.out.println(s1.substring(2));
            System.out.println(s1.charAt(3));
            System.out.println(s1.indexOf('t'));
        }

    public static void main(String[] args) {
        StringImplications obj=new StringImplications();
        obj.fun();
    }
}
