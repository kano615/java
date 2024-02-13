import java.sql.SQLOutput;
public class staticmethod {
        int roll;
        String name;
        static String cname="geetanjali college";
    staticmethod(int a,String nm)
        {
            roll=a;
            name=nm;
        }
        static void display()
        {
            // System.out.println("roll no:"+roll+ " "+"name:"+name);
            System.out.println("college name is:"+cname);
        }
        void display1()
        {
            System.out.println("roll no:"+roll+ " "+"name:"+name);
            System.out.println("college name is:"+cname);

        }

        public static void main(String[] args)
        {
            staticmethod obj=new staticmethod(1,"kuldip");
            obj.display();
            obj.display1();

        }
    }

