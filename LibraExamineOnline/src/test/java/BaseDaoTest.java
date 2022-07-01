import com.shally.leo.dao.BaseDao;
import com.shally.leo.pojo.Admin;
import org.junit.Test;

import java.util.List;

public class BaseDaoTest {
    private BaseDao<Admin> baseDao = new BaseDao<>();

    @Test
    public void testGetSingleBean() {

        String sql = "select admin_id,admin_login_name,admin_login_password  from admin where admin_id=?";

        Admin admin = baseDao.getSingleBean(sql, Admin.class, 1030107);

        System.out.println("admin = " + admin);

    }

    @Test
    public void testGetBeanList() {

        String sql = "select emp_id empId,emp_name empName,emp_position empPosition,login_account loginAccount,login_password loginPassword from t_emp";

        List<Admin> adminsList = baseDao.getBeanList(sql, Admin.class);

        for (Admin admin : adminsList) {
            System.out.println("admin = " + admin);
        }

    }

    @Test
    public void testUpdate() {

        String sql = "update t_emp set emp_position=? where emp_id=?";

        String adminLoginName = "minister";
        String adminId = "3";

        int affectedRowNumber = baseDao.update(sql, adminLoginName, adminId);

        System.out.println("affectedRowNumber = " + affectedRowNumber);

    }
}
