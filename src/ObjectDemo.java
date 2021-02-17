class Calc{
    int num1;
    int num2;
    int result;
    public Calc(int a, int b)
    {
        num1=a;
        num2=b;

        result = num1+num2;
    }

}

public class ObjectDemo {
    public static void main(String[] args) {
        Calc obj1 = new Calc(6,7);
        obj1.num1 =3;
        obj1.num2 =4;



        System.out.println(obj1.result);


    }
}
