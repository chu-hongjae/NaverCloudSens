Naver Cloud 문자 발송 시스템의 버젼업으로 인한 V2 API 샘플코드 작성 

1. ServiceID , AccessKey , Security Key 등은 네이버 클라우드 플랫폼에 접속하여 확인이 가능합니다. 

2. API 전송시 SecureV2 생성시 Timestamp 의 경우 시스템 시간 Date -> Long 값으로 생성하며 암호화 키를 생성할때 참조되므로 전역변수로 선언하여 처리 

3. 네이버 클라우드 SENS를 이용하여 문자를 발송 할 경우 발신 번호에 대해 사전 심사가 통과되지 않을경우 메시지 발송이 되지 않습니다. 
