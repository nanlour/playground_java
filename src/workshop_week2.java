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
        for(int i = 2; i > (n + 1) / -2; i--){
            for(int ii = 0; ii < Math.max(i, -i); ii ++){
                System.out.print(' ');
            }
            for(int ii = 0; ii < 5 - 2 * Math.max(i, -i); ii ++){
                System.out.print('*');
            }
            for(int ii = 0; ii < Math.max(i, -i); ii ++){
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
