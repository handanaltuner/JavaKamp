package kodlamaio.northwind.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.UserService;
import kodlamaio.northwind.core.dataAccess.UserDao;
import kodlamaio.northwind.core.entities.User;
import kodlamaio.northwind.core.utilities.result.DataResult;
import kodlamaio.northwind.core.utilities.result.Result;
import kodlamaio.northwind.core.utilities.result.SuccesDataResult;
import kodlamaio.northwind.core.utilities.result.SuccessResult;


@Service
public class UserManager implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	
	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("Kullancı eklendi");
	}

	@Override
	public DataResult<User> findByEmail(String email) {
		this.userDao.findByEmail(email);
		return new SuccesDataResult<User>("Kullanıcı bulundu");
	}
	

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

}
