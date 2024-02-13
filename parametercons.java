public class parametercons {

        int id;
        String name;
        //creating a parameterized constructor
        parametercons(int i,String n){
            id = i;
            name = n;
        }
        //method to display the values
        void display(){System.out.println(id+" "+name);}

        public static void main(String args[]){
            //creating objects and passing values
            parametercons s1 = new parametercons(111,"Karan");
            parametercons s2 = new parametercons(222,"Aryan");
            //calling method to display the values of object
            s1.display();
            s2.display();
        }
    }
