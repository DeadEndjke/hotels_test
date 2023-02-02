import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
//        String[] cities = {"Moscow", "Saint-Peterburg","Novosibirsk"};
//        System.out.println(getCitiesFromArray(cities));

//        System.out.println(getRoundingTo5(41.7f));


//        for(int i = 0; i < 100; ++i){
//            System.out.println(getPadezh(i));
//        }

//        for(int i = 0; i < 100; ++i){
//            System.out.println(i + " " + isNumSimple(i));
//        }


//        int[] arr1 = {7, 17, 1, 9, 1, 17, 56, 56, 23}, arr2 = {56, 17, 17, 1, 23, 34, 23, 1, 8, 1};
//
//
//        System.out.println(getRepeats(arr1, arr2));

//        printMultiplicationTable(5);



    }
    
    public static String getCitiesFromArray(String[] cities){ //task1 ~7 min
        String citiesStr = "";

        for(int i = 0; i < cities.length; ++i){
            if(i == cities.length - 1){
                citiesStr+=cities[i]+".";
            }else{
                citiesStr+=cities[i]+", ";
            }
        }

        return citiesStr;
    }

    public static int getRoundingTo5(float num){ //task2 ~10 min
        if(num % 5 >= 2.5){
            num = 6 * ((num - num % 5) /5);
        }else{
            num = 5 * ((num - num % 5) /5);
        }
        return (int) num;

    }

    public static String getPadezh(int num){ //task3 ~20 min
        String[] arr = {" компьютер", " компьютера", " компьютеров"};
        if(((num > 10) & (num < 15))||((num % 100 > 10)&(num % 100 < 15))){
            return num + arr[2];
        } else if (num % 10 == 1) {
            return num + arr[0];
        }else if(num % 10 > 1 && num % 10 < 5){
            return num + arr[1];
        }else if((num % 10 >= 5)||(num % 10 == 0)){
            return num + arr[2];
        }
        return "";
    }

    public static boolean isNumSimple(int num){ //task4 ~5 min
        boolean isSimple = true;
        if((num == 1)||(num == 0)){
            return false;
        } else if (num == 2) {
            return true;
        }

        for(int i = 2; i < num; ++i){
            if(num % i == 0){
                return false;
            }
        }
        return isSimple;
    }

    public static ArrayList<Integer> getRepeats(int[] arr1, int[] arr2){//task 5 ~7 min
        ArrayList<Integer> finalList = new ArrayList<>();
        ArrayList<Integer> repeats1 = new ArrayList<>();
        ArrayList<Integer> repeats2 = new ArrayList<>();

        for(int i = 0; i < arr1.length; i++){
            for(int j = i + 1; j < arr1.length; j++){
                if ((arr1[i] == arr1[j]) && (!repeats1.contains(arr1[i]))){
                    repeats1.add(arr1[i]);
                }
            }
        }

        for(int i = 0; i < arr2.length; i++){
            for(int j = i + 1; j < arr2.length; j++){
                if ((arr2[i] == arr2[j])&& (!repeats2.contains(arr2[i]))){
                    repeats2.add(arr2[i]);
                }
            }
        }

        for(int i = 0; i < repeats1.size(); i++){
            for(int j = 0; j < repeats2.size(); j++){
                if(Objects.equals(repeats1.get(i), repeats2.get(j))){
                    finalList.add(repeats1.get(i));
                }
            }
        }

        return finalList;
    }

    public static void printMultiplicationTable(int num){ //task5 ~10 min
        int[][] table = new int[num + 1][num + 1];
        for(int i = 0; i <= num; ++i){
            table[0][i] = i;
            table[i][0] = i;

        }
        for(int i = 1; i <= num; ++i){
            for (int j = 1; j <= num; ++j){
                table[i][j] = i * j;
            }
        }

        for(int i = 0; i <= num; ++i){
            for (int j = 0; j <= num; ++j){
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
    }

    
    
}