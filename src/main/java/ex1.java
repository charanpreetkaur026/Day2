public class ex1 {
    public static void main(String[] args) {
        int  i;
        double num ;
        for(i=1;i<=10;i++){
            if(i%2==0 ){
                num = i*i;
                if(i!=8) {
                    System.out.println("Number: " + i + "\t Square: " + num);
                }
            }
        }

    }
}
