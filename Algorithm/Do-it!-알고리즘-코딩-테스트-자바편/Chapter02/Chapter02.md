### 제목  
### - 코드의 논리 오류를 어떻게 잡을까?  
### - \-가장 뛰어난 오류 탐색 방법, 디버깅  
  
### 02 - 1. 디버깅 (debugging)  
###     - 정의  
            - 프로그램에서 발생하는 문법 오류나 논리 오류를 찾아 바로잡는 과정  
      
### 02 - 2. 디버깅 활용 사례  
        1. 변수 초기화  
        2. 반복문 - 인덱스 범위 지정  
        3. 잘못된 변수 사용  
        4. 자료형 범위 오류  
            - 처음부터 큰 자료형을 사용하는 것이 좋다.  
                - ex. (int -> double, float -> long)  