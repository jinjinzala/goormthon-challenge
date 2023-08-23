import java.io.*;
class Main {
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String input = br.readLine();
      
      int answer = Integer.parseInt(input)/14;
      int count = Integer.parseInt(input)%14;
      answer=answer+(count/7);
      count = count%7;
      answer=answer+count;
      
      System.out.println(answer);
   }
}