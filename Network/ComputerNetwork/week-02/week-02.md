## 02. Application Layer  

## 02 - 1. principles of network applications  
- ### Creating a network app  
    - 다른 end system에서 통신을 위한 프로그램을 쓰는 것  


- ### Application Architecture  
    - 사진 추가  

    - ### Client - Server  
        - ### Server
            - 항상 host  
            - 영구적인 IP주소  
            - scaling을 위한 데이터 중앙  
        
        - ### Client  
            - 서버와 통신  
            - 다른 Client와는 통신하지 않는다.  

    - ### Pear to Pear (P2P)  
        - 서버가 없다. 
        - 다른 pear들을 거쳐 통신  
        
        - ### self scalability  
            - service의 양에 맞게 pear들이 수용 능력을 키운다.  
    
- ### Processes Communicating  
    - OS에 의해 정의된 inter-process communication을 한다.  

    - ### client Process
        - 통신을 시작  
    
    - ### server process  
        - 통신을 기다림  

- ### Socket  
    - Applicaiton -> Transport로 이동하는 문  
    
    - 사진 추가  

- ### Addressing process  
    - ### identifier  
        - 32 bit의 IP주소  
        - IP주소와 process에 관련된 port 번호를 가지고 있다.  

        - ### ex  
            - HTTP Server: 80  
            - mail Server: 25  

- ### App Layer Define  
    - ### 규칙  
      
    - ### message 교환 유형  
    - ### message 문법  
    - ### message 내용  
      
    - ### open protocol  
        - ### ex  
            - HTTP, SMTP  

    - ### proprietary protocol  
        - ### ex  
            - Skype  

## 02 - 2. Web and HTTP  
- ### review  
    - web page는 object에 있다.  
    - object는 HTML, JPEG, Java applet, audio file, ...  
    
    - 사진 추가  

- ### HTTP OverView  
    - ### HTTP (HypterText Transfer Protocol)  
        - Web의 Application Layer protocol  
        - Client/Server Model (Request, Response)  
        - TCP 사용  
        
        - ### stateless  
            - Server가 Client의 과거 요청들에 대한 정보가 없는 상태  

- ### HTTP Connection  
    - ### Non-Persistent  
        - 한 개의 Object만 전송하고 TCP 연결 종료  
    
    - ### Persistent  
        - 여러 개의 Object를 전송하고 TCP 연결 종료  

    - ### Response time: Non-persistent vs Persistent  
        - ### RTT (Round Trip Time)  
            - Packet이 Client -> Server -> Client로 돌아오는데 걸리는 시간  

        - (2RTT + (File Transmission Time)) * N  
        - RTT + (RTT + File Transmission Time) * N  

- ### HTTP Request Message  
    - 사진 추가  

- ### HTTP Response Message  
    - 사진 추가  

- ### User-Server State: Cookie  


- ### Web Cache (Proxy Server)  
    - 사진 추가  

    - ### 목표  
        - Origin Server 사용 없이 Client Request 만족  
    
    - ### 왜 사용하는가 ?
        - 