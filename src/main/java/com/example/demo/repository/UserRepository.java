package com.example.demo.repository;

import com.example.demo.domain.User;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * {@link User} {@link Repository}
 */
@Repository
public class UserRepository {

    /**
     * 采用内存型的存储方式
     */
    private final ConcurrentMap<Integer, User> repository = new ConcurrentHashMap<Integer, User>();

    private final static AtomicInteger idGenerator = new AtomicInteger();

    /**
     * 保存对象
     *
     * @param user {@link User} 对象
     * @return 如果保存成功，返回<code>true</code>
     * 否则，返回<code>false</code>
     */
    public boolean save(User user) {
        //id从1开始
        Integer id = idGenerator.incrementAndGet();
        user.setId(id);
        return repository.put(id, user) == null;
    }

    /**
     *
     * @return 返回Map
     */
    public Map<Integer, User> getReposiory(){
        return repository;
    }

    /**
     *
     * @return 返回Map
     */
    public Collection<User> findAllUser(){
        Collection<User> users = new ArrayList<>();
        Set<Map.Entry<Integer, User>> entrySet = repository.entrySet();
        Iterator<Map.Entry<Integer, User>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, User> entry =  iterator.next();
            User user = entry.getValue();
            ((ArrayList<User>) users).add(user);
        }
        return users;
    }
}
