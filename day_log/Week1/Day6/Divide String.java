import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 입력: 문자열의 길이
        sc.nextLine();
        String s = sc.nextLine().trim();  // 입력: 문자열 S
        System.out.println(calculateMaxScore(s));  // 최대 점수 계산 및 출력
    }

    public static int calculateMaxScore(String s) {
        Set<String> substrings = new HashSet<>();  // 가능한 모든 부분 문자열을 저장할 Set
        int length = s.length();

        // 모든 가능한 3개의 부분 문자열을 생성
        for (int i = 0; i < length - 2; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                String a = s.substring(0, i + 1);  // 첫 번째 부분 문자열
                String b = s.substring(i + 1, j + 1);  // 두 번째 부분 문자열
                String c = s.substring(j + 1);  // 세 번째 부분 문자열

                substrings.add(a);
                substrings.add(b);
                substrings.add(c);
            }
        }

        List<String> sortedSubstrings = new ArrayList<>(substrings);
        Collections.sort(sortedSubstrings);  // 부분 문자열을 사전 순으로 정렬

        Map<String, Integer> locations = new HashMap<>();
        for (int idx = 0; idx < sortedSubstrings.size(); idx++) {
            locations.put(sortedSubstrings.get(idx), idx + 1);  // 각 부분 문자열의 위치를 사전에 저장
        }

        int maxScore = 0;  // 최대 점수 초기화
        // 모든 가능한 조합에 대해 점수를 계산하고 최대 점수를 구함
        for (int i = 0; i < length - 2; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                String a = s.substring(0, i + 1);
                String b = s.substring(i + 1, j + 1);
                String c = s.substring(j + 1);

                int score = locations.get(a) + locations.get(b) + locations.get(c);
                maxScore = Math.max(maxScore, score);
            }
        }

        return maxScore;  // 최대 점수 반환
    }
}
