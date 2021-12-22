package com.RESTAPI.Liveasy.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RESTAPI.Liveasy.entities.PayLoad;

public interface DaoClass extends JpaRepository<PayLoad,String> {

}
