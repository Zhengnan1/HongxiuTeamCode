package dao1.junit;

import dao1.CustomerDAOImpl;
import dao1.bean.Customer;
import org.junit.Test;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;

import static transaction.JDBCUtils.utils.closeResource;
import static transaction.JDBCUtils.utils.getConnection;


public class CustomerDAOImplTest {

    private CustomerDAOImpl dao = new CustomerDAOImpl();

    @Test
    public void testInsert() {
        Connection conn = null;
        try {
            conn = getConnection();
            Customer cust = new Customer(1, "于小飞", "xiaofei@126.com", new Date(43534646435L));
            dao.insert(conn, cust);
            System.out.println("添加成功");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeResource(conn, null);

        }

    }

    @Test
    public void testDeleteById() {
        Connection conn = null;
        try {
            conn = getConnection();

            dao.deleteById(conn, 13);


            System.out.println("删除成功");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeResource(conn, null);

        }
    }

    @Test
    public void testUpdateConnectionCustomer() {
        Connection conn = null;
        try {
            conn = getConnection();
            Customer cust = new Customer(18, "贝多芬", "beiduofen@126.com", new Date(453465656L));
            dao.update(conn, cust);


            System.out.println("修改成功");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeResource(conn, null);

        }
    }

    @Test
    public void testGetCustomerById() {
        Connection conn = null;
        try {
            conn = getConnection();

            Customer cust = dao.getCustomerById(conn, 19);
            System.out.println(cust);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeResource(conn, null);

        }
    }

    @Test
    public void testGetAll() {
        Connection conn = null;
        try {
            conn = getConnection();

            List<Customer> list = dao.getAll(conn);
            list.forEach(System.out::println);


            System.out.println("");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeResource(conn, null);

        }
    }

    @Test
    public void testGetCount() {
        Connection conn = null;
        try {
            conn = getConnection();

            Long count = dao.getCount(conn);

            System.out.println("表中的记录数为：" + count);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeResource(conn, null);

        }
    }

    @Test
    public void testGetMaxBirth() {
        Connection conn = null;
        try {
            conn = getConnection();

            Date maxBirth = dao.getMaxBirth(conn);

            System.out.println("最大的生日为：" + maxBirth);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeResource(conn, null);

        }
    }

}
