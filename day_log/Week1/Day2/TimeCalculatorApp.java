// TimeCalculatorApp.java
import java.io.*;

public class TimeCalculatorApp {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 받아야 하는 기능의 갯수 N개 
        
        int n = Integer.parseInt(br.readLine()); 
        String[] startTime = br.readLine().split(" "); // 두번째 받아온 시간과 분을 잘럿 넣어줌 
        int t = Integer.parseInt(startTime[0]); //시간을 T로 넣어주고
        int m = Integer.parseInt(startTime[1]); //분을 M으로 넣어주기 
        int start_time = t * 60 + m; // 시작 시간을 분으로 변환해서 넣어주기 
        
        int hours = 0; // 시간 
        int minutes = 0; //분 
        
          for (int i = 0; i < n; i++) {
            int ci = Integer.parseInt(br.readLine()); // 각 기능 개발 시간 입력
            start_time += ci; // 개발 완료 시간 계산

            hours = start_time / 60; // 개발 완료 시간을 시간으로 변환
            minutes = start_time % 60; // 개발 완료 시간을 분으로 변환

            if (hours >= 24) {
                hours %= 24; // 만약 24시간을 넘게 되면 24시간을 뺀 나머지 시간으로 출력 
            }
        }

        
        System.out.println(hours + " " + minutes); // 최종 결과 값 출력 
    }
}
