package com.example.picture_of_day.repository;

import com.example.picture_of_day.model.FeedBack;
import com.example.picture_of_day.model.PointFeed;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class PointRepository implements IPointRepository {
    Session session = ConnectionUtil.sessionFactory.openSession();

    @Override
    public List<PointFeed> findAll() {
        TypedQuery<PointFeed> query = session.createQuery("from PointFeed",PointFeed.class);
        return query.getResultList();
    }
}
