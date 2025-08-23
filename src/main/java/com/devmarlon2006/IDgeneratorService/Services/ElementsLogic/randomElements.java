package com.devmarlon2006.IDgeneratorService.Services.ElementsLogic;

import java.util.Random;



/*
Lógica da geração do ID.
Para modificação de qualquer elemento basta alterar o método que está associado ao caracter do ID.
Atenção⚠️ - Alguns métodos estão associados a mais de um caracter.
 */

public class randomElements {

    //By Name
    public static char  elementRandom(String name){

        if (name == null){
            return 'E';
        }

        Random random0 = new Random();

        int randomIndex = random0.nextInt(name.length());


        return name.charAt(randomIndex);
    }

    static int elementRa1(){

        Random random1 = new Random();

        return random1.nextInt(9);
    }

    static int elementRa2(){
        Random random2 = new Random();

        return random2.nextInt(9);
    }

    public static String element2Con(int number, String name){

        if (number < 0 || name == null){
            return "R";
        }


        int result;

        do{


            result = elementRa1() + elementRa2();


        }while (result > number );


        return Integer.toString( result );

    }

    public static String elementRandom3(String username){

        if (username == null){
            return "O";
        }

        int name = username.length() ;

        if (name > 9){
            return "9";
        }else{
            return Integer.toString( name );
        }

    }

    //By Age
    public static String elementRandom4(int age){

        if (age < 0){
            return "7";
        }

        Random random5 =  new Random();
        
        double res;


        do{
            if (age >= 25){
                res = Math.pow(age,1.5) - random5.nextInt(10) + 34 * 0.1 / random5.nextInt(5);
            }else{
                res = Math.pow(age,2) - random5.nextInt(10) + 34 * 0.1 / 10;
            }

        }while ( res <= 9);

        return Integer.toString( (int) res );

    }

    public static String elementRandom5(int age){

        if (age < 0){
            return "7";
        }

        Random random = new Random();
        double res;

        do{
            if (age >= 50){
                res = age * 2 / random.nextDouble(0.9) * random.nextDouble(0.9);
            }else{
                res = age / random.nextDouble(0.9) * random.nextDouble(0.9);
            }

        }while(res >= 9);


        return Integer.toString( (int) res );
    }

    public static Character elementRandom6(int age){

        return  Integer.toString( age ).charAt( 0 ) ;

    }

    public static Character elementRandom7(int age) {

        if (age < 0){
            return '0';
        }

        Random random = new Random();
        String character;
        char result;

        character = "ABCDEFGHIJKLMNOPKRSTUVWXWZabcdefghijklmnopqrstuvwxyz123456789";
        result = character.charAt( random.nextInt( 60 ) );

        return result;
    }

    //By State
    public static Character elementRandom8(String State, int index){

        if (State == null){
            return 'E';
        }

        return State.toUpperCase().charAt( index );
    }

    public static String elementRandom9(String State){

        if (State == null){
            return "0";
        }

        Random random = new Random();
        int at;

        do{

           at = (int) (State.length() * random.nextDouble( 0.5 ));

        }while (at > 5);



        return Integer.toString( at );
    }

    public static Character elementRandom10(String State){

        if (State == null){
            return 'E';
        }

        return Integer.toString( State.length() -1 ).charAt( 0 );
    }

    //By Country
    public static String elementRandom11(String country){
        if (country == null){
            return "0";
        }

        String result = country.toUpperCase();
        char result2 = result.charAt( 0 );
        return Character.toString( result2 );

    }


    public static String elementRadom12(String country){

        if (country == null){
            return "0";
        }

        int ele = country.length() % 10;
        char el2 =  Integer.toString( ele ).charAt( 0 );

        return Character.toString( el2 );
    }

    public static Character elementRadom13(String country){

        if (country == null){
            return 'E';
        }

        int ele = country.length();
        int ele4;


        if (ele > 9){
            int ele3 = Integer.toString( ele ).charAt( 0 );
            int ele2 = Integer.toString( ele ).charAt( 1 );
            ele4 = ele3 + ele2;
            return Integer.toString( ele4 ).charAt( 0 );
        }else {
            return Integer.toString( ele ).charAt( 0 );
        }

    }

    public static Character elementRadom14(String country){

        return country.toUpperCase().charAt( country.length() - 1 );
    }

    //By All
    public static Character elementRadom15(String name){
        int tamanhoNome = name.length();

        int resultado;

        if (tamanhoNome == 0) {
            resultado = 0;
        } else {
            resultado = (tamanhoNome - 1) % 9 + 1;
        }


        return Integer.toString( resultado ).charAt( 0 );
    }

    public static Character elementRadom16(Integer age){

        if (age == null){
            return  'N';
        }

        int result = age % 10;
        return Integer.toString( result ).charAt( 0 );

    }

    public static Character elementRadom17(String state){


        if (state == null){
            return 'E';
        }

        int srt = state.length() * state.length() % 10;

        return Integer.toString( srt ).charAt( 0 );
    }

    public static Character elementRadom18(String country){

        if (country == null){
            return 'R';
        }

        return country.charAt( country.length() - 1 );
    }

}
