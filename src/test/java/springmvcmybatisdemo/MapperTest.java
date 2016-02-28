package springmvcmybatisdemo;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import springmvcmybatisdemo.base.BaseTest;

import com.ssd.demo.module.document.bean.Document;
import com.ssd.demo.module.document.service.DocumentService;
import com.ssd.demo.module.user.bean.User;
import com.ssd.demo.module.user.controller.UserController;
import com.ssd.demo.module.user.mapper.UserMapper;
import com.ssd.demo.module.user.service.UserService;


public class MapperTest extends BaseTest{

	@Autowired
	private UserController userController;
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private UserService sserService;
	
	@Autowired
	private DocumentService documentService;
	
	@Test
	public void testA(){
		System.out.println(userController);
		System.out.println(userMapper.getById(1));
		User user = userMapper.selectByPrimaryKey(1l);
		System.out.println(user);
		
		System.out.println(sserService.getById(1l));
	}
	
	@Test
	public void insertDocument(){
		Document doc = new Document();
		doc.setAuthor("胡");
		doc.setTitle("标题" + System.currentTimeMillis());
		
		this.documentService.insert(doc);
		
	}
	
	@Test
	public void getDoc(){
		System.out.println(this.documentService.getById(1l));
	}
}
