# 구름톤챌린지

<aside>
💡 구름톤 챌린지 1일차

</aside>

### 문제

---

![Untitled](%E1%84%80%E1%85%AE%E1%84%85%E1%85%B3%E1%86%B7%E1%84%90%E1%85%A9%E1%86%AB%E1%84%8E%E1%85%A2%E1%86%AF%E1%84%85%E1%85%B5%E1%86%AB%E1%84%8C%E1%85%B5%20fd4f8cff408d44259dda8fdc2dd0f4ce/Untitled.png)

![Untitled](%E1%84%80%E1%85%AE%E1%84%85%E1%85%B3%E1%86%B7%E1%84%90%E1%85%A9%E1%86%AB%E1%84%8E%E1%85%A2%E1%86%AF%E1%84%85%E1%85%B5%E1%86%AB%E1%84%8C%E1%85%B5%20fd4f8cff408d44259dda8fdc2dd0f4ce/Untitled%201.png)

### 정답 코드

---

```java
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
```

### 느낀점

---

**`BufferedReader`** 클래스는 파일에서 텍스트 데이터를 읽기 위한 버퍼링된(데이터를 미리 읽어 메모리에 저장해 놓는) 입력 스트림을 제공한다. 한 줄씩 데이터를 읽어오기 때문에 **`readLine()`** 함수와 함께 사용된다. 

### 어려웠던 점

---

구름톤 챌린지와 기존 프로그래머스 코딩 테스트와 비교했을 때 코딩 구조가 조금씩 달랐다.

프로그래머스 코딩테스트에 익숙해졌는지라 **`BufferedReader`** 함수가 낯설게 느껴진 것 같다.

여러 가지 코딩 테스트 사이트를 경험해보고 실력을 익히는 것이 필요할 것 같다. 

### Read Line 함수

---

**`readLine`** 함수는 자바에서 파일에서 텍스트 데이터를 한 줄씩 읽어오는 데 사용되는 메서드입니다. 이 함수는 **`BufferedReader`** 클래스를 사용하여 파일에서 데이터를 읽을 때 주로 활용됩니다. 아래는 **`readLine`** 함수의 자바에서의 사용 및 설명을 마크다운 형식으로 나타낸 것입니다:

### **`readLine` 함수**

### 기능

**`readLine`** 함수는 주어진 파일에서 한 줄씩 텍스트 데이터를 읽어오고, 각 호출마다 다음 줄로 이동합니다.

### 사용 방법

**`readLine`** 함수는 일반적으로 다음과 같이 사용됩니다:

```java
try {
    BufferedReader reader = new BufferedReader(new FileReader("파일경로"));
    String line = reader.readLine();

    while (line != null) {
        // 한 줄씩 처리
        System.out.println(line);
        line = reader.readLine();
    }

    reader.close(); // 파일을 사용한 후에는 반드시 닫아주어야 합니다.
} catch (IOException e) {
    // IOException 예외 처리
    e.printStackTrace();
}
```

- **`BufferedReader`** 클래스를 사용하여 파일을 열고 줄 단위로 데이터를 읽어옵니다.
- **`readLine`** 메서드를 호출하면 파일에서 한 줄을 읽어와 **`String`** 형태로 반환합니다.
- 파일의 끝에 도달하면 **`null`**을 반환하므로, 이를 이용하여 파일의 끝을 확인합니다.

### 반환 값

- **`String`**: 파일에서 읽어온 한 줄의 텍스트 데이터가 저장된 문자열입니다.

### 주의 사항

- 파일을 열고 사용한 후에는 **`close`** 메서드를 호출하여 파일을 명시적으로 닫아주어야 합니다. 이것은 파일을 올바르게 관리하고 메모리 누수를 방지하기 위한 중요한 단계입니다.
- **`try-catch`** 블록을 사용하여 **`IOException`** 예외를 처리해야 합니다. 파일 작업은 예외를 일으킬 수 있으므로 예외 처리는 필수입니다.

**`readLine`** 함수는 자바에서 파일 처리 작업을 수행할 때 유용한 메서드로, 파일에서 텍스트 데이터를 읽어와서 처리하는 데 도움을 줍니다.

### Math 함수

---

**`Math`** 클래스는 자바에서 수학 연산을 수행하기 위한 유용한 함수와 상수를 제공하는 클래스입니다. 아래는 **`Math`** 클래스의 주요 함수와 설명을 마크다운 형식으로 나타낸 것입니다:

### **`Math` 클래스 함수**

### 기능

**`Math`** 클래스는 다양한 수학적 연산을 수행하는 메서드를 제공합니다. 이 클래스를 사용하여 수치 계산을 수행할 수 있습니다.

### **`Math.floor()`, `Math.ceil()`, `Math.round()`**

- 소수점 처리 함수로, 바닥값(floor), 천장값(ceiling), 반올림값(round)을 계산합니다.
- 예제:

```java
double floorValue = Math.floor(7.8); // floorValue는 7.0이 됨
double ceilValue = Math.ceil(7.2);   // ceilValue은 8.0이 됨
long roundValue = Math.round(7.5);   // roundValue는 8이 됨
```

[구름톤챌린지](https://www.notion.so/2054bc57c669461c8d77ef88bacb9ae7?pvs=21)