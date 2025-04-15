큰 그림 재분류하기

### 제목
- ### roadmap

## 01 - 1. What is the Internet?  
- ### Nuts and Bolts View  
    - Host (End system)  
        - 연결되어 있는 장치들  
        - ex  
            - PC, Server, laptop, smartPhone  
    
    - Communication Links  
        - 광섬유(fiber), 구리선(copper), radio, satellite  
        - bandwidth  
            - 전송률, 전송폭  

        - ex
            - 무선(wireless links), 유선(wired links)  

    - Packet Switch  
        - 패킷(데이터 덩어리) 전달  
        - ex.  
            - router, switch  
    
    - Internet Service Provider (ISP)  
        - 인터넷 서비스 제공업체  

    - Internet  
        - 네트워크의 네트워크  
        - ISP들의 상호교환  
    
    - Protocol
        - message의 송수신 통제  
    
    - Internet Standards
        - RFC (Request for comments)  
        - IETF (Internet Engineering Task Force)  

- ### Service View  
    - Internet  
        - 애플리케이션 서비스를 제공하는 인프라  
        - 애플리케이션 프로그래밍 인터페이스를 제공  
  
- ### What is Protocol?
    - ### 정의  
        - 네트워크 개체들 사이에서 message의 송수신 순서, 형식을 정의한 것  
        - message 송수신에 대한 조치  

## 01 - 2. network edge  
- ### A closer look at network structure  
    - ### network edge  
        - Host (clients and server)  
    
    - ### access network, physical media  
        - 유/무선 통신 매체  
    
    - ### network core
        - 상호연결된 라우터들  
        - 네트워크의 네트워크들  

- ### Access network  
    - ### digital subscriber line (DSL)  
        - ### DSLAM (DSL Access Multiplexer)  
            - DSL 회선들을 하나로 모으는 장치  
            
            - ### 역할  
                - 신호 집약  
                - 신호 분리  
                - 네트워크 연결  
                - 속도 조절  

        - ### DSLModem  
            - ### 역할  
                - 변조 (Modulation)  
                - 복조 (Demodulation)  
                - 인터넷 연결  
                - 물리적 인터페이스 제공  

            - ### 변조 (Modulation)  
                - 반송파로 만드는 행위  

            - ### 복조 (Demodulation)  
                - 반송파를 복원하는 행위 

            - 반송파는 신호를 먼 거리로 보내기 위해 사용  

        - ### upstream  
            - 데이터를 보내는 것  
            - 집 -> 인터넷  

        - ### downstream  
            - 데이터를 받는 것  
            - 인터넷 -> 집  
    
        - downstream이 upstream보다 빠르다.

    - ### Cable network  
        - ### 주파수 분할 방식 (frequency division multiplexing)  
            - 하나의 케이블로 여러 신호를 
            각각의 주파수 대역폭에 맞게 분리해서 동시에 전송하는 방식  

        - ### 동축 케이블  
            - 축이 같은 케이블 2개  
            - 겉은 절연체로 구성  

        - ### FTTH (fiber To The Home)  
        - ### CMTS (Cable Modem Termination System)  
        - ### HFC (Hybrid Fiber Coax)  

        - ### DSL과의 차이점  
            - 중앙 국사(central office)의 유무  
            - cable network는 없다.  

    - ### home network  
        - ### NAT (Network Address Translation)  

    - ### Enterprise Access Network (Ethernet)  
    
    - ### Wireless access Network  
        - ### wireless LANs  
        - ### wide-area wireless access  
            - 이동통신사(telco, telecommunication company)가 제공  

- ### Physical media  
    - ### bit  
        - 송수신 단위  

        - ### Mbps (Mega bit per second)  
    
    - ### physical link  
        - 송수신에 사용될 요소  
    
    - ### guided media  
        - 고체로 전파되는 경우  
    
    - ### unguided media  
        - 자유롭게 전파되는 경우  

    - ### twisted pair (TP)    
        - 두개의 꼬여있는 구리선  

        - ### Why twisted  
            - +, - 선을 꼬는데, 노이즈 감소를 위해서다.  

    - ### 동축 케이블 (coaxial cable)  
        - 중심선과 차폐선이 같은 축을 가진다.  
        
        - ### 특징  
            - 양방향  
            - 다양한 주파수 처리 가능  
    
    - ### 광섬유 (fiber optic cable)  
        - 광섬유의 빛 신호를 통해 통신  

        - ### 특징  
            - 빠르다.  
            - 오류율이 낮다.  

    - ### radio  
        - 전자기저인 스펙트럼으로 신호 전송  

