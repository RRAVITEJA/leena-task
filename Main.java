package com.leena;

public class Main {

    public static void main(String[] args) {
        //printReversed
        String[][] inputOne = {
                {"Lorem", "ipsum" , "dolor" , "sit" , "amet", "consectetur"},
                {"Cras",   "tristique", "luctus", "orci", "adipiscing" ,"egestas"},
                {"sit", "amet", "auctor" ,"mauris" ,"suscipit", "vestibulum"}
        };
        printReversed(inputOne);

        //makeCopy
        int[][] inputTwo ={{2,4,7,3,61,1},
                {5,16,3,52,0,34},
                {5,4,7,6,8,9}};
        int[][] inputTwoReference =  makeCopy(inputTwo);

        //verify makeCopy
        for(int i = 0; i< inputTwoReference.length; i++){
            for(int j = 0; j< inputTwoReference[0].length; j++){
                System.out.print(inputTwoReference[i][j]+" ");
            }
            System.out.println();
        }
    }
    //printReversed
    public static void printReversed(String[][] input){
        for(int i = input.length -1; i >= 0; i--) {
            for(int j = input[0].length -1; j>=0; j--) {
                System.out.print( input[i][j] +" ");
            }
            System.out.println();
        }
    }

    //makeCopy
    public static int[][] makeCopy(int[][] input){
        int[][] result = new int[input.length][input[0].length];

        for(int i = 0; i< input.length; i++){
            for(int j = 0; j< input[0].length; j++){
                result[i][j] = input[i][j];
            }
        }
        return result;
    }
}
