package threading;

public class add {
    public static void main(String[] args){
        int a =10;
           int b =20 ;
        int c = add(a,b) ;
        System.out.println(c);
        System.out.println(c);

    }

public static int add(int a,int b){
        return a+b;
}
}

//method overloading