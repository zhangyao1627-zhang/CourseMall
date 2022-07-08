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

import com.neusoft.coursemall.courses.entity.CourseSkuImagesEntity;
import com.neusoft.coursemall.courses.service.CourseSkuImagesService;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.common.utils.R;



/**
 * 简介的一些图片
 *
 * @author zhangyao
 * @email zhangyao1627@gmail.com
 * @date 2022-07-08 09:38:26
 */
@RestController
@RequestMapping("courses/courseskuimages")
public class CourseSkuImagesController {
    @Autowired
    private CourseSkuImagesService courseSkuImagesService;

    /**
     * 列表
     */
    @RequestMapping("/list")
//    @RequiresPermissions("courses:courseskuimages:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = courseSkuImagesService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
 //   @RequiresPermissions("courses:courseskuimages:info")
    public R info(@PathVariable("id") Long id){
		CourseSkuImagesEntity courseSkuImages = courseSkuImagesService.getById(id);

        return R.ok().put("courseSkuImages", courseSkuImages);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
  //  @RequiresPermissions("courses:courseskuimages:save")
    public R save(@RequestBody CourseSkuImagesEntity courseSkuImages){
		courseSkuImagesService.save(courseSkuImages);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
  //  @RequiresPermissions("courses:courseskuimages:update")
    public R update(@RequestBody CourseSkuImagesEntity courseSkuImages){
		courseSkuImagesService.updateById(courseSkuImages);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
  //  @RequiresPermissions("courses:courseskuimages:delete")
    public R delete(@RequestBody Long[] ids){
		courseSkuImagesService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
