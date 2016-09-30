package com.kzrs.service;

import com.kzrs.dto.AppointExecution;
import com.kzrs.entity.Book;

import java.util.List;

/**
 * Created by zjutK on 16/9/29.
 */
public interface BookService {
    /**
     * 查询一本图书
     *
     * @param bookId
     * @return
     */
    Book getById(long bookId);

    /**
     * 查询所有图书
     *
     * @return
     */
    List<Book> getList();

    /**
     * 预约图书
     *
     * @param bookId
     * @param studentId
     * @return
     */
    AppointExecution appoint(long bookId, long studentId);
}
