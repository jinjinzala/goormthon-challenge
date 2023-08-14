import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String a[] = input.split(" "); 
        double b = Integer.parseInt(a[0]) * (1 + (Integer.parseInt(a[1]) / 30.0)); 
        int result = (int) Math.floor(b); 
        System.out.print(result);
    }
}
