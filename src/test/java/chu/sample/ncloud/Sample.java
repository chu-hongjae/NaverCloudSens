package chu.sample.ncloud;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import chu.sample.ncloud.utils.NaverSmsUtilV2;

@SpringBootTest
class Sample {

	@Test
	public void sendSms() {
		
		
		// 네이버 클라우드 SENS 가입이후 서비스 ID 확인 가능 
		// 계정의 인증키 관리 페이지에서 accessKey 키 확인가능		
		// 계정의 인증키 관리 페이지에서 securityKey 키 확인가능 
		
		String serviceID = "";
		String accessKey = "";
		String securityKey= "";
		
		
		String sender = "01012345678";
		String contents = "안녕하세요 SMS 입니다. ";
		
		
		ArrayList<String> receiverList = new ArrayList<String>();
		receiverList.add("01012345678");
		
		NaverSmsUtilV2.getInstance(serviceID, accessKey, securityKey).sendMessage(sender, contents, receiverList);
		
	}
	
	
	

	@Test
	public void sendLms() {
		
		
		// 네이버 클라우드 SENS 가입이후 서비스 ID 확인 가능 
		// 계정의 인증키 관리 페이지에서 accessKey 키 확인가능		
		// 계정의 인증키 관리 페이지에서 securityKey 키 확인가능 
		
		String serviceID = "";
		String accessKey = "";
		String securityKey= "";
		
		
		String sender = "01012345678";
		String subject = "제목입니다. ";
		String contents = "안녕하세요 SMS 입니다. ";
		
		
		ArrayList<String> receiverList = new ArrayList<String>();
		receiverList.add("01012345678");
		
		NaverSmsUtilV2.getInstance(serviceID, accessKey, securityKey).sendMessageLms(sender, subject, contents, receiverList);
		
	}

}
