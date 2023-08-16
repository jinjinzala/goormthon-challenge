import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); 

        int d = 0;

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int c = Integer.parseInt(input[2]);

            if (input[1].equals("+")) {
                d += a + c;
            } else if (input[1].equals("-")) {
                d += a - c;
            } else if (input[1].equals("*")) {
                d += a * c;
            } else if (input[1].equals("/")) {
                if (c != 0) {
                    d += a / c;
                } else {
                  
                    return;
                }
            }
        }

        System.out.println(d);
    }
}
