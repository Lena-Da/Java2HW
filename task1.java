//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.util.logging.*;

public class task1 {
    



    public static void sort(int[] arr){
        Logger logger = Logger.getLogger(task1.class.getName());
        logger.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);        
        for(int i=arr.length-1; i>0; i--){
            for (int j=0; j<i; j++){
                if (arr[j]>arr[j+1]){
                    logger.info("поменяли элемент с индекса " + j + " на индекс " + (j+1));
                    int count = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = count;
                }
            }
        }for (int i=0; i<arr.length;i++){
        System.out.print(arr[i]+ " ");
    }
    }

    public static void main(String[] args) {
        int[] arr = {6,5,2,8,1,3,4,-7};
        sort(arr);
    }


}