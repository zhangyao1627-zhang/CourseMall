package com.neusoft.coursemall.courses.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.coursemall.courses.entity.CourseAttrEntity;
import com.neusoft.coursemall.courses.service.CourseAttrService;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.common.utils.R;



/**
 * 课程的属性
 *
 * @author zhangyao
 * @email zhangyao1627@gmail.com
 * @date 2022-07-08 09:38:26
 */
@RestController
@RequestMapping("courses/courseattr")
public class CourseAttrController {
    @Autowired
    private CourseAttrService courseAttrService;

    /**
     * 列表
     */
    @RequestMapping("/list")
//    @RequiresPermissions("courses:courseattr:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = courseAttrService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{attrId}")
 //   @RequiresPermissions("courses:courseattr:info")
    public R info(@PathVariable("attrId") Long attrId){
		CourseAttrEntity courseAttr = courseAttrService.getById(attrId);

        return R.ok().put("courseAttr", courseAttr);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
  //  @RequiresPermissions("courses:courseattr:save")
    public R save(@RequestBody CourseAttrEntity courseAttr){
		courseAttrService.save(courseAttr);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
  //  @RequiresPermissions("courses:courseattr:update")
    public R update(@RequestBody CourseAttrEntity courseAttr){
		courseAttrService.updateById(courseAttr);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
  //  @RequiresPermissions("courses:courseattr:delete")
    public R delete(@RequestBody Long[] attrIds){
		courseAttrService.removeByIds(Arrays.asList(attrIds));

        return R.ok();
    }

}
