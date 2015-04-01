package com.sq.protocol.opc.service;

import com.sq.protocol.opc.domain.MesuringPoint;
import com.sq.protocol.opc.repository.MesuringPointRepository;
import com.sq.service.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 测点相关业务类.
 * User: shuiqing
 * Date: 2015/4/1
 * Time: 15:01
 * Email: shuiqing301@gmail.com
 * GitHub: https://github.com/ShuiQing301
 * Blog: http://shuiqing301.github.io/
 * _
 * |_)._ _
 * | o| (_
 */
@Service
public class MesuringPointService extends BaseService<MesuringPoint, Long> {

    private static final Logger log = LoggerFactory.getLogger(MesuringPointService.class);

    private MesuringPointRepository getMesuringPointRepository() {
        return (MesuringPointRepository) baseRepository;
    }

    /**
     * 注册测点到opc group.
     */
    private void registerMesuringPoint() {

    }

}
