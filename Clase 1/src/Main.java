//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        String nombre = "carlos";
        int edad = 18;
        boolean Isvivo= true;
        char inicial = 'j';
        short number=1;
        long number2 = 1;
        byte number3= 1;

        numMayor();

        // System.out.printf("Hello soy "+ nombre + "tengo" + edad + "and welcome!");

    }
    //camelCase = sumarNumeros();
    //pascalCase = SumarNumeros;

    //snakeCase = Sumar_numeros();
    //kebabCase = suamr-numeros();

    public static void numMayor(){
        int num= 0;
        int num2= 0;
        int num3= 0;

        if(num==num2&&num2==num3){
            System.out.println("Todos los numeros son iguales");
        } else if (num>num2&&num>num3){
            System.out.println("el numero mayor es 1");
        } else if (num2>num3&&num2>num);{
            System.out.println("el numero mayor es 2");
        } else
        System.out.println("el numero mayor es 3");

    }
}
