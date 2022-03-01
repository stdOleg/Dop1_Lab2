public class Matv_lab1 {
    public static void main(String[] args) {
        int num_mess = 1000;
        int N;
        float x;

        for (float p = 0.09f; p < 1.0f; p +=0.1){
            boolean succ;
            N = 0;
            for (int i = 0; i <= num_mess; i++){
                //N = 0;
                succ = false;
                while(!succ) {
                    x =  (float)(Math.random());
                    if (x > p) {
                        N++;
                        succ = true;
                        break;
                    }
                    N++;
                }
            }

            System.out.println(p + " ====> " + (double)N/num_mess);
        }
    }
}
