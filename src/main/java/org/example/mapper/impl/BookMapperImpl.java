package org.example.mapper.impl;

import org.example.mapper.BookMapper;
import org.springframework.stereotype.Repository;


@Repository
public class BookMapperImpl implements BookMapper {
    @Override
    public void save() {
        System.out.println(System.currentTimeMillis());
        System.out.println("book mapper save");
    }

    @Override
    public void update() {
        System.out.println("book mapper update");
    }
}
