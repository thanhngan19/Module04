package com.example.picture_of_day.repository;

import com.example.picture_of_day.model.FeedBack;
import com.example.picture_of_day.model.Picture;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;
@Repository
public class FeedBackRepository implements IFeedBackRepository {
    Session session = ConnectionUtil.sessionFactory.openSession();


    @Override
    public void add(FeedBack feedBack) {
        Transaction transaction = session.getTransaction();
        try{
            transaction.begin();
            session.save(feedBack);
            transaction.commit();
        }catch (Exception e){

        }
    }

    @Override
    public List<FeedBack> findAll() {
        long millis=System.currentTimeMillis();
        java.sql.Date date=new java.sql.Date(millis);
        TypedQuery<FeedBack> query = session.createQuery(
                "SELECT fb FROM FeedBack fb JOIN fb.picture p WHERE p.today = :today",
                FeedBack.class
        );
        query.setParameter("today", date);
        return query.getResultList();
    }

    @Override
    public void addCount(int id) {
     FeedBack feedBack = findById(id);
     feedBack.setCount(feedBack.getCount()+1);
        add(feedBack);
    }

    @Override
    public FeedBack findById(int id) {
        TypedQuery<FeedBack> query = session.createQuery("from FeedBack where id=:id",FeedBack.class);
        query.setParameter("id",id);
        return query.getSingleResult();
    }
}
