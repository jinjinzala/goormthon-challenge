import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputTokensLine = br.readLine();
        String[] inputTokens = inputTokensLine.split(" ");
        int n = Integer.parseInt(inputTokens[0]);
        int k = Integer.parseInt(inputTokens[1]);

        String inputNumbersLine = br.readLine();
        String[] inputNumbers = inputNumbersLine.split(" ");
        String[] binaryNumbers = new String[2 * n];

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(inputNumbers[i]);
            String binaryString = Integer.toBinaryString(number);
            binaryString = binaryString.replace("0", "");
            binaryNumbers[n + i] = binaryString + " " + number;
        }

        for (int i = n; i < 2 * n; i++) {
            for (int j = i + 1; j < 2 * n; j++) {
                String[] tokensI = binaryNumbers[i].split(" ");
                String[] tokensJ = binaryNumbers[j].split(" ");
                int countI = tokensI[0].length();
                int countJ = tokensJ[0].length();
                int numI = Integer.parseInt(tokensI[1]);
                int numJ = Integer.parseInt(tokensJ[1]);

                if (countI < countJ || (countI == countJ && numI < numJ)) {
                    String temp = binaryNumbers[i];
                    binaryNumbers[i] = binaryNumbers[j];
                    binaryNumbers[j] = temp;
                }
            }
        }

        String[] tokens = binaryNumbers[n + k - 1].split(" ");
        System.out.println(tokens[1]);
    }
}
