public class Payroll {
    private int[] itemsSold; // number of items sold by each employee
    private double[] wages; // wages to be computed in part (b)
    
    /* Creates a Payroll object
     
       PRECONDITIONS: items != null, items.length >= 3
     */
    public Payroll(int[] items) {
      itemsSold = items;
      wages = new double[items.length];
    }
   
    /*  Returns the bonus threshold as described in part (a).
     */
    public double computeBonusThreshold() {
        int min = itemsSold[0];
        int max = itemsSold[0];
        int sum = itemsSold[0];
        for (int i = 1; i < itemsSold.length; i++) {
            sum += itemsSold[i];
            if (min > itemsSold[i]) {
                min = itemsSold[i];
            }
            if (max < itemsSold[i]) {
                max = itemsSold[i];
            }
        }
        return (double) (sum - min - max) / (itemsSold.length - 2);
    }
    
    
   
    /* Computes employee wages as described in part (b) and stores
       them in wages. The parameter fixedWage represents the fixed
       amount each employee is paid per day. The parameter
       perItemWage represents the amount each employee is paid per
       item sold.
     */
    public void computeWages(double fixedWage, double perItemWage) {
        for (int i = 0; i < wages.length; i++) {
            if (itemsSold[i] > computeBonusThreshold()) {
        wages[i] = (fixedWage + (perItemWage * itemsSold[i])) * 1.1;
    } else {
    wages[i] = (fixedWage + (perItemWage * itemsSold[i]));	
        }
    }
    }
    public double[] getWages() {
        return wages;
    }
    

  }
  
