import java.util.*;

public class Findfraud {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String sender [] = new String[n];
        String reciver [] = new String[n];
        double amount [] = new double[n];
        int time [ ] = new int[n];

        for(int i = 0 ;i < n;i++) {
            sender[i]= sc.next();
            reciver[i]= sc.next();
            amount[i] = sc.nextDouble();
            time[i] = sc.nextInt();
        }


        for(int i = 0 ; i < n; i++){
            for(int j = i + 1 ; j < n; j++ ){

                if(sender[i].equals(sender[j]) && 
                    reciver[i].equals(reciver[j]) &&
                    amount[i] == amount[j] &&
                    Math.abs(time[i] - time[j]) <= 60) {
                        System.out.println("Fraud Found..");

                        System.out.println(sender[i] + " " + reciver[i] + " "+ amount[i] + " " + time[i] );
                        System.out.println(sender[j] + " " + reciver[j] + " "+ amount[j] + " " + time[j] );
                    }
            }
        }
    }
}
