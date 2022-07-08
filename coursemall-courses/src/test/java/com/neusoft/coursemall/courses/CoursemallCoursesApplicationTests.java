package com.neusoft.coursemall.courses;

import com.neusoft.coursemall.courses.entity.CourseBrandEntity;
import com.neusoft.coursemall.courses.service.CourseBrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CoursemallCoursesApplicationTests {

    @Autowired
    CourseBrandService courseBrandService;

    @Test
    void contextLoads() {
        CourseBrandEntity courseBrandEntity = new CourseBrandEntity();
        courseBrandEntity.setDescript("尚硅谷的课程");
        courseBrandEntity.setName("尚硅谷");
        courseBrandService.save(courseBrandEntity);
        System.out.println("保存成功");

    }

}
