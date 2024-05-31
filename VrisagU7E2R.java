package Unit7;

public class VrisagU7E2R {
   
	//initializes the matrix array
	private double[][] matrix;

    public VrisagU7E2R() {
    	
        //instantiates the matrix array
        matrix = new double[20][20];
    }

    public void fill() {
    	
    	//enhanced for loop that finds the amount of elements in a row, then prints each column within that row
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
            	//fills matrix with random numbers
                matrix[i][j] = (Math.random() * 10.99) +0.01;
            }
        }
        
    }

    private double sum() {
    	
    	//creates variable sum
        double sum = 0;
        
        //row major enhanced for loop
        for (double[] row : matrix) {
            for (double value : row) {
                sum += value;
            }
            
        }
        
        //returns the sum
        return sum;
    }

    private double product() {
    	
    	//creates variable product 
        double product = 1;
        
        //row major enhanced for loop
        for (double[] row : matrix) {
            for (double value : row) {
                product *= value;
            }
            
        }
        
        //reuturns the product
        return product;
    }
    
    public void print() {
    	
        //calculate and print the sum and product of the matrix
        double sum = sum();
        double product = product();

        System.out.println("Sum of the matrix: " + sum);
        System.out.println("Product of the matrix: " + product);
    }

}//End class
