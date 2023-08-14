import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String a[] = input.split(" "); //공백으로 들어오는 문자열을 잘라서 넣어주기
        double b = Integer.parseInt(a[0]) * (1 + (Integer.parseInt(a[1]) / 30.0)); //숫자로 형변환하여 넣어주기 
        int result = (int) Math.floor(b); 
        System.out.print(result);
    }
}
