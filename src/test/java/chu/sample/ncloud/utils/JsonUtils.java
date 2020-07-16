package chu.sample.ncloud.utils;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.beans.factory.annotation.Value;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;



/**
 * @author hongjae.chu
 * 		
 */
public class JsonUtils {
	
	@Value("${pretty.flag:true}")
	private static boolean PRETTY_FLAG;
	
	/**
	 * Object to String
	 * 
	 * @param obj
	 * @param pretty
	 * @return
	 */
	public static String serialize(Object obj, boolean pretty) {
		String result = "";
		GsonBuilder builder = new GsonBuilder().serializeNulls();
		Gson mapper = new Gson(); 
		try {
			if ( pretty ) {
				mapper = builder.setPrettyPrinting().create();
				result = mapper.toJson(obj);
			} else {
				result = mapper.toJson(obj);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	
	
	/**
	 * Stirng to Object
	 * 
	 * @param content
	 * @param valueType
	 * @return
	 */
	
	public static <T> T deserialize(String content, Class<T> valueType)  {
		
		T result = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			result = (T) mapper.readValue(content, valueType);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return result;
	}
	
	public static String serialize(Object obj) {
		return serialize(obj, PRETTY_FLAG);
	}
	
	/**
	 * Stirng to Object
	 * 
	 * @param content
	 * @param valueType
	 * @return
	 */
	
	public static <T> T deserialize(String content, TypeReference typeReference) {
		
		T result = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			result = mapper.readValue(content, typeReference);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}



	
	
}