## 01 - 3. network core  
- ### The network core  
    - 상호 연결된 라우터들  

    - ### packet-switching  
        - host들이 application-layer의 message를 packet으로 쪼개는 행위  
        - packet은 source -> destination으로 router를 통해 이동  
    
- ### Packet-switching  
    - ### store and forward  
        - 모든 packet은 다음 link에 전송하기 전까지 반드시 저장된다. 
    
    - ### queueing delay, loss  
        - 모든 packet은 다음 link에 전송하기 전까지 queue에 있는다.  
        - 모든 packet은 queue가 가득 찼을 때, 손실될 수 있다.  
    
- ### Two key network-core functions  
    - ### routing  
        - packet의 source - destination에 맞게 route를 결정하는 것  
    
    - ### forwarding  
        - router의 입력과 router의 출력에 적절하게 packet을 옮기는 것  

- ### circuit switching  
    - 경로를 미리 고정해서 circuit을 할당하는 방식  

    - ### 특징  
        - 자원을 공유하지 않는다.  
            - 보장된 performance를 제공할 수 있다.  
            - 다른 host들은 사용할 수 없다.  
        
    - ### FDM vs TDM  
        - ### FDM (Frequency Division Multiplexing)  
        - ### TDM (Time Division Multiplexing)  
    
    - ### packet switching vs circuit switching  
        - packet switching은 더 많은 사용자가 사용할 수 있다.  

- ### Internet structure: network of networks  
    - end system은 access ISP를 경유하여 인터넷을 연결한다.  
    - access ISP는 상호연결되어 있어야 한다. 
    - 모든 ISP들은 access ISP, region ISP, global ISP (Tier 1 ISP), other global ISP (other Tier 1 ISP)순으로 연결되어 있다.  
    - 모든 ISP들 사이에는 IXP를 통해서 효율적으로 트래픽을 교환한다.  

## 01 - 4. delay, loss, throughput in networks  
- ### delay  
    - ### 원인  
        - packet의 link 도착률이 output link 수용량을 초과했을 때 발생  
    
    - ### 네 가지 요소  
        - ### proc (nodal processing)  
            - 비트 오류 검사   
            - output link 결정  

        - ### queue (queueing delay)  
            - 전송 시간  
        
        - ### trans (transmission delay)  
            - (패킷 길이) / (전송률)  
        
        - ### prop (propagation delay)  
            - (물리적 링크 길이) / (평균 전송 속도)

- ### loss  
  
- ### Throughput  
    - bit 전송 폭  
    - 전체적인 성능이 가장 작은 파이프에 의해 결정된다.  

## 01 - 5. protocol layers, service models  
- ### Why layering?  
    - 추가하기  

- ### Internet Protocol Stack  
    - ### Application  
        - network application 지원  
        
        - ### ex  
            - FTP, SMTP, HTTP  
    
    - ### Transport  
        - process 간의 데이터 전송  

        - ### ex  
            - TCP, UDP  
        
    - ### Network  
        - source -> destination의 datagram routing  
        
        - ### ex  
            - IP, routing protocols  
    
    - ### Link  
        - newtork 요소들의 근접한 곳에 데이터 전송  

        - ### ex  
            - Ethernet, Wifi, PPP  
    
    - ### Physical  
        - bit 실제 전송  

- ### ISO/OSI reference Model  
    - ### presentation  
        - application이 데이터의 뜻을 해석하는 것을 허용  
    
    - ### session  
        - synchronization, checkPointing, 데이터 교환 recovery  
    
    - 위의 layer들은 이미 application layer에 포함되어 있거나, 필요하지 않다!  

- ### Encapsulation  
    - 사진  

## 01 - 6. Network Security  
## 01 - 7. History  