import java.util.Scanner;

public class Main {
    static int[] dx = {-1, 1, -1, 1, -1, 1, 0, 0};
    static int[] dy = {1, -1, -1, 1, 0, 0, -1, 1};
    static int answer = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[][] graph = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                if (graph[x][y] == 0) {
                    check(graph, x, y, N, K);
                }
            }
        }

        System.out.println(answer);
    }

    public static void check(int[][] graph, int x, int y, int N, int K) {
        int cnt = 0;

        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (0 <= nx && nx < N && 0 <= ny && ny < N) {
                if (graph[nx][ny] == 1) {
                    cnt++;
                }
            }
        }

        if (cnt == K) {
            answer++;
        }
    }
} 