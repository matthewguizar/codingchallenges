package org.example;

public class PaperChallenge {

    public class Paper {
        public static int paperWork(int n, int m){
            //simply multiplying n * m but have error check in case either is less than 0;
            int result = 0;
            if (n < 0 || m < 0){
            }
            else {
                result = n * m;

            }
            return result;
        }


    }
}
