//Mohamed Eladl, Piyush Sharma, & Tejinder Mann


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;

public class Maze {
    public static void main(String[] args) throws FileNotFoundException {
        String fileStatus = "File Not Found!, Try Again";
        while("File Not Found!, Try Again".equals(fileStatus)){
            Scanner key = new Scanner(System.in);
            System.out.println("[+] Please Provide Maze File Name.......");
            String fileName = key.nextLine();

            File in = new File("src/" + fileName);
            if(in.canRead() == true){
                fileStatus = "File Found!";
                System.out.println(fileStatus);
                System.out.println();
                int[] info = new int[6];

                try{

                    Scanner sc = new Scanner(in);

                    int i = 0;

                    while(sc.hasNextInt()){
                        info[i] = sc.nextInt();
                        i++;
                    }


                    System.out.println("[+]Maze Matrix Details: ");
                    System.out.println();
                    findPath(sc, info[0], info[1], info[2],info[3],info[4],info[5]);

                }

                catch (FileNotFoundException e){
                    e.printStackTrace();
                }
            }
            else{
                System.out.println("File Not Found!, Try Again");
                System.out.println();
            }
        }

    }

    public static void findPath(Scanner maze, int rowSize, int colSize, int enterRow, int enterCol, int exitRow, int exitCol){
        
        char[][] maze_matrix = new char[rowSize][colSize];
        System.out.println("[+]Row Size: " + rowSize);
        System.out.println("[+]Column Size: " + colSize);
        System.out.println();
        String[] maze_line = new String[rowSize];
        storeRows(maze, maze_line);


        System.out.println("[+]Maze Lines:");
        for (int i = 0; i < maze_line.length ; i++) {
            System.out.println(maze_line[i]);
        }

        convToChar(maze_matrix, maze_line);
        
        printCharMaze(maze_matrix);
        solver(maze_matrix, enterRow, enterCol, exitRow, exitCol, rowSize, colSize);
        printCharMaze(maze_matrix);
    }
    public static void convToChar(char[][] maze_matrix, String[] maze_line){
        int i = 0;
        int j = 0;

        while(i < maze_line.length){
            while(j < maze_line[i].length()){
                maze_matrix[i][j] = maze_line[i].charAt(j);
                j++;
            }
            i++;
        }
    }

    public static void storeRows(Scanner maze, String[] maze_line){

        int i = 0;

        while(maze.hasNextLine() && i<maze_line.length){
            maze_line[i] = maze.nextLine();
            i++;
        }
    }

    public static void printCharMaze(char[][] maze_matrix){
        int i = 0;
        int j = 0;

        while(i < maze_matrix.length){
            while( j < maze_matrix[i].length){
                System.out.println(maze_matrix[i][j]);
                j++;
            }
            i++;
        }
    }

    public static void solver(char[][] maze_matrix, int enterRow, int enterCol, int exitRow, int exitCol, int rowSize, int colSize){
        Location loc = new Location(enterRow, enterCol);
        LocationQueue queue = new LocationQueue();

        queue.enQueue(loc);

        while (!queue.isEmpty()) {

            loc = queue.deQueue();
            maze_matrix[loc.getRow()][loc.getColumn()] = '.';

            if ((loc.getRow() == exitRow && loc.getColumn() == exitCol)) {

                break;

            }

            if (loc.getRow() + 1 < rowSize) {
                if (maze_matrix[loc.getRow() + 1][loc.getColumn()] == ' ') {
                    Location neLoc = new Location(loc.getRow()+1 , loc.getColumn());

                    queue.enQueue(neLoc);
                }
            }
            if (loc.getRow() - 1 >= 0) {
                if (maze_matrix[loc.getRow() - 1][loc.getColumn()] == ' ') {
                    Location neLoc = new Location(loc.getRow() - 1, loc.getColumn());
                    queue.enQueue(neLoc);

                }

            }

            if (loc.getColumn() + 1 < colSize) {
                if (maze_matrix[loc.getRow()][loc.getColumn() + 1] == ' ') {
                    Location neLoc = new Location(loc.getRow(), loc.getColumn() + 1);
                    queue.enQueue(neLoc);

                }

            }

            if (loc.getColumn() - 1 > 0) {
                if (maze_matrix[loc.getRow()][loc.getColumn() - 1] == ' ') {
                    Location neLoc = new Location(loc.getRow(), loc.getColumn() - 1);
                    queue.enQueue(neLoc);

                }

            }

        }

    }
}

