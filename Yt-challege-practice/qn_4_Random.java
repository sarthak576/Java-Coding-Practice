import java.util.Random;

class qn_4_Random {
    public static void main(String[] args) {
        // print 20 random values
        // 0-200
        // avoid 2 digit numbers
        Random x = new Random();
       int count = 1;
        
        while(count<21){
        int random = x.nextInt(101)+100;
        System.err.println(count+"="+random);
count++;
        }

    }

}