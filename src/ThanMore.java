import java.math.BigInteger;

/*
Задача сравнить 100! и 2 в степени 200.
Сделал с передачей параметров в метод для того, чтоб легко было переделать программу, если потребуется
вводить числа с консоли.
 */

public class ThanMore {
    public static void main(String[] args) {
        int pow = 200;
        int fact = 100;
        if (twoToPow(pow).compareTo(fact(fact))==1){
            System.out.println("2 в степени "+ pow + " больше чем "+fact+"!");
        }  else if (twoToPow(pow).compareTo(fact(fact))==-1){
            System.out.println(fact+"! , больше, чем " + "2 в степени "+ pow);
        } else {
            System.out.println("Числа равны.");
        }


        //System.out.println(twoToPow(3));
        //System.out.println(fact(30));
    }

    public static BigInteger twoToPow(int n){
      //  int result = 1;
        BigInteger result = new BigInteger("1");
        BigInteger num = new BigInteger("2");
        for(int i=0; i<n; i++){
              result =result.multiply(num);
        }
        return result;
    }

    public static BigInteger fact(int n){
        BigInteger result = new BigInteger("1");
        BigInteger num = new BigInteger("1");
        BigInteger one = new BigInteger("1");
        for (int i=0; i<n; i++ ){
            result=result.multiply(num);
            num=num.add(one);
        }
        return result;
    }

}
