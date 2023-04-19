package localhost.bootcamp_NTTData.SpringBoot.Users;

import java.util.List;

import localhost.bootcamp_NTTData.SpringBoot.Model.SpringUsers;


/*
 * Esta interface obliga a desarrollar los métodos
 * en una clase ServiceImpl llamanado a la 
 * clase Repository 
 */
public interface UserService {

	public List <SpringUsers> findAll();
	public SpringUsers getUserById(int id);
	public void deleteUser(SpringUsers user);
}
