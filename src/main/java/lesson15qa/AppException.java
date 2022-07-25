package lesson15qa;

public class AppException {
    public static void main(String[] args) {
        int a=0;
        int b=5;
        int[] arr = {1,3};
        System.out.println("Execute before exception");

        try {
         int c = b/a;

        } catch(ArithmeticException e){
           System.out.println(e.getMessage());
        }
        try {
            arr[9]=9;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Out of bound exception");
        }
        finally{
            System.out.println("close all connections");
        }
       System.out.println("Execute after exception");



        int t =9;
        int div  =0;
        int [] xx = {1,2};
        System.out.println("before exception ");
        try{
            System.out.println("try devide on zero");
            int res = t/0;
            System.out.println("tag after execute wrong code");
        } catch(ArithmeticException e){
            System.out.println("not devide by zero");
            System.out.println(e.getMessage());

        }
        System.out.println("after exception ");
        try{
            xx [9] = 2;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Program executed and close all connections");
        }

    }






}

