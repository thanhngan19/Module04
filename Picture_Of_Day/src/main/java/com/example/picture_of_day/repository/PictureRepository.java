package com.example.picture_of_day.repository;

import com.example.picture_of_day.model.Picture;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

@Repository

public class PictureRepository implements IPictureRepository{
    Session session = ConnectionUtil.sessionFactory.openSession();
    @Override
    public void add(Picture pic) {
        Transaction transaction = session.getTransaction();
        try{
            transaction.begin();
            session.save(pic);
            transaction.commit();
        }catch (Exception e){

        }
    }
}
