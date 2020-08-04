package com.yy.jpatest.repository;

import com.yy.jpatest.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @Auther: yuyue
 * @create 2020/8/3 12:35
 */
@Repository
public interface UserRepository extends JpaRepository<User,String> {

    @Transactional
    @Modifying
    @Query(value="update t_user set status='8' where status='0' and expiration_date < now()",nativeQuery=true)
    void updateStatus();

    @Transactional
    @Modifying
    @Query(value="update User set status = ?1 where status = ?2 and expirationDate < ?3")
    void updateStatus1(String statusAfter, String statusBefore, Date date);

}
