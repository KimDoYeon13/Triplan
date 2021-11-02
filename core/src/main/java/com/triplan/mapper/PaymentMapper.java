package com.triplan.mapper;

import com.triplan.domain.PaymentVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentMapper {

    void insert(PaymentVO paymentVO);

    PaymentVO read(int paymentId);

    void update(PaymentVO paymentVO);

    void delete(int paymentId);

}
