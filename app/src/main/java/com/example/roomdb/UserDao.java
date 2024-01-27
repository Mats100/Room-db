package com.example.roomdb;

import androidx.room.Insert;
import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDao {

    @Insert
    void insertrecord(User... users);

    @Query("SELECT EXISTS(SELECT * FROM  User WHERE uid=:userid)")
    Boolean is_exist(int userid);

    @Query("SELECT * FROM  User")
    List<User> getallusers();

}