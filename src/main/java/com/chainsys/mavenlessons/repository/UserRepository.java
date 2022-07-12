package com.chainsys.mavenlessons.repository;

import java.util.List;


import org.springframework.data.repository.CrudRepository;

//import com.chainsys.mavenlessons.entity.Passport;
import com.chainsys.mavenlessons.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	User findById(int id);
//	Passport findByPassportId(int id);
	List<User> findAll();
	User save(User user);
	void deleteById(int id);

	
//	@Query ("select u from User u where u.id-71)
//			User getUser(int uid); // this is example of JPQL
//			//21,22,73 -> Positioned parameters
//			@Query (value="select * from users u where u.id=?1",nativeQuery = true) User getUserNativeSQL (int uid); // Example of Native Query
//			//By default @Query will execute only select statements To execute insert, update, delete statements @Query should be marked as @Modifying
//			@Modifying
//			@Query ("update User u set u.name-?2, u.city-23 where u.id-21") void modifyllsor(int id, String name, String city);
//			//@Param
//			I'
//			@Query("select u from User u where u.city sucity") // Named parameters List <User> getUsers FromCity (@Param("ucity") String city);
}



