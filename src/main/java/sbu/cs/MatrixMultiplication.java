package sbu.cs;

import java.util.ArrayList;
import java.util.List;

public class MatrixMultiplication {

    // You are allowed to change all code in the BlockMultiplier class
    public static class BlockMultiplier implements Runnable
    {
        List<List<Integer>> tempMatrixProduct;
        List<List<Integer>> matrix_A;
        List<List<Integer>> matrix_B;
        int row;
        int column;
        int num;
        public BlockMultiplier(List<List<Integer>> matrix_A, List<List<Integer>> matrix_B) {
            // TODO
            this.matrix_A = matrix_A;
            this.matrix_B = matrix_B;
            tempMatrixProduct = new ArrayList<>();
            row = matrix_A.size();
            column = matrix_B.getFirst().size();
            num = matrix_B.size();
        }

        @Override
        public void run() {
            /*
            TODO
                Perform the calculation and store the final values in tempMatrixProduct
            */
            for (int i = 0; i < row; i++) {
                List<Integer> row = new ArrayList<>();
                for (int j = 0; j < column; j++) {
                    int sum = 0;
                    for (int k = 0; k < num; k++) {
                        sum += matrix_A.get(i).get(k)*matrix_B.get(k).get(j);
                    }
                    row.add(sum);
                }
                tempMatrixProduct.add(row);
            }
            getTempMatrixProduct();
        }
        public List<List<Integer>> getTempMatrixProduct() {
            return tempMatrixProduct;
        }
    }

    /*
    Matrix A is of the form p x q
    Matrix B is of the form q x r
    both p and r are even numbers
    */
    public static List<List<Integer>> ParallelizeMatMul(List<List<Integer>> matrix_A, List<List<Integer>> matrix_B)
    {
        /*
        TODO
            Parallelize the matrix multiplication by dividing tasks between 4 threads.
            Each thread should calculate one block of the final matrix product. Each block should be a quarter of the final matrix.
            Combine the 4 resulting blocks to create the final matrix product and return it.
         */

        /*
            i want to pass two matrix that makes a quarter of the final matrix
            to the BlockMultiplier class to calculate that
        */

//        List<Thread> threads = new ArrayList<>();
//        List<BlockMultiplier> blocks = new ArrayList<>();
//        List<List<List<Integer>>> finalBlocks = new ArrayList<>();


        return null;
    }

    public static void main(String[] args) {
        // Test your code here
    }
}
