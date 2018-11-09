import com.gsq.dao.IUserInfoDao;
import com.gsq.entity.BookInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath*:spring-config.xml"})
public class TestMybatis {



    @Autowired
    private IUserInfoDao dao;

    @Test
    public void testSelectUser() throws Exception {
        Integer id = 1;
        BookInfo bookInfo = dao.selectByPrimaryKey(id);
        System.out.println(bookInfo.getName());
    }
}
