package workshop;

public class workshop_week2 {
    public void problem1(int n) {
        for(int i = 0; i < n; i++){
            for(int ii = 0; ii <= i; ii ++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public void problem2(int n) {
        for(int i = (int)(n + 1) / 2; i > (int)(n + 1) / -2 - 1; i--){
            for(int ii = 0; ii < Math.max(i, -i); ii ++){
                System.out.print(' ');
            }
            for(int ii = 0; ii < n - 2 * Math.max(i, -i); ii ++){
                System.out.print('*');
            }
            for(int ii = 0; ii < Math.max(i, -i); ii ++){
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
