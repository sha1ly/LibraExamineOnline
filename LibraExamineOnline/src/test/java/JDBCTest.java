import java.sql.Connection;

import com.shally.leo.util.JDBCUtils;
import org.junit.Test;

public class JDBCTest {

    @Test
    public void testGetConnection() {
        Connection connection = JDBCUtils.getConnection();
        System.out.println("connection = " + connection);
        JDBCUtils.releaseConnection(connection);

    }
}
